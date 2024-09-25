import { useEffect, useState } from "react"

function DisplayAll() {
    const [Faculty, setFaculty] = useState([]);

    const apiURL = "https://6672c8fa6ca902ae11b1c68c.mockapi.io/Faculty"
    useEffect(() => {
        fetch(apiURL)
            .then((res) => res.json())
            .then((res) => {
                setFaculty(res);
            });
    }, []);

    const fac = Faculty.map((f) => {
        return (
            <>
                <div className="row">
                    <div className="col-2"></div>
                    <div className="col-8">
                        <div class="card" style={{ "width": "18rem" }}>
                            <img src="{f.avatar}" class="card-img-top" alt="..." />
                            <div class="card-body">
                                <h5 class="card-title">{f.name}</h5>
                                <p class="card-text">{f.City}</p>
                                <p class="card-text">{f.MobileNumber}</p>
                                <p class="card-text">{f.id}</p>
                                <a href="#" class="btn btn-primary">Go somewhere</a>
                            </div>
                        </div>
                    </div>
                </div>
            </>
        );
    })
    return (
        <>
            {fac}
        </>
    );

}

export default DisplayAll;