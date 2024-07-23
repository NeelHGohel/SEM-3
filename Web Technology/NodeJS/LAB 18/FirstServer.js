const http = require('http');

server = http.createServer((req , res)=>{
    res.end("Hello World from my first web server");
});
console.log("Server Started");
server.listen(3000);