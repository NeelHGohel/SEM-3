const express = require('express');
const fs = require('fs');

const app = express();

app.get('/about' , (req , res)=>{
    fs.readFile('about.txt' , (err,data)=>{
        if(err) throw err;
        res.write(data);
        return res.send();
    });
});

app.get('/home' , (req , res)=>{
    fs.readFile('home.txt' , (err,data)=>{
        if(err) throw err;
        res.write(data);
        return res.send();
    });
});

app.get('/' , (req,res)=>{
    res.send("Hello world");
});

// app.get('/about' , (req,res)=>{
//     const data = fs.readFile('about.txt');
//     res.send(data.toString());
// });

// app.get('/Home' , (req,res)=>{
//     const data = fs.readFile('home.txt');
//     res.send(data.toString());
// });


app.listen(3000 , ()=>{
    console.log("Server Run @ 3000");
});