import java.util.HashMap;

public class Main10 {
    public static void main(String[] args) {

        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Aida", 85);
        studentScores.put("Azat", 92);
        studentScores.put("Dana", 77);
        studentScores.put("Mira", 88);
        studentScores.put("Bek", 70);

        int count = 0;

        for (Integer score : studentScores.values()) {
            if (score >= 80) {
                count++;
            }
        }

        System.out.println("Students with score ≥ 80: " + count);
    }
}

