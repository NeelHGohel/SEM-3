const express = require('express');
const mongoose = require('mongoose');
const customers = require('./customer');
const bodyParser = require('body-parser');

const connectionstring = "mongodb+srv://Gohel_Neel:Neel%40123@cluster0.ndexd.mongodb.net/";

mongoose.connect(connectionstring).then(()=>{
    const app = express();
    app.use(bodyParser.urlencoded({extended : false}));

    //getAll
    app.get('/customers' , async (req , res)=>{
        const ans = await customers.find();
        res.send(ans);
    });

    //getByID
    app.get('/customers/:customer_id' , async (req , res)=>{
        const ans = await customers.findOne({customer_id : req.params.customer_id});
        res.send(ans);
    });

    //Create
    app.post('/customers' , async (req,res)=>{
        cut = new customers({...req.body});
        const ans  = cut.save();
        res.send(ans); 
    });

    //Update
    app.patch('/customers/:customer_id' , async (req,res) => {
        const cut = await customers.findOne({customer_id:req.params.customer_id});
        cut.customer_name = req.body.customer_name;
        const ans = await cut.save();
        res.send(ans); 
    });


    //Delete
    app.delete('/customers/:customer_id' , async (req,res) => {
        const ans = await customers.deleteOne({customer_id : req.params.customer_id});
        res.send(ans);
    });

    app.listen(3000);
});