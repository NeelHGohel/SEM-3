const http = require('http');

server = http.createServer((req , res)=>{
    res.setHeader('Content-Type' , 'text/html');
    if(req.url == 'Favicon.ico'){
        res.end(' ');
    }
    else if(req.url == "/home"){
        res.end("Welcome Home");
    }
    else if(req.url == "/about"){
        res.end("What about you??");
    }
    else if(req.url == "/contact"){
        res.end("contact numbers are");
    }
    else{
        res.end("Welcomeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }
});

server.listen(3200 , ()=>{
    console.log("Server Started at Port 3200");
});