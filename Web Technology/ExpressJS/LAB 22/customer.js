const mongoose  = require('mongoose');

const schma = mongoose.Schema({
    customer_id : Number,
    customer_name : String,
    order_item : String,
    no_of_item : Number,
    table_no : Number,
    category : String
});

module.exports = mongoose.model("customers" , schma);