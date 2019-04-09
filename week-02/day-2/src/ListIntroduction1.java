import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListIntroduction1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        int size;
        names.add("William");
        names.add("John");
        names.add("Amanda");
        size = names.size();
        //System.out.println(size);
        //System.out.println(names.get(2));

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "." + names.get(i));
        }

        names.remove(1);


        }


    }




// Create a new arraylist
// ArrayList arrayList = new ArrayList();

//List<String> animals2 = new ArrayList<>();
//String[] animals2 = {"pig", "cow"};

// Add items
// animals.add("Dog");

//System.out.println(animals);
//System.out.println(animals2);