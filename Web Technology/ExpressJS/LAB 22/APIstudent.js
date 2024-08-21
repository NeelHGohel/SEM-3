const express = require('express');
const mongoose = require('mongoose');
const students = require('./student');
const bodyParser = require('body-parser');

const connectionstring = "mongodb+srv://Gohel_Neel:Neel%40123@cluster0.ndexd.mongodb.net/Student_info"; 
mongoose.connect(connectionstring)
    .then(()=>{
        const app = express();
        console.log("Connected");
        app.use(bodyParser.urlencoded({extended:false}));

        //getAll
        app.get('/students' , async (req,res)=>{
            const ans  = await students.find();
            res.send(ans);
        });

        // getByID
        app.get('/students/:rollNo' , async (req,res)=>{
            const ans  = await students.findOne({rollNo:req.params.rollNo});
            res.send(ans);
        });

        //Create
        app.post('/students' , async (req,res)=>{
            stu = new students({...req.body});
            const ans  = await stu.save();
            res.send(ans);
        });

        //Update
        app.patch('/students/:rollNo' , async (req,res)=>{
            const stu = await students.findOne({rollNo:req.params.rollNo});
            stu.name = req.body.name;
            const ans = await stu.save();
            res.send(ans);
        });

        //Delete
        app.delete('/students/:rollNo' , async (req,res)=>{
            const ans  = await students.deleteOne({rollNo:req.params.rollNo});
            res.send(ans);
        });

        // //Search
        // app.get('/students/search/:text', async (req,res)=>{
        //     ans = await students.find({
        //         name:{
        //             $regex : req.params.text
        //         }
        //     });
        //     res.send();
        // });

        app.listen(3000 , ()=>{
            console.log("server started @ 3000")
        });
    });