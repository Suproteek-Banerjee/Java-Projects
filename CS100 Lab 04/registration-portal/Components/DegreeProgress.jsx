export default function DegreeProgress() {
  return (
    <div className="p-6 bg-white shadow rounded-lg">
      <h2 className="text-xl font-semibold mb-2">Degree Progress</h2>
      <div className="w-full bg-gray-200 rounded-full h-4">
        <div className="bg-green-500 h-4 rounded-full w-2/3"></div>
      </div>
      <p className="text-sm text-gray-600 mt-2">66% Completed</p>
    </div>
  );
}
