import java.util.HashMap;
public class MapIntroduction {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        //System.out.println(map.isEmpty());
        map.put(97, "a");
        map.put(98, "b");
        map.put(99, "c");
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }
        for (String value : map.values()) {
            System.out.println(value);
        }

        map.put(68, "D");

        System.out.println(map.get(99));

        map.remove(97, "a");
        System.out.println(map.keySet());
        System.out.println(map.values());



    }
}