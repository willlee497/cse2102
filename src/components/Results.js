import React, { useEffect, useState } from 'react';
import { useNavigate } from 'react-router-dom';

function Results() {
    const [score, setScore] = useState(0);
    const [count, setCount] = useState(0);
    const navigate = useNavigate();

    useEffect(() => {
        const savedScore = localStorage.getItem('score') || 0;
        const savedCount = localStorage.getItem('count') || 0;

        setScore(savedScore);
        setCount(savedCount);
    }, []);

    return (
        <div className="container">
            <h1>UFC Quiz Results</h1>
            <div className="results">
                <p>Your Score: {score}</p>
                <p>Total Questions: {count}</p>
            </div>
            <button onClick={() => navigate('/')}>Take Quiz Again</button>
        </div>
    );
}

export default Results;
