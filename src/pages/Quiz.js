import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import my_state from './my_state';

const Quiz = () => {
  const navigate = useNavigate();
  const [currentQuestion, setCurrentQuestion] = useState(0);
  const [score, setScore] = useState(0);
  const [showScore, setShowScore] = useState(false);

  const questions = [
    {
      questionText: 'Which boxer is known as "The Greatest"?',
      answerOptions: [
        { answerText: 'Muhammad Ali', isCorrect: true },
        { answerText: 'Mike Tyson', isCorrect: false },
        { answerText: 'Floyd Mayweather', isCorrect: false },
        { answerText: 'Gervonta Davis', isCorrect: false },
      ],
    },
    {
      questionText: 'What is Floyd Mayweather\'s nickname?',
      answerOptions: [
        { answerText: 'Money', isCorrect: true },
        { answerText: 'Pretty Boy', isCorrect: false },
        { answerText: 'The Best Ever', isCorrect: false },
        { answerText: 'Tank', isCorrect: false },
      ],
    },
    {
      questionText: 'Which boxer was known as "Iron Mike"?',
      answerOptions: [
        { answerText: 'Muhammad Ali', isCorrect: false },
        { answerText: 'Mike Tyson', isCorrect: true },
        { answerText: 'Floyd Mayweather', isCorrect: false },
        { answerText: 'Gervonta Davis', isCorrect: false },
      ],
    },
    {
      questionText: 'What is Gervonta Davis\'s nickname?',
      answerOptions: [
        { answerText: 'Tank', isCorrect: true },
        { answerText: 'The Problem', isCorrect: false },
        { answerText: 'Big Time', isCorrect: false },
        { answerText: 'Money', isCorrect: false },
      ],
    },
  ];

  const handleAnswerOptionClick = (isCorrect) => {
    if (isCorrect) {
      setScore(score + 1);
    }

    const nextQuestion = currentQuestion + 1;
    if (nextQuestion < questions.length) {
      setCurrentQuestion(nextQuestion);
    } else {
      setShowScore(true);
      my_state.my_score = score + (isCorrect ? 1 : 0);
      my_state.my_count = questions.length;
    }
  };

  return (
    <div className="container mx-auto px-4 py-8 max-w-4xl">
      {showScore ? (
        <div className="text-center bg-gray-800 p-8 rounded-lg shadow-lg">
          <h2 className="text-3xl font-bold mb-4">Quiz Completed!</h2>
          <p className="text-xl mb-6">You scored {score} out of {questions.length}</p>
          <button onClick={() => navigate('/Score')} className="btn btn-primary mr-4">View Detailed Score</button>
          <button onClick={() => navigate('/')} className="btn btn-secondary">Back to Home</button>
        </div>
      ) : (
        <div className="bg-gray-800 p-6 rounded-lg shadow-lg">
          <h2 className="text-2xl font-bold mb-6 text-center">
            Question {currentQuestion + 1}/{questions.length}
          </h2>
          <p className="text-xl mb-8 text-center">{questions[currentQuestion].questionText}</p>
          <div className="space-y-4">
            {questions[currentQuestion].answerOptions.map((answerOption, index) => (
              <button
                key={index}
                onClick={() => handleAnswerOptionClick(answerOption.isCorrect)}
                className="btn btn-secondary text-left p-4 w-full"
              >
                {answerOption.answerText}
              </button>
            ))}
          </div>
        </div>
      )}
    </div>
  );
}

export default Quiz;




