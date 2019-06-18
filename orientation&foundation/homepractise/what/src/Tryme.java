import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Tryme {
    public static void main(String[] args) {
        order("is2 Thi1s T4est 3a");

    }

    public static String order(String words) {
        List<String> slova = new ArrayList<>();
        slova.add(words);
        HashMap<String, Integer> slovaČísla = new HashMap<>();

        for (int i = 0; i < slova.size(); i++) {
            String[] splitted = slova.get(i).split(" ");

    //        if (slova.)
        }
        return "";
    }


}

/*
        HashMap<Integer, String> sortedd = new HashMap<>();

        for (int lines = 0; lines < word.size(); lines++) {
            for (int j = 0; j < word.get(lines).length(); j++) {
                int a = word.get(lines).charAt(j);
                if (word.contains(a)) {

                }
            }

        }
    }*/



        /*
        for (String wordd : word) {
            split = wordd.split(splitter);
            for (int i = 0; i < split.length; i++) {
                if (split[i].contains(i)) {

            }
            }

        }

        for (int lines = 0; lines < split.length; lines++) {
            for (int j = 0; j < split.length; j++) {

                if (hashMap.containsKey(pismeno)){
                    hashMap.put(pismeno, hashMap.get(pismeno)+1);
                } else {
                    hashMap.put(pismeno, 1);
                }
            }
        }
        return"";
    }*/





