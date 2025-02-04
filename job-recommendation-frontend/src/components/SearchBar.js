import React, { useState } from "react";
import "./SearchBar.css";

function SearchBar() {
    const [query, setQuery] = useState("");

    return (
        <div className="search-bar">
            <input
                type="text"
                placeholder="Search for jobs..."
                value={query}
                onChange={(e) => setQuery(e.target.value)}
            />
            <button>Search</button>
        </div>
    );
}

export default SearchBar;
