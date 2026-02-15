import java.util.*;

public class Main17 {
    public static void main(String[] args) {
        String[] items = {"apple","banana","apple","orange","banana","kiwi"};
        Map<String, Integer> freq = new HashMap<>();

        for (String item : items) {
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        }

        System.out.print("Unique items: ");
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();

        System.out.println("Duplicated items:");
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
