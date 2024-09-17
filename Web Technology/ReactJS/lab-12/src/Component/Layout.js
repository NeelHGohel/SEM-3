import React from 'react';
import { Link, Outlet } from 'react-router-dom';

function Layout() {
    return (
        <>
            <div className="container">
                <div className="row">
                    <div className="col-12">
                        <nav className="navbar navbar-expand-lg">
                            <div className="container-fluid">
                                <div className="collapse navbar-collapse" id="navbarNav">
                                    <ul className="navbar-nav">
                                        <li className="nav-item">
                                            <Link className="nav-link active" aria-current="page" to="/home">Home</Link>
                                        </li>
                                        <li className="nav-item">
                                            <Link className="nav-link active" to="/about">About</Link>
                                        </li>
                                        <li className="nav-item">
                                            <Link className="nav-link active" to="/contact">Contact</Link>
                                        </li>
                                        <li className="nav-item">
                                            <Link className="nav-link active" to="/service">Services</Link>
                                        </li>
                                        <li className="nav-item">
                                            <Link className="nav-link active" to="/project">Projects</Link>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
            <br />
            <Outlet />
        </>
    );
}

export default Layout;
