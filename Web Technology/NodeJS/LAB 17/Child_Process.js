const child_process = require('child_process');
const { stdin } = require('process');

// * Multiple Language ne ek sathe bind karva mate
// * code ne ek sub process ma convert karva mate
// * dir aapyu che tya koi language ni file nu name lakhi nakhi pachi ene node ma run karvi  possible che 
child_process.exec('dir' , (err , stdout , stdin)=>{
    console.log(stdout);
});