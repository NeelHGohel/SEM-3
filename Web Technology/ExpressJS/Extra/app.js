const express = require('express');
const app = express();

const student = [
    {
        "id": "0",
        "name": "Neel Gohel",
        "bklog" : "0"  
    },
    {
        "id": "1",
        "name": "Arjun Bala",
        "bklog" : "0" 
    },
    {
        "id": "2",
        "name": "Nisarg",
        "bklog" : "0"
    }
];

app.post('/home' , (req,res)=>{
    res.json(student);
});

app.post('/home/:id' , (req,res)=>{
    res.send(student[req.params.id])
});

app.get('/home' , (req,res)=>{
    res.json(student);
});

app.get('/home/:id' , (req,res)=>{
    res.send(student[req.params.id])
});


app.listen(3000 , ()=>{
    console.log("Server running @ 3000")
});