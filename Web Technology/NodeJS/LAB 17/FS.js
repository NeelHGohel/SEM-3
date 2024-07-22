const fs = require('fs');


// *Check given file exist or not
fs.exists('module.js' , (exists)=>{
    console.log(exists ? "Found" : "Not-Found")
});


// *Write on the file
fs.writeFile('myFile.txt', 'Hello World' , (err)=>{
    if (err) throw err;
    console.log('done')
});

// *Append the text on th file 
fs.appendFile('myFile.txt' , 'From NodeJS' , (err)=>{
    if (err) throw err;
    console.log('done')
});


// *Read and return the content of the file and we have to toString that data
fs.readFile('myFile.txt' , (err , data)=>{
    if (err) throw err;
    console.log(data.toString());
});


// *Delete the file
fs.unlink('myFile.txt' , (err)=>{
    if (err) throw err;
    console.log('done')
});