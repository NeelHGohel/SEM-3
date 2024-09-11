function Maps(){
    const name = ["Neel" , "Nitin" , "Nisarg" , "darshan" , "rajkot"];
    const nameElement = name.map((nam)=><h1>Hello from  { nam }</h1>);
    return(nameElement);
}

export default Maps;