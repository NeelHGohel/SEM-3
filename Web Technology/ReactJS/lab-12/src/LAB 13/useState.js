import { useState } from "react";

function Display(){

    const [student , setStudent] = useState([]);
    const [data , setData] = useState({Name: "" , Sem:""});
    const [index, setIndex] = useState();

    const formatedStudent = student.map((stu)=>{
        return(
            <tr>
                <td>{ stu.Name }</td>
                <td>{ stu.Sem }</td>
            </tr>
        )
    })

    return(
        <>
            <div className="p-3 m-5">
                    
                <h1>Name:</h1>
                <input  type="text" value={data.Name} onChange={(e)=>{
                    setData({...data , Name:e.target.value});
                }}/>

                <h1>Sem:</h1>
                <input type="text" value={ data.Sem } onChange={(e)=>{
                    e.preventDefault();
                    setData({...data , Sem:e.target.value});
                }}/>
                <br/>
                <br/>
                <button className="btn btn-primary" onClick={(e)=>{
                    setStudent([...student , data]);
                    setData({Name: "" ,Sem: ""})
                }}>Add</button>
                {formatedStudent}
            </div>
        </>
    );
}

export default Display;