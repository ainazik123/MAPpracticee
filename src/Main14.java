import java.util.*;

public class Main14 {
    public static void main(String[] args) {
        String[] words = {"hi", "book", "java", "sun", "loop", "map"};
        Map<Integer, ArrayList<String>> lengthMap = new HashMap<>();

        for (String word : words) {
            lengthMap.computeIfAbsent(word.length(), k -> new ArrayList<>()).add(word);
        }

        System.out.println(lengthMap);
    }
}
