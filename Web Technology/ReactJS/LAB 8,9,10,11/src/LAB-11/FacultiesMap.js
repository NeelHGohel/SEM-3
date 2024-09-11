function Faculties(){
    const Faculties = [
        {
            Name : "Bala Sir",
            dept : "CE",
            subject : "Web",
            Institute : "DIET"
        },
        {
            Name : "Jadeja sir",
            dept : "CE",
            subject : "DS",
            Institute : "DIET"
        },
        {
            Name : "Dixita MAM",
            dept : "CE",
            subject : "DBMS",
            Institute : "DIET"
        },
        {
            Name : "Punit sir",
            dept : "H&S",
            subject : "Maths",
            Institute : "DIET"
        },
        {
            Name : "Nisarg sir",
            dept : "CE",
            subject : "Web",
            Institute : "DIET"
        }
    ]
    const ans = Faculties.map((fac)=>
            <>
                <h1>Faculty name is { fac.Name }</h1>
                <h2>Faculty dept is { fac.dept } </h2>
                <h3>subject is { fac.subject }</h3>
                <h4>Institute is { fac.Institute }</h4>
            </>
        )
    return(ans)
}

export default Faculties;