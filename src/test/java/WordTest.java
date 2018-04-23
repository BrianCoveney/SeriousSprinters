import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class WordTest{

    private Word word;
    private String wordInDictionary = "pider";
    private String wordInDictionary2 = "teffone";
    private String wordNotInDictionary = "bus";

    @Before
    public void setUp() throws Exception {
        word = new Word("pider");
    }

    @Test
    public void hasMatch() throws Exception {
        assertTrue(word.hasMatch(wordInDictionary));
        assertFalse(word.hasMatch(wordNotInDictionary));
        assertEquals(1, word.getFrequency());

        assertTrue(word.hasMatch(wordInDictionary2));
        assertEquals(2, word.getFrequency());
    }

    @Test
    public void testIncrementFrequency() {
        assertTrue(word.hasMatch(wordInDictionary));
        assertEquals(1, word.getFrequency());
    }

    @Test
    public void testToString() {
        assertEquals(wordInDictionary, word.toString());
    }

    @Test
    public void testWordConstructorThatTakesAString() {
        Word w = new Word("a word");
        assertEquals("a word", w.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWordConstructorWithNullParam() {
        new Word(null);
    }
}
