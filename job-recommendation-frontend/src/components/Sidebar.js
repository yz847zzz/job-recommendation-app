import React from "react";
import { Link } from "react-router-dom";
import "./Sidebar.css"; // Add CSS styles

function Sidebar() {
    return (
        <div className="sidebar">
            <h2>Job Finder</h2>
            <ul>
                <li><Link to="/">Dashboard</Link></li>
                <li><Link to="/jobs">Search Jobs</Link></li>
                <li><Link to="/profile">Profile</Link></li>
            </ul>
        </div>
    );
}

export default Sidebar;
