public class StudentGradeTest {
    public static void main(String[] args) {
        StudentGrade student1 = new StudentGrade("Alice", 95.5);
        System.out.println(student1.getStudentName() + "'s grade: " + student1.getGrade() + " (" + student1.getLetterGrade() + ")");

        StudentGrade student2 = new StudentGrade("Bob", 82.0);
        System.out.println(student2.getStudentName() + "'s grade: " + student2.getGrade() + " (" + student2.getLetterGrade() + ")");

        StudentGrade student3 = new StudentGrade("Charlie", 68.0);
        System.out.println(student3.getStudentName() + "'s grade: " + student3.getGrade() + " (" + student3.getLetterGrade() + ")");

        student1.setGrade(88.0);
        System.out.println(student1.getStudentName() + "'s new grade: " + student1.getGrade() + " (" + student1.getLetterGrade() + ")");
    }

}
