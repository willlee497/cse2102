import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Quiz from './components/Quiz';
import Results from './components/Results';
import './App.css'; 

function App() {
    return (
        <Router>
            <div className="App">
                <Routes>
                    {/* Route for the Quiz page */}
                    <Route path="/" element={<Quiz />} />

                    {/* Route for the Results page */}
                    <Route path="/results" element={<Results />} />
                </Routes>
            </div>
        </Router>
    );
}

export default App;
