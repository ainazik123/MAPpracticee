import java.util.*;

public class Main12 {
    public static void main(String[] args) {
        String text = "Java is fun and Java is powerful and fun";
        String[] words = text.toLowerCase().split(" ");
        Map<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
