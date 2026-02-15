import java.util.*;

public class Main15 {
    public static void main(String[] args) {
        String text = "swiss";
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : text.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        char firstNonRepeating = ' ';
        for (char c : text.toCharArray()) {
            if (freq.get(c) == 1) {
                firstNonRepeating = c;
                break;
            }
        }

        if (firstNonRepeating != ' ') {
            System.out.println(firstNonRepeating);
        } else {
            System.out.println("None");
        }
    }
}
