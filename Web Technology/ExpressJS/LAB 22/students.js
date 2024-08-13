const mongoose = require('mongoose');

const schema = mongoose.Schema({
    _id : mongoose.ObjectId,
    name : String,
    rollNo : Number,    
    sem : Number
});

module.export = mongoose.model("students" , schema)
