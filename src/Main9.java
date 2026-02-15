import java.util.HashMap;
import java.util.Map;

public class Main9 {
    public static void main(String[] args) {

        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Aida", 85);
        studentScores.put("Azat", 92);
        studentScores.put("Dana", 77);

        System.out.println("Keys:");
        for (String key : studentScores.keySet()) {
            System.out.println(key);
        }

        System.out.println("Values:");
        for (Integer value : studentScores.values()) {
            System.out.println(value);
        }

        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

