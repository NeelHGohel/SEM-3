const express = require('express');

const app = express();

const students = ['Neel','Gohel','Darshan','Rajkot','Gujrat','India'];

//getByAll
app.get('/students' , (req,res)=>{
    res.send(students);
});

//getById
app.get('/home/:id' , (req,res)=>{
    res.send(student[req.params.id])
});

//Create
app.post('/students/:name' , (req,res)=>{
    students.push(req.params.name);
    res.send("Student Added");
});

//Update
app.patch('/students/:index/:newname',(req,res)=>{
    const {index,newname} = req.params;
    students[index] = newname;
    res.send("Student Edited");
});

//Delete
app.delete('/students/:index' , (req,res)=>{
    students.splice(req.params.index , 1);
    res.send("Student Deleted");
});

//Running
app.listen(3000 , ()=>{
    console.log("Server running @ 3000")
});