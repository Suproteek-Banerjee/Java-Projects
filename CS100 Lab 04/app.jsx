import { BrowserRouter, Routes, Route } from "react-router-dom";
import Navbar from "./registration-portal/Components/Navbar";
import Dashboard from "./registration-portal/Pages/Dashboard";
import Schedule from "./registration-portal/Pages/Schedule";
import Discovery from "./registration-portal/Pages/Discovery";

export default function App() {
  return (
    <BrowserRouter>
      <Navbar />
      <div className="p-6">
        <Routes>
          <Route path="/" element={<Dashboard />} />
          <Route path="/schedule" element={<Schedule />} />
          <Route path="/discovery" element={<Discovery />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
}
