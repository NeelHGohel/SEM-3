const express = require('express');
const mongoose = require('mongoose');
const clients = require('./clients');
const bodyParser = require('body-parser');

const connectionstring = "mongodb+srv://Gohel_Neel:Neel%40123@cluster0.ndexd.mongodb.net/Bank_Management"

mongoose.connect(connectionstring)
    .then(()=>{
        const app = express();
        app.use(express.json())
        app.use(bodyParser.urlencoded({extended : false}));
        
        //getAll
        app.get('/clients', async (req,res)=>{
            const ans = await clients.find();
            res.send(ans);
        });

        //getById
        app.get('/clients/:id' , async (req , res)=>{
            const ans = await clients.findOne({client_id : req.params.client_id});
            res.send(ans);
        });

        //Create
        app.post('/clients' , async (req,res)=>{
            cli = new clients({...req.body});
            const ans  = await cli.save();
            res.send(ans); 
        });

        //Update
        app.patch('/clients/:id' , async (req,res) => {
            const cli = await clients.findOne({client_id:req.params.client_id});
            cli.client_name = req.body.client_name;
            const ans = await cli.save();
            res.send(ans); 
        });


        //Delete
        app.delete('/clients/:id' , async (req,res) => {
            const ans = await clients.deleteOne({client_id : req.params.client_id});
            res.send(ans);
        });

        app.listen(3000);
});