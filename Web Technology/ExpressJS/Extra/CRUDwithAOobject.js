const express = require('express');
const bodyParser = require('body-parser');

const app = express();

app.use(bodyParser.urlencoded());

const students = [
    {
        id:23010101083,
        name:'devansh',
        email:'devansh@darshan.ac.in',
        age:26
    },
    {
        id:23010101291,
        name:'deep',
        email:'deep@darshan.ac.in',
        age:62
    },
    {
        id:23010101089,
        name:'Neel',
        email:'Neel@darshan.ac.in',
        age:19
    },
    {
        id:23010101058,
        name:'Jineeeeeeeeeeeeeeeeeeesh',
        email:'Jineesh@darshan.ac.in',
        age:23
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