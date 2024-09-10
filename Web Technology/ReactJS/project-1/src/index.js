import React from 'react';
import ReactDOM from 'react-dom/client';


function Abc(props){
  let temp = "";

  for(let i = 0 ; i < props.count ; i++){
    temp += props.by;
  }
  return (<h1>{ temp }</h1>);
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(

  <>
      <h1>Hello</h1>
      <Abc count = "5" by = "@"/>
      <h2>World</h2>
      <Abc count = "5" by = "@"/>
      <h3>From</h3>
      <Abc count = "5" by = "@"/>
      <h4>React</h4>
      <Abc count = "5" by = "@"/>
  </>

  

);
