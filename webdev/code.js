const{createClient} = supabase;
const supabase_url = "https://gybwytwokqtgckwsflno.supabase.co"
const supabase_key = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imd5Ynd5dHdva3F0Z2Nrd3NmbG5vIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MTYyOTE5MjEsImV4cCI6MjAzMTg2NzkyMX0.BzDF2sKeSq4EcmKzUQyRiiTLYEshhuP9AngBAaXVQiw"


const connection = createClient(supabase_url, supabase_key)
const storageURL = "https://gybwytwokqtgckwsflno.supabase.co/storage/v1/object/public/item_image/"

// ------------------------------Test Code--------------------------------------------------
async function fetchData() {
    const {data, error} = await connection.from('customer').select();

    if (error) {
        console.error('Error:', error)
    } else {
        console.log('Data:', data)
    }
}

fetchData()


// ------------------------------Back button-------------------------------------------------
function back(){
    console.log("goweng back");
    window.history.back();
}


// ------------------------------Sign Up and Log In JS-------------------------------------------------
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



// ------------------------------Main Page JS--------------------------------------------------
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


//This is the revised displayItem where it can be applied to both display.html and profile.html
//Kung mag lisod kag implement sa CSS sa ani adto sa ubos naay ItemofSeller Func didto.
//I-enable to niya i-follow ang instrcutions naa didto. Naay instructions sa line 377, 391, 403


//UPDATE displayItem added now with modals check out line 654 for the new displayItem
// and line 563 for the modal function. Murag mas sayon na i-css kay ako na gibalhin og modal


// function displayItem(item, includeButton=true) {
//     const itemDisplay = document.getElementById('item_display')

//     const itemDiv = document.createElement('div')
//     itemDiv.classList.add('item')

//     const itemDivinner = document.createElement('div')
//     itemDivinner.classList.add('inner');

//     const itemimg =document.createElement('img');
//     itemimg.src = item.imgurl

//     const name = document.createElement('p')
//     name.textContent = `Name of product: ${item.name}`

//     const price = document.createElement('p')
//     price.textContent = `Price: ${item.price}`

//     const description = document.createElement('p');
//     description.textContent = `Description: ${item.desc}`

//         itemDivinner.appendChild(name)
//         itemDivinner.appendChild(price)
//         itemDivinner.appendChild(description)
//         itemDiv.appendChild(itemimg);
//         itemDiv.appendChild(itemDivinner)
        

//         if(includeButton==true){
//             //Explanation: If includeButton==T, this means that the code is currently being used in display.html
//             //as such it will only have the contact seller button
//             const button =document.createElement('button');
//             button.innerHTML=`contact seller`
//             itemDivinner.appendChild(button);
//         }else{
//             //Otherwise, this would mean that the code is currently being used in profile.html
        
//             //Edit button
//             const button1 =document.createElement('button');
//             button1.innerHTML=`Edit Item`
//             button1.addEventListener('click', () => {
//                 const editForm=document.createElement('form')
//                 editForm.addEventListener('submit', (event) => {
//                     event.preventDefault()
//                     editItem(item)

                    
//                 })
                
//                 const nameLabel=document.createElement('label')
//                 nameLabel.textContent='New name: '
//                 const nameInput=document.createElement('input')
//                 nameInput.type='text'
//                 nameInput.id='Nname'
//                 nameInput.value=item.name
//                 nameLabel.appendChild(nameInput)
//                 editForm.appendChild(nameLabel)
        
//                 const priceLabel=document.createElement('label')
//                 priceLabel.textContent='New price: '
//                 const priceInput=document.createElement('input')
//                 priceInput.type='text'
//                 priceInput.id='Nprice'
//                 priceInput.value=item.price
//                 priceLabel.appendChild(priceInput)
//                 editForm.appendChild(priceLabel)
        
//                 const descLabel=document.createElement('label')
//                 descLabel.textContent='New description: '
//                 const descInput=document.createElement('input')
//                 descInput.type='text'
//                 descInput.id='Ndesc'
//                 descInput.value=item.desc
//                 descLabel.appendChild(descInput)
//                 editForm.appendChild(descLabel)
        
