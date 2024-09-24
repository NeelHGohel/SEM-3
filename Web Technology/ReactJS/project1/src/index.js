import React from 'react';
import ReactDOM from 'react-dom/client';
import {NavBar , Footer} from './Components/Layout'

function Check(){
    return(
        <>
            <NavBar />
            <Footer/>
        </>
    )
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(

    <Check/>
);
