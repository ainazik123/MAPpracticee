import java.util.HashMap;

public class Main4 {
    public static void main(String[] args) {

        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Aida", 85);
        studentScores.put("Azat", 92);
        studentScores.put("Dana", 77);

        Integer removedAzat = studentScores.remove("Azat");
        if (removedAzat != null) {
            System.out.println("Azat removed successfully. Score was: " + removedAzat);
        } else {
            System.out.println("Azat was not found.");
        }

        Integer removedNonExisting = studentScores.remove("NonExisting");
        if (removedNonExisting != null) {
            System.out.println("NonExisting removed successfully.");
        } else {
            System.out.println("NonExisting was not found.");
        }

        System.out.println("Current map: " + studentScores);
    }
}

