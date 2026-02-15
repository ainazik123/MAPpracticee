import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        HashMap<String, Integer> studentScores = new HashMap<>();


        studentScores.put("Aida", 85);
        studentScores.put("Azat", 92);
        studentScores.put("Dana", 77);


        System.out.println("Map: " + studentScores);


        System.out.println("Size: " + studentScores.size());
    }
}
