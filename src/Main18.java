import java.util.*;

public class Main18 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("c", 3);
        map2.put("a", 1);
        map2.put("b", 2);

        System.out.println("Map1 equals Map2? " + map1.equals(map2));
        System.out.println("Map1 hashCode: " + map1.hashCode());
        System.out.println("Map2 hashCode: " + map2.hashCode());

        map1.entrySet().removeIf(entry -> entry.getValue() % 2 != 0);
        System.out.println("Map1 after removing entries with odd values: " + map1);
    }
}
