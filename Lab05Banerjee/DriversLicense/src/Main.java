
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] studentAnswers = new char[20];
        String[] questions = {
            "1. Which of the following is the correct way to signal a right turn?",
            "2. What is the maximum speed limit in a residential area unless otherwise posted?",
            "3. When are you allowed to pass another vehicle on the right?",
            "4. When you see a \"STOP\" sign, you must:",
            "5. What does a yellow, flashing light mean?",
            "6. When you are merging onto a freeway, you should:",
            "7. A solid yellow line on your side of the road means:",
            "8. What is the \"two-second rule\"?",
            "9. When you see a school bus with its red lights flashing, you must:",
            "10. What is the first thing you should do if you are involved in an accident?",
            "11. When are you allowed to use your horn?",
            "12. What is the proper way to make a left turn at a four-way stop?",
            "13. When you see a \"YIELD\" sign, you must:",
            "14. What is the best way to avoid hydroplaning?",
            "15. When you are driving in fog, you should use your:",
            "16. What is the \"three-foot rule\"?",
            "17. When you are parallel parking, you should be within how many inches of the curb?",
            "18. What is the \"move over\" law?",
            "19. When you see a \"NO PASSING ZONE\" sign, you must:",
            "20. What is the \"implied consent\" law?"
        };
        String[] options = {
            "A) Extend your left arm straight out.\nB) Extend your left arm out and up.\nC) Extend your left arm out and down.\nD) Use your turn signal.",
            "A) 20 mph.\nB) 25 mph.\nC) 30 mph.\nD) 35 mph.",
            "A) When the vehicle is making a left turn.\nB) On a one-way street.\nC) On a road with two or more lanes in the same direction.\nD) All of the above.",
            "A) Stop completely, then proceed when it is safe.\nB) Slow down and proceed with caution.\nC) Stop only if there is other traffic.\nD) Stop only if you are turning.",
            "A) Stop and wait for the light to turn green.\nB) Slow down and proceed with caution.\nC) The light is about to turn red.\nD) The light is broken.",
            "A) Speed up to match the flow of traffic.\nB) Slow down and wait for an opening.\nC) Stop and wait for an opening.\nD) Expect other drivers to let you in.",
            "A) You are not allowed to pass.\nB) You are allowed to pass.\nC) You are in a no-passing zone.\nD) You are on a one-way street.",
            "A) The amount of time you should look at your mirrors.\nB) The amount of time you should signal before turning.\nC) The amount of following distance you should maintain.\nD) The amount of time it takes to stop your car.",
            "A) Stop, no matter which direction you are traveling in.\nB) Slow down and proceed with caution.\nC) Stop only if you are behind the bus.\nD) Stop only if you are on the same side of the road as the bus.",
            "A) Call your insurance company.\nB) Check for injuries.\nC) Move your car out of traffic.\nD) Exchange information with the other driver.",
            "A) To greet a friend.\nB) To warn other drivers of your presence.\nC) To show your anger.\nD) To get a pedestrian to move.",
            "A) The first car to arrive goes first.\nB) The car on the right goes first.\nC) The car going straight goes first.\nD) The car turning left goes first.",
            "A) Stop completely, then proceed when it is safe.\nB) Slow down and be prepared to stop.\nC) You have the right-of-way.\nD) You must speed up.",
            "A) Drive faster.\nB) Drive slower.\nC) Keep your tires properly inflated.\nD) All of the above.",
            "A) High beams.\nB) Low beams.\nC) Parking lights.\nD) Hazard lights.",
            "A) The amount of space you should leave between your car and a bicycle.\nB) The amount of space you should leave between your car and a motorcycle.\nC) The amount of space you should leave between your car and a pedestrian.\nD) All of the above.",
            "A) 6 inches.\nB) 12 inches.\nC) 18 inches.\nD) 24 inches.",
            "A) You must move over a lane for emergency vehicles.\nB) You must move over a lane for construction workers.\nC) You must move over a lane for tow trucks.\nD) All of the above.",
            "A) Not pass any other vehicles.\nB) Not pass any other vehicles on the left.\nC) Not pass any other vehicles on the right.\nD) Not pass any other vehicles unless it is safe to do so.",
            "A) You agree to a search of your vehicle if you are stopped for a traffic violation.\nB) You agree to a breathalyzer test if you are suspected of drunk driving.\nC) You agree to a blood test if you are suspected of drunk driving.\nD) You agree to a urine test if you are suspected of drunk driving."
        };

        for (int i = 0; i < 20; i++) {
            System.out.println(questions[i]);
            System.out.println(options[i]);
            System.out.print("Enter answer for question " + (i + 1) + ": ");
            String input = scanner.next().toUpperCase();
            while (input.length() != 1 || !"ABCD".contains(input)) {
                System.out.print("Invalid input. Please enter A, B, C, or D: ");
                input = scanner.next().toUpperCase();
            }
            studentAnswers[i] = input.charAt(0);
        }

        DriverExam exam = new DriverExam(studentAnswers);

        System.out.println("\nResults:");
        System.out.println("Passed: " + (exam.passed() ? "Yes" : "No"));
        System.out.println("Total Correct: " + exam.totalCorrect());
        System.out.println("Total Incorrect: " + exam.totalIncorrect());

        int[] missed = exam.questionsMissed();
        if (missed.length > 0) {
            System.out.print("Questions Missed: ");
            for (int i = 0; i < missed.length; i++) {
                System.out.print(missed[i] + (i < missed.length - 1 ? ", " : ""));
            }
            System.out.println();
        }
    }
}
