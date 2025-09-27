import { Link } from "react-router-dom";

export default function Navbar() {
  return (
    <nav className="bg-blue-600 text-white p-4 flex justify-around font-semibold">
      <Link to="/">Dashboard</Link>
      <Link to="/schedule">Schedule Builder</Link>
      <Link to="/discovery">Course Discovery</Link>
    </nav>
  );
}
