import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {
    public static void main(String[] args) {
        counter("mytext.txt");
    }
    public static int counter(String filename){
        try {
            Path filePath = Paths.get(filename);
            System.out.println(Files.readAllLines(filePath));
        } catch (Exception e) {
            return 0;
        }
        return 1;
    }
}



// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.