//                 const submitButton=document.createElement('button')
//                 submitButton.type='submit'
//                 submitButton.textContent='Save Changes'
//                 editForm.appendChild(submitButton)
        
                
//                 itemDisplay.replaceChild(editForm, itemDiv)
//             })
        
//             //Delete button
//             const button2 =document.createElement('button')
//             button2.innerHTML=`Delete Item`
//             button2.addEventListener('click', () => {
                
//                 if(!document.getElementById('confirmation')){
//                     const confirmation=document.createElement('p')
//                     confirmation.textContent='Are you sure you want to delete this item?'
//                     confirmation.id='confirmation'

//                     const buttonY=document.createElement('button')
//                     buttonY.innerHTML='Yes'
//                     buttonY.addEventListener('click', () => {
//                         deleteItem(item)
//                     })

//                     const buttonN=document.createElement('button')
//                     buttonN.innerHTML='No'
//                     buttonN.addEventListener('click', () => {
//                         itemDivinner.removeChild(confirmation)
//                         itemDivinner.removeChild(buttonY)
//                         itemDivinner.removeChild(buttonN)
//                     })

//                     itemDivinner.appendChild(confirmation)
//                     itemDivinner.appendChild(buttonY)
//                     itemDivinner.appendChild(buttonN)

//                 }
//             })


//             itemDivinner.appendChild(button1)
//             itemDivinner.appendChild(button2)
//         }

//         itemDisplay.appendChild(itemDiv)
// }



// ------------------------------Seller JS--------------------------------------------------
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


// ------------------------------Profile Page JS--------------------------------------------------
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
            document.getElementById('status').style.display='block'

        }else{
            console.log('mismatch')
            document.getElementById('status').innerHTML="<span style='color:red; font-weight:bold'>Old password does not match</span>"
            document.getElementById('status').style.display='block'
        }
    }
    
}

async function viewitems(){
    const urlParams = new URLSearchParams(window.location.search)
    const userId = urlParams.get('userId')
    clearItems()
    
    const{data, error}=await connection.from('item').select().eq('seller_id',userId)

    data.forEach(item => {
        displayItem(item,false)
        //If you're going to use ItemofSeller function replace
        // displayItem with ItemofSeller(item)
        //Sidenote: Naa kay i-edit sa profile.html aron mu andar ang js naa ray comment didto
    });

    if(error){
        console.log('error: ', error)
    }
    
}

function clearItems() {
    const itemDisplay=document.getElementById('item_display')
    // If you're going to use the ItemofSeller function replace the 
    // const itemDisplay=document.getElementById('item_display') to 
    // const itemDisplay=document.getElementById('item_display_seller')
    //Sidenote: Naa kay i-edit sa profile.html aron mu andar ang js naa ray comment didto
    itemDisplay.innerHTML =''
}





// Explanation: This Function is similar to displayItem but is specifically
// built for the profile page. Kung mag lisod kag implement sa CSS sa katong modified na
// displayItem kani nalang gamita og i-edit. WALA RA KAY ICHANGE ANI NA FUNCTION
//Sidenote: Naa kay i-edit sa profile.html aron mu andar ang js naa ray comment didto

//UPDATE displayItem added now with modals check out line 654 for the new displayItem
// and line 563 for the modal function. Murag mas sayon na i-css kay ako na gibalhin og modal


// function ItemofSeller(item) {
//     const itemDisplay = document.getElementById('item_display_seller')

//     // Create HTML elements to display item information
//     const itemDiv = document.createElement('div')
//     itemDiv.classList.add('item')

//     const itemDivinner = document.createElement('div')
//     itemDivinner.classList.add('inner');

//     //sample only, change if item has an image
//     const itemimg =document.createElement('img');
//     itemimg.src = item.imgurl

//     const name = document.createElement('p')
//     name.textContent = `Name of product: ${item.name}`

