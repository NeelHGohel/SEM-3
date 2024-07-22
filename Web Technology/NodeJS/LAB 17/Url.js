const url= require('url');

// * given url no badho data aapi de
// * parse ek j method imp che 

path = "https://darshan.ac.in/";

q = url.parse(path , true);

console.log(q);

//Je data joto hoi te get kari sakai
console.log(q.hostname);