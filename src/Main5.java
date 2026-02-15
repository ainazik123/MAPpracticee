import java.util.HashMap;

public class Main5 {
    public static void main(String[] args) {

        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Aida", 85);
        studentScores.put("Azat", 92);
        studentScores.put("Dana", 77);

        System.out.println("Is empty before clear: " + studentScores.isEmpty());

        studentScores.clear();

        System.out.println("Is empty after clear: " + studentScores.isEmpty());

        studentScores.put("Mira", 88);
        studentScores.put("Bek", 90);
        studentScores.put("Nurs", 75);

        System.out.println("Map after reinserting: " + studentScores);
    }
}

