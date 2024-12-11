import React from 'react';
import { useNavigate } from "react-router-dom";
import HeaderData from "../data/HeaderData";

const Home = () => {
  const navigate = useNavigate();

  const boxers = [
    { name: 'Muhammad Ali', image: '/muhammad-ali.jpg' },
    { name: 'Mike Tyson', image: '/mike-tyson.jpg' },
    { name: 'Floyd Mayweather', image: '/floyd-mayweather.jpg' },
    { name: 'Gervonta Davis', image: '/gervonta-davis.jpg' },
  ];

  return (
    <div className="min-h-screen flex items-center justify-center p-4">
      <div className="container max-w-4xl mx-auto text-center">
        <h1 className="text-4xl md:text-6xl font-extrabold mb-6 text-red-500 shadow-text">
          {HeaderData.top_name}
        </h1>
        <h2 className="text-2xl md:text-3xl mb-8 text-yellow-400 shadow-text">
          {HeaderData.part_one}
        </h2>
        <div className="grid grid-cols-1 sm:grid-cols-2 gap-4 mb-12">
          <button onClick={() => navigate('/Quiz')} className="btn btn-primary">
            Take the Challenge
          </button>
          <button onClick={() => navigate('/Score')} className="btn btn-secondary">
            View Your Record
          </button>
          <button onClick={() => navigate('/Contact')} className="btn btn-secondary">
            Contact the Ref
          </button>
          <button onClick={() => navigate('/BoxingStats')} className="btn btn-secondary">
            Boxing Stats
          </button>
        </div>
        <div className="mt-8">
          <h3 className="text-xl font-bold mb-6">Featured Legends</h3>
          <div className="flex flex-wrap justify-center gap-8">
            {boxers.map((boxer) => (
              <div key={boxer.name} className="text-center">
                <div className="w-24 h-24 rounded-lg overflow-hidden mb-2 mx-auto border-2 border-yellow-400 shadow-lg">
                  <img 
                    src={boxer.image} 
                    alt={boxer.name}
                    className="w-full h-full object-cover"
                    onError={(e) => {
                      e.target.onerror = null;
                      e.target.src = "/placeholder.svg?height=96&width=96";
                    }}
                  />
                </div>
                <p className="text-xs font-semibold">{boxer.name}</p>
              </div>
            ))}
          </div>
        </div>
      </div>
    </div>
  );
}

export default Home;



