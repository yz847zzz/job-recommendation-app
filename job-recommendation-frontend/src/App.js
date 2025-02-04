import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Sidebar from "./components/Sidebar";
import Dashboard from "./pages/Dashboard";
import JobSearchPage from "./pages/JobSearchPage";
import JobDetailsPage from "./pages/JobDetailsPage";
import ApplyJobPage from "./pages/ApplyJobPage";
import NotFound from "./pages/NotFound";

function App() {
    return (
        <Router>
            <div className="app-container">
                <Sidebar />
                <div className="main-content">
                    <Routes>
                        <Route path="/" element={<Dashboard />} />
                        <Route path="/jobs" element={<JobSearchPage />} />
                        <Route path="/jobs/:jobId" element={<JobDetailsPage />} />
                        <Route path="/apply/:jobId" element={<ApplyJobPage />} />
                        <Route path="*" element={<NotFound />} />
                    </Routes>
                </div>
            </div>
        </Router>
    );
}

export default App;
