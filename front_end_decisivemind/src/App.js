import './App.css';
import {
  BrowserRouter,
  Routes,
  Route,
} from "react-router-dom";

import DashboardPage from './pages/Dashboard';
import ResultPage from './pages/Result';


function App() {
  return (
    <div className="min-h-full h-screen flex items-center justify-center py-12 px-4 sm:px-20 lg:px-8">
    <div className="max-w-md w-full space-y-8">
     <BrowserRouter>
        <Routes>
            <Route path="/" element={<DashboardPage/>} />
            <Route path="/result" element={<ResultPage/>} />
       
        </Routes>
      </BrowserRouter>
    </div>
  </div>
  );
}

export default App;