const express = require('express');

const app = express();

app.get('/about' , (req,res)=>{
    res.send("About page From Express");
});
app.get('/contact' , (req,res)=>{
    res.send("contact page From Express");
});
app.get('/Home' , (req,res)=>{
    res.send("Home page From Express");
});
app.get('/FeedBack' , (req,res)=>{
    res.send("FeedBack page From Express");
});
app.get('/Mix' , (req,res)=>{
    res.send("Mix page From Express");
});

app.listen(3000 , ()=>{
    console.log("Server Run @ 3000");
});