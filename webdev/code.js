const{createClient} = supabase;
const supabase_url = "https://gybwytwokqtgckwsflno.supabase.co"
const supabase_key = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imd5Ynd5dHdva3F0Z2Nrd3NmbG5vIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MTYyOTE5MjEsImV4cCI6MjAzMTg2NzkyMX0.BzDF2sKeSq4EcmKzUQyRiiTLYEshhuP9AngBAaXVQiw"


const connection = createClient(supabase_url, supabase_key)


// test code
async function fetchData() {
    const { data, error } = await connection.from('customer').select();

    if (error) {
        console.error('Error:', error);
    } else {
        console.log('Data:', data);
    }
}

fetchData()



async function addacc(){
    var name=document.getElementById("name").value
    var year=Number(document.getElementById("year").value)
    var course=document.getElementById("course").value
    var email=document.getElementById("email").value
    var pass=document.getElementById("pass").value

    const { data, error }=await connection.from('customer').insert({
        name:name,
        year:year,
        course:course,
        password:pass,
        email:email
    })

    if (error) {
        console.error('Error:', error);
    } else {
        console.log('Insert successful:', data);
        window.location.href = "mainpage.html"; // Redirect to the main page
    }

}