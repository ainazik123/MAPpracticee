import java.util.*;

public class Main21 {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 70);
        studentScores.put("Charlie", 85);
        studentScores.put("Diana", 70);
        studentScores.put("Eve", 90);

        Map<Integer, List<String>> scoreToStudents = new HashMap<>();
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            scoreToStudents
                    .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                    .add(entry.getKey());
        }

        System.out.println("Score → Students: " + scoreToStudents);
    }
}
