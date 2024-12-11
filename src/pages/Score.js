import React from 'react';
import { useNavigate } from 'react-router-dom';
import my_state from './my_state';

const Score = () => {
  const navigate = useNavigate();
  const score = my_state.my_score;
  const total = my_state.my_count;
  const percentage = (score / total) * 100;

  let message;
  if (percentage === 100) {
    message = "Perfect! You're the undisputed champion of boxing knowledge!";
  } else if (percentage >= 75) {
    message = "Great job! You're a true contender in the ring of boxing trivia!";
  } else if (percentage >= 50) {
    message = "Not bad! You've got the makings of a boxing buff.";
  } else {
    message = "Keep training! Every champion started somewhere.";
  }

  return (
    <div className="container mx-auto px-4 py-8 max-w-4xl text-center">
      <h1 className="text-4xl font-bold mb-6">Your Boxing IQ Score</h1>
      <div className="bg-gray-800 p-8 rounded-lg shadow-lg mb-8">
        <h2 className="text-3xl font-bold mb-4">
          You scored <span className="text-red-500">{score}</span> out of <span className="text-red-500">{total}</span>
        </h2>
        <p className="text-xl mb-4">{message}</p>
        <p className="text-2xl font-bold">
          Percentage: <span className="text-yellow-400">{percentage.toFixed(2)}%</span>
        </p>
      </div>
      <button onClick={() => navigate('/Quiz')} className="btn btn-primary mr-4">Try Again</button>
      <button onClick={() => navigate('/')} className="btn btn-secondary">Back to Home</button>
    </div>
  );
}

export default Score;


