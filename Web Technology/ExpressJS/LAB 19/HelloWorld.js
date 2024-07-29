const express = require('express');

const app = express();

app.get('/' , (req,res)=>{
    res.send("Hello World From Express");
});

app.listen(3000 , ()=>{
    console.log("Server Run @ 3000");
});