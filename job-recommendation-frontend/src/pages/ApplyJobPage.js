import React, { useState } from "react";
import { useParams, useNavigate } from "react-router-dom";
import axios from "axios";

function ApplyJobPage() {
    const { jobId } = useParams();
    const navigate = useNavigate();
    const [resumeUrl, setResumeUrl] = useState("");

    const applyForJob = async () => {
        try {
            await axios.post(`http://localhost:8080/api/applications`, {
                jobId: jobId,
                userId: 1, // Hardcoded user for now
                resumeUrl: resumeUrl,
            });
            alert("Application submitted successfully!");
            navigate("/jobs");
        } catch (error) {
            console.error("Error applying for job:", error);
        }
    };

    return (
        <div>
            <h1>Apply for Job</h1>
            <input
                type="text"
                placeholder="Resume URL (Google Drive, Dropbox, etc.)"
                value={resumeUrl}
                onChange={(e) => setResumeUrl(e.target.value)}
            />
            <button onClick={applyForJob}>Submit Application</button>
        </div>
    );
}

export default ApplyJobPage;
