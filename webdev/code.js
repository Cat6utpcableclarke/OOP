const{createClient} = supabase;
const supabase_url = "https://gybwytwokqtgckwsflno.supabase.co"
const supabase_key = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imd5Ynd5dHdva3F0Z2Nrd3NmbG5vIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MTYyOTE5MjEsImV4cCI6MjAzMTg2NzkyMX0.BzDF2sKeSq4EcmKzUQyRiiTLYEshhuP9AngBAaXVQiw"


const connection = createClient(supabase_url, supabase_key)
const storageURL = "https://gybwytwokqtgckwsflno.supabase.co/storage/v1/object/public/item_image/"

// test code
async function fetchData() {
    const {data, error} = await connection.from('customer').select();

    if (error) {
        console.error('Error:', error)
    } else {
        console.log('Data:', data)
    }
}

fetchData()



//sign up and log in page js
async function addacc(){
    var name=document.getElementById("name").value
    var year=Number(document.getElementById("year").value)
    var course=document.getElementById("course").value
    var email=document.getElementById("email").value
    var pass=document.getElementById("pass").value

    const{data,error}=await connection.from('customer').insert({
        name:name,
        year:year,
        course:course,
        password:pass,
        email:email
    }).select('cus_id')

    if (error) {
        console.error('Error:', error)
    } else {
        console.log('Insert successful:', data)
        const userId=data[0].cus_id
        window.location.href = `mainpage.html?userId=${userId}` 
    }

}

async function existornot(){
    var email=document.getElementById("login-email").value
    var pass=document.getElementById("login-pass").value

    const{data,error}=await connection.from('customer').select('cus_id, email, password').eq('email',email).eq('password',pass)

    if (data.length > 0) {
        const userId=data[0].cus_id
        window.location.href = `mainpage.html?userId=${userId}`
    } else {
        alert('Either wrong password or email.')
      
    }
}



//main page js
async function autosort(type){
    const urlParams = new URLSearchParams(window.location.search)
    const userId = urlParams.get('userId')
    window.location.href = `display.html?type=${type}&userId=${userId}&`
}

document.addEventListener('DOMContentLoaded', () => {
    
    const urlParams = new URLSearchParams(window.location.search)
    const itemType = urlParams.get('type')
   

    
    fetchItems(itemType)
});

async function fetchItems(itemType) {
    const{data, error}=await connection.from('item').select().eq('type',itemType)

   
    data.forEach(item => {
        displayItem(item)
    });
}


function displayItem(item) {
    const itemDisplay = document.getElementById('item_display')

    // Create HTML elements to display item information
    const itemDiv = document.createElement('div')
    itemDiv.classList.add('item')

    const itemDivinner = document.createElement('div')
    itemDivinner.classList.add('inner');

    //sample only, change if item has an image
    const itemimg =document.createElement('img');
    itemimg.src = item.imgurl
    //assuming naa nay page mo view sa item detail w/ seller contact, change lang kung unsa imo trippings
    const button =document.createElement('button');
    button.innerHTML=`contact seller`

    const name = document.createElement('p')
    name.textContent = `Name of product: ${item.name}`

    const price = document.createElement('p')
    price.textContent = `Price: ${item.price}`

    const description = document.createElement('p');
    description.textContent = `Description: ${item.desc}`

   

    // Append elements to the container
        itemDivinner.appendChild(name)
        itemDivinner.appendChild(price)
        itemDivinner.appendChild(description)
        itemDivinner.appendChild(button);
        itemDiv.appendChild(itemimg);
        itemDiv.appendChild(itemDivinner)
        itemDisplay.appendChild(itemDiv)
}



//seller
async function sell(){
    const urlParams = new URLSearchParams(window.location.search)
    const userId = urlParams.get('userId')
    window.location.href = `sell.html?userId=${userId}`
}

async function submitItem(){
    var name=document.getElementById("itm_name").value;
    var desc=document.getElementById("itm_desc").value;
    var price=document.getElementById("itm_prc").value;
    var type=document.querySelector('input[name="choice"]:checked').value;
    const imageFile=document.getElementById("itm_image").files[0];
    

    const{data,error}=await connection.storage.from('item_image').upload(imageFile.name, imageFile)
    console.log("test select",data)
    const imageURL=`${storageURL}${data.path}`

    const urlParams = new URLSearchParams(window.location.search)
    const userId = urlParams.get('userId')

    const{data: insertData,error: insertError}=await connection.from('item').insert({
        name:name,
        price:price,
        desc:desc,
        type:type,
        seller_id:userId,
        imgurl:imageURL
    })

    if (insertError) {
        console.error('Error inserting item:', insertError);
        return;
    }

    console.log('Item inserted successfully:', insertData);
    alert("Item successfully posted")
    
}


//profile page
async function profile(){
    const urlParams = new URLSearchParams(window.location.search)
    const userId = urlParams.get('userId')
    window.location.href = `profile.html?userId=${userId}`
}


async function displayuser(){
    const urlParams = new URLSearchParams(window.location.search)
    const userId = urlParams.get('userId')

    const{data, error}=await connection.from('customer').select().eq('cus_id', userId).single()

    if(data){
        document.getElementById('name').textContent=`Name: ${data.name}`
        document.getElementById('email').textContent=`Email: ${data.email}`
        document.getElementById('year').textContent=`Year: ${data.year}`
        document.getElementById('course').textContent=`Course: ${data.course}`
    }

    if (error) {
        console.error('Error fetching user details:', error)
    }

}

function changeuserinfo(){
    document.getElementById('user-info').style.display='none'
    document.getElementById('edit-info').style.display='block'

    document.getElementById('email2').textContent=document.getElementById('email').textContent.split(': ')[1]
    document.getElementById('new-name').value=document.getElementById('name').textContent.split(': ')[1]
    document.getElementById('new-year').value=document.getElementById('year').textContent.split(': ')[1]
    document.getElementById('new-course').value=document.getElementById('course').textContent.split(': ')[1]

}

async function savenewinfo(){
    const urlParams = new URLSearchParams(window.location.search)
    const userId = urlParams.get('userId')

    var Nname=document.getElementById('new-name').value
    var Nyear=document.getElementById('new-year').value
    var Ncourse=document.getElementById('new-course').value

    
    const{data, error}=await connection.from('customer').update({
        name: Nname,
        year: Nyear,
        course: Ncourse
    }).eq('cus_id', userId)

    if (error){
        console.log('Error: ', error)
    }


    document.getElementById('user-info').style.display='block'
    document.getElementById('edit-info').style.display='none'

    document.getElementById('name').textContent=`Name: ${Nname}`
    document.getElementById('year').textContent=`Year: ${Nyear}`
    document.getElementById('course').textContent=`Course: ${Ncourse}`
}

async function changepassword(){
    const urlParams = new URLSearchParams(window.location.search)
    const userId = urlParams.get('userId')
    var oldpass=document.getElementById('oldpass').value
    var newpass=document.getElementById('newpass').value

    const{data, error}=await connection.from('customer').select().eq('cus_id', userId).single()

    if(data){
        var dbpass=data.password

        if(dbpass==oldpass){
            console.log('pass match')

            const{data, error}=await connection.from('customer').update({
                password: newpass
            }).eq('cus_id', userId)

            oldpass=document.getElementById('oldpass').value=''
            newpass=document.getElementById('newpass').value=''
            document.getElementById('status').innerHTML="Change successful"

        }else{
            document.getElementById('status').innerHTML="<span style='color:red; font-weight:bold'>Old password does not match</span>"
        }
    }
    
}

async function viewitems(){
    
}