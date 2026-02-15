import java.util.*;

public class Main22 {
    public static void main(String[] args) {
        String text = "java is fun and java is powerful and fun";
        String[] words = text.toLowerCase().split(" ");
        Map<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(freq.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Top 2 frequent words:");
        for (int i = 0; i < Math.min(2, entries.size()); i++) {
            System.out.println(entries.get(i).getKey() + ": " + entries.get(i).getValue());
        }
    }
}
