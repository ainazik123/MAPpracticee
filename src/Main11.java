import java.util.*;

public class Main11 {
    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 92);
        scores.put("Diana", 78);

        int maxScore = Integer.MIN_VALUE;
        List<String> maxScorers = new ArrayList<>();


        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            int score = entry.getValue();
            String name = entry.getKey();

            if (score > maxScore) {
                maxScore = score;
                maxScorers.clear();
                maxScorers.add(name);
            } else if (score == maxScore) {
                maxScorers.add(name);
            }
        }

        System.out.println("Max score: " + maxScore);
        System.out.println("Achieved by: " + maxScorers);
    }
}
