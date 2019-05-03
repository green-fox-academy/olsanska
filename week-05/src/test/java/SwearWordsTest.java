import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWordsTest {
    //test + name of the method _ tested case _ expected result

    @Test
    public void testSwearWords_removeSwearWords_wordsRemoved() {
        List<String> swearWord = new ArrayList<>(Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"));
        assertEquals(SwearWords.removeSwearWords("example", swearWord), 15);


    }
}
