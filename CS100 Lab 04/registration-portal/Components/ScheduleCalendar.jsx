export default function ScheduleCalendar({ schedule }) {
  return (
    <div className="p-6 bg-white rounded-lg shadow border">
      <h3 className="font-semibold mb-2">Weekly Calendar</h3>
      {schedule.length === 0 ? (
        <p className="text-gray-500 text-sm">No courses added yet.</p>
      ) : (
        <ul className="space-y-2">
          {schedule.map((course, idx) => (
            <li key={idx} className="p-2 bg-gray-100 rounded">
              {course.code} - {course.time}
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}
