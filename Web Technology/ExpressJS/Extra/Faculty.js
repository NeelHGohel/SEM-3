const express = require('express');
const bodyParser = require('body-parser');

const app = express();

app.use(bodyParser.urlencoded());

const Faculty = [
    {
        "Name" : "Dr. Gopi Sanghani",
        "Experience" : 24,
        "Degree" : "Ph.d.",
        "Department" : "Computer"
    },
    {
        "Name" : "Dr. Pradyumansinh Jadeja",
        "Experience" : 19,
        "Degree" : "Ph.d.",
        "Department" : "Computer"
    },
    {
        "Name" : "Prof. Arjun Bala",
        "Experience" : 14,
        "Degree" : "ph.d",
        "Department" : "Computer"
    },
    {
        "Name" : "Prof. Dixita Kagathara",
        "Experience" : 12,
        "Degree" : "Phd",
        "Department" : "Computer"
    },
    {
        "Name" : "abc",
        "Experience" : 12,
        "Degree" : "Phd",
        "Department" : "Computer"
    },
    {
        "Name" : "abc",
        "Experience" : 12,
        "Degree" : "Phd",
        "Department" : "Computer"
    },
    {
        "Name" : "abc",
        "Experience" : 12,
        "Degree" : "Phd",
        "Department" : "Computer"
    },
    {
        "Name" : "abc",
        "Experience" : 12,
        "Degree" : "Phd",
        "Department" : "Computer"
    },
    {
        "Name" : "abc",
        "Experience" : 12,
        "Degree" : "Phd",
        "Department" : "Computer"
    }

]

//getByAll
app.get('/students' , (req,res)=>{
    res.send(students);
});

//getById
app.get('/home/:id' , (req,res)=>{
    const ans = students.findIndex(stu=>(stu.id == req.params.id))
    req.send(ans);
}); 

//Create
app.post('/students' , (req,res)=>{
    students.push(req.body);
    res.send("Student Created");
});

//Update
app.patch('/students/:id' , (req,res)=>{
    const ans = students.findIndex(stu=>(stu.id == req.params.id))
    students[ans] = req.body;
    res.send("Edited");
});

//Delete
app.delete('/students/:id' , (req,res)=>{
    const ans = students.findIndex(stu=>(stu.id == req.params.id))
    students.splice(ans , 1);
    res.send("Deleted");
});

//Running
app.listen(3000 , ()=>{
    console.log("Server running @ 3000")
});