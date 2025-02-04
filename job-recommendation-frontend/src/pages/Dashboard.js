import React from "react";
import SearchBar from "../components/SearchBar";
import Widget from "../components/Widget";
import "./Dashboard.css";

function Dashboard() {
    return (
        <div className="dashboard">
            <h1>Welcome to Job Finder</h1>
            <SearchBar />
            <div className="widget-container">
                <Widget title="Total Jobs" value="1,250" />
                <Widget title="Applied Jobs" value="23" />
                <Widget title="Pending Interviews" value="5" />
            </div>
        </div>
    );
}

export default Dashboard;
