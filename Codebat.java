import java.util.HashSet;
import java.util.Set;

public class Codebat {

    public static void main(String[] args) {
        Codebat codebat = new Codebat();

        // Run sleepIn method
        boolean resultSleepIn = codebat.sleepIn(false, false);
        System.out.println("sleepIn result: " + resultSleepIn);

        // Run findRepeats method
        int[] array = {9, 7, 2, 5, 3, 8, 4, 1, 7, 6};
        String resultFindRepeats = codebat.findRepeats(array);
        System.out.println("findRepeats result: " + resultFindRepeats);
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public String findRepeats(int[] array) {
        Set<Integer> seen = new HashSet<>();

        for (int num : array) {
            if (!seen.add(num)) {
                return "Repeats found: " + num;
            }
        }

        return "No repeats found";
    }
}
