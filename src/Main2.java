import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {

        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Aida", 85);
        studentScores.put("Azat", 92);
        studentScores.put("Dana", 77);

        Integer aidaScore = studentScores.get("Aida");
        if (aidaScore != null) {
            System.out.println("Aida found. Score: " + aidaScore);
        } else {
            System.out.println("Aida not found.");
        }

        if (studentScores.containsKey("Mira")) {
            System.out.println("Mira found. Score: " + studentScores.get("Mira"));
        } else {
            System.out.println("Mira not found.");
        }
    }
}

