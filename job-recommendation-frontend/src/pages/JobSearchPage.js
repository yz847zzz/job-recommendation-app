import React, { useState, useEffect } from "react";

function JobSearchPage() {
    const [jobs, setJobs] = useState([]);

    const fetchJobs = async () => {
        const response = await fetch("/api/jobs");
        const data = await response.json();
        setJobs(data);
    };

    useEffect(() => {
        fetchJobs();
    }, []); // ✅ Fix: Add `fetchJobs` to the dependency array.

    return (
        <div>
            <h1>Job Search</h1>
            <ul>
                {jobs.map((job) => (
                    <li key={job.id}>{job.title}</li>
                ))}
            </ul>
        </div>
    );
}

export default JobSearchPage;
