import React, { useState, useEffect } from "react";
import { useParams, Link } from "react-router-dom";
import axios from "axios";

function JobDetailsPage() {
    const { jobId } = useParams();
    const [job, setJob] = useState(null);

    useEffect(() => {
        axios.get(`http://localhost:8080/api/jobs/${jobId}`)
            .then(response => setJob(response.data))
            .catch(error => console.error("Error fetching job details:", error));
    }, [jobId]);

    if (!job) return <h2>Loading job details...</h2>;

    return (
        <div>
            <h1>{job.title}</h1>
            <p><strong>Company:</strong> {job.company}</p>
            <p><strong>Location:</strong> {job.location}</p>
            <p><strong>Description:</strong> {job.description}</p>
            <p><strong>Salary:</strong> ${job.salary}</p>

            <Link to={`/apply/${job.id}`}>
                <button>Apply Now</button>
            </Link>
        </div>
    );
}

export default JobDetailsPage;
