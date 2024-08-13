const express = require('express');
const mongoose = require('mongoose');
const stu = require('./students');
const bodyParser = require('body-parser');


mongoose.connect("mongodb+srv://Gohel_Neel:Neel%40123@cluster0.ndexd.mongodb.net/Student_info")
    .then(()=>{
        const app = express();
        console.log("Connected");
        app.use(bodyParser.urlencoded);

        app.get('/home' , async (req,res)=>{
            const ans  = await students.find();
            res.send(ans);
        });


        app.listen(3000 , ()=>{
            console.log("server started @ 3000")
        });
    });