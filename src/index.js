import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter, Routes, Route } from "react-router-dom";

import Home from "./pages/Home";
import Quiz from "./pages/Quiz";
import Score from "./pages/Score";
import Contact from "./pages/Contact";
import BoxingStats from "./pages/BoxingStats";
import NoPage from "./pages/NoPage";

import './index.css';

const root = ReactDOM.createRoot(document.getElementById('root'));

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/Quiz" element={<Quiz />} />
        <Route path="/Score" element={<Score />} />
        <Route path="/Contact" element={<Contact />} />
        <Route path="/BoxingStats" element={<BoxingStats />} />
        <Route path="*" element={<NoPage />} />
      </Routes>
    </BrowserRouter>
  );
}

root.render(<App />);

