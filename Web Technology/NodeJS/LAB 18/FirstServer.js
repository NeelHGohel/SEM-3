const http = require('http');

server = http.createServer((req , res)=>{
    res.end("Hello World from my first web server ");
});

server.listen(3200 , ()=>{
    console.log("Server Started at Port 3200");
});