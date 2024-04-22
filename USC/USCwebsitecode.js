

const {createClient} = supabase;

const supabase_url="https://ocucpsekpjqfnprkcgrr.supabase.co"
const supabase_key="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Im9jdWNwc2VrcGpxZm5wcmtjZ3JyIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MTM3NjcyOTYsImV4cCI6MjAyOTM0MzI5Nn0.jYTIckmUkuJSIp3QbHiq0A3L1CN9mJF9JUktHSH8ksE"
const connection = createClient(supabase_url, supabase_key)
let storageURL="https://ocucpsekpjqfnprkcgrr.supabase.co/storage/v1/object/public/Images/"




async function test(){
    const IMAGEFILE = document.getElementById("img").files[0];
    console.log("IMAGEFILE",IMAGEFILE.name)
    alert("Working")
    const{data,error} = await connection.storage.from('Images').upload(IMAGEFILE.name, IMAGEFILE)
    console.log("TEST SELECT",data)
    if(!error){
        let node=document.createElement('img')
        node.src=`${storageURL}${data.path}`

        document.body.appendChild(node)
    }
}

async function get(){
    const {data, error} = await connection.storage.from('Images').list('')
    var i=0;
    for(i=0;i<data.length;i++){
        console.log(data)
        let node=document.createElement('img')
        node.src=`${storageURL}${data[i].name}`

        document.body.appendChild(node)

    }
}

get();