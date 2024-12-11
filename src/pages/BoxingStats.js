import React, { useState, useEffect } from 'react';
import { useNavigate } from 'react-router-dom';

const BoxingStats = () => {
  const navigate = useNavigate();
  const [stats, setStats] = useState([]);

  useEffect(() => {
    // Simulating an API call to fetch boxing stats
    const fetchStats = async () => {
      // In a real application, this would be an actual API call
      const dummyStats = [
        { name: "Muhammad Ali", wins: 56, ko: 37 },
        { name: "Mike Tyson", wins: 50, ko: 44 },
        { name: "Floyd Mayweather", wins: 50, ko: 27 },
        { name: "Gervonta Davis", wins: 29, ko: 27 },
      ];
      
      // Simulating network delay
      await new Promise(resolve => setTimeout(resolve, 1000));
      
      setStats(dummyStats);
    };

    fetchStats();
  }, []);

  return (
    <div className="container mx-auto px-4 py-8 max-w-4xl">
      <h1 className="text-4xl font-bold mb-6 text-center">Boxing Stats</h1>
      <div className="bg-gray-800 p-6 rounded-lg shadow-lg">
        {stats.length === 0 ? (
          <p className="text-center">Loading stats...</p>
        ) : (
          <table className="w-full">
            <thead>
              <tr className="text-left border-b border-gray-700">
                <th className="py-2">Name</th>
                <th className="py-2">Wins</th>
                <th className="py-2">KOs</th>
              </tr>
            </thead>
            <tbody>
              {stats.map((boxer, index) => (
                <tr key={index} className="border-b border-gray-700">
                  <td className="py-2">{boxer.name}</td>
                  <td className="py-2">{boxer.wins}</td>
                  <td className="py-2">{boxer.ko}</td>
                </tr>
              ))}
            </tbody>
          </table>
        )}
      </div>
      <div className="mt-6 text-center">
        <button onClick={() => navigate('/')} className="btn btn-secondary">
          Back to Home
        </button>
      </div>
    </div>
  );
};

export default BoxingStats;

