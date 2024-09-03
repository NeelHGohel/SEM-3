const mongoose = require('mongoose');

const schma = mongoose.Schema({
    client_id : Number,
    acc_no : Number,
    client_name : String,
    amount_acc : Number
});

module.exports = mongoose.model("clients" , schma,"clients");