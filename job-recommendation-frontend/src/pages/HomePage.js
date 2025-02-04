import React from "react";
import { Link } from "react-router-dom";

function HomePage() {
    return (
        <div>
            <h1>Welcome to the Job Recommendation System</h1>
            <p>Find and apply for jobs that match your skills.</p>
            <Link to="/jobs">
                <button>Search Jobs</button>
            </Link>
        </div>
    );
}

export default HomePage;
