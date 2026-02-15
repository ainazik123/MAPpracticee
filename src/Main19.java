import java.util.*;

public class Main19 {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 55);
        scores.put("Charlie", 70);
        scores.put("Diana", 50);

        Iterator<Map.Entry<String, Integer>> iter = scores.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() < 60) {
                iter.remove();
            }
        }

        System.out.println("Students with score >= 60: " + scores);
    }
}
