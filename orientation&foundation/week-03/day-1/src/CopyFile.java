import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
public class CopyFile {
    public static void main(String[] args) {
        String fromFile = "copyFromFile";
        String toFile = "pasteToFile";
        System.out.println(copyFiles(fromFile, toFile));
    }

    public static boolean copyFiles(String file1, String file2){
        Path filePath = Paths.get("file1.txt");
        Path filePath1 = Paths.get("file2.txt");
        System.out.println(filePath.toAbsolutePath());
        try {
            List<String> content = Files.readAllLines(filePath);
            content.add("Hello");
            Files.write(filePath1, content);
            return true;

        } catch (Exception e){
            System.out.println("Unable to manipulate with files");
            return false;
        }

    }
}


// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