//     const price = document.createElement('p')
//     price.textContent = `Price: ${item.price}`

//     const description = document.createElement('p');
//     description.textContent = `Description: ${item.desc}`

//     const button1 =document.createElement('button');
//     button1.innerHTML=`Edit Item`
//     button1.addEventListener('click', () => {
//         const editForm=document.createElement('form')
//         editForm.addEventListener('submit', (event) => {
//             event.preventDefault()
//             editItem(item)


//         })
        
//         const nameLabel=document.createElement('label')
//         nameLabel.textContent='New name: '
//         const nameInput=document.createElement('input')
//         nameInput.type='text'
//         nameInput.id='Nname'
//         nameInput.value=item.name
//         nameLabel.appendChild(nameInput)
//         editForm.appendChild(nameLabel)

//         const priceLabel=document.createElement('label')
//         priceLabel.textContent='New price: '
//         const priceInput=document.createElement('input')
//         priceInput.type='text'
//         priceInput.id='Nprice'
//         priceInput.value=item.price
//         priceLabel.appendChild(priceInput)
//         editForm.appendChild(priceLabel)

//         const descLabel=document.createElement('label')
//         descLabel.textContent='New description: '
//         const descInput=document.createElement('input')
//         descInput.type='text'
//         descInput.id='Ndesc'
//         descInput.value=item.desc
//         descLabel.appendChild(descInput)
//         editForm.appendChild(descLabel)

//         const submitButton=document.createElement('button')
//         submitButton.type='submit'
//         submitButton.textContent='Save Changes'
//         editForm.appendChild(submitButton)

//         // Replace item display with edit form
//         itemDisplay.replaceChild(editForm, itemDiv)
//     })

//     const button2 =document.createElement('button')
//     button2.innerHTML=`Delete Item`
//     button2.addEventListener('click', () => {
        
//         if(!document.getElementById('confirmation')){
//             const confirmation=document.createElement('p')
//             confirmation.textContent='Are you sure you want to delete this item?'
//             confirmation.id='confirmation'

//             const buttonY=document.createElement('button')
//             buttonY.innerHTML='Yes'
//             buttonY.addEventListener('click', () => {
//                 deleteItem(item)
//             })

//             const buttonN=document.createElement('button')
//             buttonN.innerHTML='No'
//             buttonN.addEventListener('click', () => {
//                 itemDivinner.removeChild(confirmation)
//                 itemDivinner.removeChild(buttonY)
//                 itemDivinner.removeChild(buttonN)
//             })

//             itemDivinner.appendChild(confirmation)
//             itemDivinner.appendChild(buttonY)
//             itemDivinner.appendChild(buttonN)

//         }
//     })
   

//     // Append elements to the container
//         itemDivinner.appendChild(name)
//         itemDivinner.appendChild(price)
//         itemDivinner.appendChild(description)
//         itemDivinner.appendChild(button1)
//         itemDivinner.appendChild(button2)
//         itemDiv.appendChild(itemimg)
//         itemDiv.appendChild(itemDivinner)
//         itemDisplay.appendChild(itemDiv)
// }


async function editItem(item){

    var newname=document.getElementById('Nname').value
    var newprice=document.getElementById('Nprice').value
    var newdesc=document.getElementById('Ndesc').value



    const{data, error}=await connection.from('item').update({
        name: newname,
        price: newprice,
        desc: newdesc
    }).eq('item_id', item.item_id)

    if(error){
        console.log('error: ', error)
    }

    location.reload()
}

async function deleteItem(item){

    
    var DELimgurl=item.imgurl
    const pathStartIndex = DELimgurl.indexOf(storageURL) + storageURL.length;
    const dataPath = DELimgurl.substring(pathStartIndex);
   
    const{data: deletedata, error: deleteerror}=await connection.from('item').delete().eq('item_id', item.item_id)
    const{data:bucketdata, error:bucketerror } = await connection.storage.from('item_image').remove([dataPath])
    
    
    
    location.reload()
}


