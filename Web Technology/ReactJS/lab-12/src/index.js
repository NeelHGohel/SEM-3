import React from 'react';
import ReactDOM from 'react-dom/client';
// import Home from './Component/Home';
// import Layout from './Component/Layout';
// import About from './Component/About';
// import Project from './Component/Project';
// import Service from './Component/Service';
// import Contact from './Component/Contact';
//import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Display from './LAB 13/useState';
const root = ReactDOM.createRoot(document.getElementById('root'));

root.render(
    <table style={{"border" : "2px solid red" , "margin-left" : "50px"}}>
        <Display/>
    </table>
    
);









// root.render(
//     <>
//     <BrowserRouter>
//         <Routes>
//             <Route path='/' element = { <Layout/> }>
//                 <Route path='Home' element = { <Home/> }></Route>
//                 <Route path='About' element = { <About/> }></Route>
//                 <Route path='Contact' element = { <Contact/> }></Route>
//                 <Route path='Project' element = { <Project/> }></Route>
//                 <Route path='Service' element = { <Service/> }></Route>
//             </Route>
            
//         </Routes>
//     </BrowserRouter>
//     </>
// );