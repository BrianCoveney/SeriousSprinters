import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class WordTest {

    private Word word;
    private String wordInDictionary = "pider";
    private String wordInDictionary2 = "teffone";
    private String wordNotInDictionary = "bus";

    @Before
    public void setUp() throws Exception {
        word = new Word();
    }

    @Test
    public void hasMatch() throws Exception {
        assertTrue(word.hasMatch(wordInDictionary));
        assertFalse(word.hasMatch(wordNotInDictionary));
        assertEquals(1, word.getFrequency());

        assertTrue(word.hasMatch(wordInDictionary2));
        assertEquals(2, word.getFrequency());
    }

}
