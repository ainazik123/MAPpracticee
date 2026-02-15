import java.util.HashMap;

public class Main7 {
    public static void main(String[] args) {

        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Aida", 85);
        studentScores.put("Azat", 92);
        studentScores.put("Dana", 77);

        Integer resultAida = studentScores.putIfAbsent("Aida", 90);
        Integer resultMira = studentScores.putIfAbsent("Mira", 88);

        System.out.println("Result for Aida: " + resultAida);
        System.out.println("Result for Mira: " + resultMira);
        System.out.println("Final map: " + studentScores);
    }
}
