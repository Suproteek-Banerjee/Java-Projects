import { useState } from "react";
import ScheduleCalendar from "../Components/ScheduleCalendar";
import { Input } from "../components/Input"; // If custom
import { courses } from "../data/courses";

export default function Schedule() {
  const [schedule, setSchedule] = useState([]);

  const addCourse = (course) => {
    setSchedule([...schedule, course]);
  };

  return (
    <div>
      <h1 className="text-2xl font-bold mb-4">📅 Schedule Builder</h1>
      <div className="grid grid-cols-2 gap-6">
        <div>
          <h3 className="font-semibold mb-2">Available Courses</h3>
          {courses.map((c, idx) => (
            <div key={idx} className="mb-2">
              <button
                className="bg-blue-500 text-white px-3 py-1 rounded"
                onClick={() => addCourse(c)}
              >
                Add {c.code}
              </button>
            </div>
          ))}
        </div>
        <ScheduleCalendar schedule={schedule} />
      </div>
    </div>
  );
}
