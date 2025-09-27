import { useState } from "react";
import { courses } from "../data/courses";
import CourseCard from "../Components/CourseCard";

export default function Discovery() {
  const [schedule, setSchedule] = useState([]);

  const addCourse = (course) => {
    setSchedule([...schedule, course]);
  };

  return (
    <div>
      <h1 className="text-2xl font-bold mb-4">🔍 Course Discovery</h1>
      <div className="grid gap-4">
        {courses.map((c, idx) => (
          <CourseCard key={idx} course={c} onAdd={addCourse} />
        ))}
      </div>
    </div>
  );
}
