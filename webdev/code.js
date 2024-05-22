const{createClient} = supabase;
const supabase_url = "https://gybwytwokqtgckwsflno.supabase.co"
const supabase_key = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imd5Ynd5dHdva3F0Z2Nrd3NmbG5vIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MTYyOTE5MjEsImV4cCI6MjAzMTg2NzkyMX0.BzDF2sKeSq4EcmKzUQyRiiTLYEshhuP9AngBAaXVQiw"


const connection = createClient(supabase_url, supabase_key)


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
    })

    if (error) {
        console.error('Error:', error)
    } else {
        console.log('Insert successful:', data)
        window.location.href = "mainpage.html" 
    }

}

async function existornot(){
    var email=document.getElementById("login-email").value
    var pass=document.getElementById("login-pass").value

    const{data,error}=await connection.from('customer').select('email, password').eq('email',email).eq('password',pass)

    if (data.length > 0) {
        window.location.href = "mainpage.html"
    } else {
        alert('Either wrong password or email.')
      
    }
}



//main page js

async function autosort(type){
    window.location.href = "display.html"

    
}

async function fetchItems() {
    const {data, error} = await connection.from('item').select('*')

   
    data.forEach(item => {
        displayItem(item)
    });
}


function displayItem(item) {
    const itemDisplay = document.getElementById('item_display')

    // Create HTML elements to display item information
    const itemDiv = document.createElement('div')
    itemDiv.classList.add('item')

    const name = document.createElement('p')
    name.textContent = `Name of product: ${item.name}`

    const price = document.createElement('p')
    price.textContent = `Price: ${item.price}`

    const description = document.createElement('p');
    description.textContent = `Description: ${item.desc}`

    // Append elements to the container
    itemDiv.appendChild(name)
    itemDiv.appendChild(price)
    itemDiv.appendChild(description)
    itemDisplay.appendChild(itemDiv)
}
