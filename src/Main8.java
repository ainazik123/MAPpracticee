import java.util.HashMap;

public class Main8 {
    public static void main(String[] args) {

        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Aida", 85);
        studentScores.put("Azat", 92);
        studentScores.put("Dana", 77);

        boolean conditionalResult = studentScores.replace("Aida", 85, 86);
        System.out.println("Conditional replace success: " + conditionalResult);
        System.out.println("Map after conditional replace: " + studentScores);

        Integer oldValue = studentScores.replace("Aida", 91);
        System.out.println("Old value from unconditional replace: " + oldValue);
        System.out.println("Map after unconditional replace: " + studentScores);
    }
}
