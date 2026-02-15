import java.util.*;

public class Main13 {
    public static void main(String[] args) {
        String text = "Mississippi";
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : text.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character frequencies: " + freq);

        int maxCount = 0;
        List<Character> maxChars = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();
            char ch = entry.getKey();
            if (count > maxCount) {
                maxCount = count;
                maxChars.clear();
                maxChars.add(ch);
            } else if (count == maxCount) {
                maxChars.add(ch);
            }
        }

        System.out.println("Most frequent character(s): " + maxChars + " with count " + maxCount);
    }
}
