import java.util.HashMap;

public class Main6 {
    public static void main(String[] args) {

        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Aida", 85);
        studentScores.put("Azat", 92);
        studentScores.put("Dana", 77);

        checkStudent(studentScores, "Dana");
        checkStudent(studentScores, "Mira");
        checkStudent(studentScores, "Azat");
    }

    public static void checkStudent(HashMap<String, Integer> map, String name) {
        int score = map.getOrDefault(name, -1);

        if (score == -1) {
            System.out.println(name + ": Not found");
        } else {
            System.out.println(name + ": Score = " + score);
        }
    }
}

