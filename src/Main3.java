import java.util.HashMap;

public class Main3 {
    public static void main(String[] args) {

        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Aida", 85);
        studentScores.put("Azat", 92);
        studentScores.put("Dana", 77);

        Integer oldValue = studentScores.put("Dana", 80);

        System.out.println("Old value for Dana: " + oldValue);
        System.out.println("Updated map: " + studentScores);
    }
}

