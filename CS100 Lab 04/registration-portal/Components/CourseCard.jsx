export default function CourseCard({ course, onAdd }) {
  return (
    <div className="p-4 border rounded-lg bg-gray-50 shadow-sm">
      <h3 className="font-bold">{course.code} - {course.name}</h3>
      <p className="text-sm text-gray-600">{course.instructor} | {course.time}</p>
      <p className="text-xs text-green-600 mt-1">{course.prerequisite}</p>
      <p className="text-xs text-blue-600">{course.seats} seats | {course.waitlist}</p>
      <button
        className="mt-2 bg-blue-500 text-white px-3 py-1 rounded"
        onClick={() => onAdd(course)}
      >
        Add to Schedule
      </button>
    </div>
  );
}
