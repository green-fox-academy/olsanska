import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class MostCommonCharacter {
        public static void main(String[] args) {
            System.out.println(function("countchar.txt"));
            function("countchar.txt");
        }

        public static HashMap<Character, Integer> function(String fileName){

            List<String> content = new ArrayList<>();

            try {

                Path filePath = Paths.get(fileName);
                content = Files.readAllLines(filePath);
            }
            catch (IOException error){
                System.out.println("File does not exist!");

            }

            HashMap<Character, Integer> hashMap = new HashMap<>();

            for (int lines = 0; lines < content.size(); lines++) {
                for (int j = 0; j < content.get(lines).length(); j++) {

                    char pismeno = content.get(lines).charAt(j);


                    if (hashMap.containsKey(pismeno)){
                        hashMap.put(pismeno, hashMap.get(pismeno)+1);
                    } else {
                        hashMap.put(pismeno, 1);
                    }
                }
            }
            System.out.println();
            return hashMap;
        }


    }


/*
Write a function that takes a filename as a parameter.
Return the 2 most common characters and their occurrences in the file's content.

If the file does not exist throw an exception with the following message: "File does not exist!"
 */