function showModal(type, item){
    const modal = document.createElement('div')
    modal.classList.add('modal')

    const modalContent=document.createElement('div')
    modalContent.classList.add('modal-content')

    const close=document.createElement('span')
    close.classList.add('close')
    close.style.cursor='pointer'
    close.innerHTML='&times'
    close.addEventListener('click', () =>{
        modal.remove()
    })
    modalContent.appendChild(close)

    if(type==='edit'){
        const editForm=document.createElement('form')
        editForm.addEventListener('submit', (event) => {
            event.preventDefault()
            editItem(item)
            modal.remove()

            
        })

        const nameLabel=document.createElement('label')
                nameLabel.textContent='New name: '
                const nameInput=document.createElement('input')
                nameInput.type='text'
                nameInput.id='Nname'
                nameInput.value=item.name
                nameLabel.appendChild(nameInput)
                editForm.appendChild(nameLabel)
        
                const priceLabel=document.createElement('label')
                priceLabel.textContent='New price: '
                const priceInput=document.createElement('input')
                priceInput.type='text'
                priceInput.id='Nprice'
                priceInput.value=item.price
                priceLabel.appendChild(priceInput)
                editForm.appendChild(priceLabel)
        
                const descLabel=document.createElement('label')
                descLabel.textContent='New description: '
                const descInput=document.createElement('input')
                descInput.type='text'
                descInput.id='Ndesc'
                descInput.value=item.desc
                descLabel.appendChild(descInput)
                editForm.appendChild(descLabel)
        
                const submitButton=document.createElement('button')
                submitButton.type='submit'
                submitButton.textContent='Save Changes'
                editForm.appendChild(submitButton)

                modalContent.appendChild(editForm)
    }else if(type==='delete'){
        const confirmation=document.createElement('p')
        confirmation.textContent='Are you sure you want to delete this item?'
        modalContent.appendChild(confirmation)

        const buttonY=document.createElement('button')
        buttonY.innerHTML='Yes'
        buttonY.addEventListener('click', () => {
            deleteItem(item)
            modal.remove()
        })

        const buttonN=document.createElement('button')
        buttonN.innerHTML='No'
        buttonN.addEventListener('click', () => {
            modal.remove()
        })

        modalContent.appendChild(buttonY)
        modalContent.appendChild(buttonN)
    }

    modal.appendChild(modalContent)
    document.body.appendChild(modal)


}






function displayItem(item, includeButton=true) {
    const itemDisplay = document.getElementById('item_display')

    const itemDiv = document.createElement('div')
    itemDiv.classList.add('item')

    const itemDivinner = document.createElement('div')
    itemDivinner.classList.add('inner');

    const itemimg =document.createElement('img');
    itemimg.src = item.imgurl

    const name = document.createElement('p')
    name.textContent = `Name of product: ${item.name}`

    const price = document.createElement('p')
    price.textContent = `Price: ${item.price}`

    const description = document.createElement('p');
    description.textContent = `Description: ${item.desc}`

        itemDivinner.appendChild(name)
        itemDivinner.appendChild(price)
        itemDivinner.appendChild(description)
        itemDiv.appendChild(itemimg);
        itemDiv.appendChild(itemDivinner)
        

        if(includeButton==true){
            //Explanation: If includeButton==T, this means that the code is currently being used in display.html
            //as such it will only have the contact seller button
            const button =document.createElement('button');
            button.innerHTML=`contact seller`
            itemDivinner.appendChild(button);
        }else{
            //Otherwise, this would mean that the code is currently being used in profile.html
        
            //Edit button
            const button1 =document.createElement('button');
            button1.innerHTML=`Edit Item`
            button1.addEventListener('click', () => {
                showModal('edit', item)
            })
        
            //Delete button
            const button2 =document.createElement('button')
            button2.innerHTML=`Delete Item`
            button2.addEventListener('click', () => {
                showModal('delete', item)
            })


            itemDivinner.appendChild(button1)
            itemDivinner.appendChild(button2)
        }

        itemDisplay.appendChild(itemDiv)
}