import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListIntroduction2 {
    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));

        ArrayList<String> listB = new ArrayList<>();

        listB.addAll(listA);

        System.out.println(listA.contains("Durian"));

        listA.add(4,"Kiwi");

        if (listB.size() < listA.size()) {
            System.out.println("List A is bigger");
        } else {
            System.out.println("List B is bigger");
        }

        System.out.println(listA.indexOf("Avocado"));

        System.out.println(listB.indexOf("Durian"));

        listB.addAll(Arrays.asList("Passion fruit","Pomelo"));

        System.out.println(listA.get(2));


    }
}


