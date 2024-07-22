const path = require('path');

const filepath = ('D:\\College Programs\\SEM 3\\Web Technology');

console.log(path.normalize(filepath));

console.log(path.join('NodeJS' , 'LAb 17'));

console.log(path.resolve('/LAB 17/Path.js'));

console.log(path.relative('/LAB 17/Path.js' , '/NodeJS/LAB 17'));

console.log(path.dirname(filepath));

console.log(path.basename(filepath));

console.log(path.extname('/NodeJS/LAB 17/Path.js'));
