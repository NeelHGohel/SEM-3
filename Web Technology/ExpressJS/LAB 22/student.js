const mongoose = require('mongoose');

const schema = mongoose.Schema({
    name : String,
    rollNo : Number,    
    sem : Number
});

module.exports = mongoose.model("students" , schema)
