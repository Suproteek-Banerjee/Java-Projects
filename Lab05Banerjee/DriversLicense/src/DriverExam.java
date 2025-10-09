
import java.util.ArrayList;

public class DriverExam {
    private final char[] correctAnswers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
    private char[] studentAnswers;

    public DriverExam(char[] studentAnswers) {
        this.studentAnswers = studentAnswers;
    }

    public boolean passed() {
        return totalCorrect() >= 15;
    }

    public int totalCorrect() {
        int correctCount = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (studentAnswers[i] == correctAnswers[i]) {
                correctCount++;
            }
        }
        return correctCount;
    }

    public int totalIncorrect() {
        return correctAnswers.length - totalCorrect();
    }

    public int[] questionsMissed() {
        ArrayList<Integer> missed = new ArrayList<>();
        for (int i = 0; i < correctAnswers.length; i++) {
            if (studentAnswers[i] != correctAnswers[i]) {
                missed.add(i + 1);
            }
        }
        int[] missedArray = new int[missed.size()];
        for (int i = 0; i < missed.size(); i++) {
            missedArray[i] = missed.get(i);
        }
        return missedArray;
    }
}
