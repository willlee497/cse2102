import React from 'react';
import { useNavigate } from 'react-router-dom';
import { incrementScore, dontIncrementScore, handleSubmit } from '../controller/scoringController';
import my_state from './my_state';
import my_questions from '../model/basic_questions.json';

function Quiz() {
    const [state, setState] = React.useState({ score: 0, count: 0 });
    const navigate = useNavigate();

    const handleDone = () => {
        handleSubmit(state, my_state);
        navigate('/results');
    };

    return (
        <div className="container">
            <h1>UFC Fighters Quiz</h1>
            {my_questions.map((quest) => (
                <div key={quest["id"]}>
                    <h2>{quest["question"]}</h2>
                    {quest["answers"].map((ans, index) => (
                        <div key={index}>
                            <label>
                                <input
                                    type="radio"
                                    name={quest["id"]}
                                    onClick={() =>
                                        ans["isCorrect"]
                                            ? incrementScore(state, setState)
                                            : dontIncrementScore(state, setState)
                                    }
                                    value={ans["isCorrect"]}
                                />
                                {ans["answer"]}
                            </label>
                        </div>
                    ))}
                </div>
            ))}
            <button onClick={handleDone}>Submit Quiz</button>
        </div>
    );
}

export default Quiz;
