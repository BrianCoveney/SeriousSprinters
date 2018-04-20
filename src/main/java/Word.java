import java.util.Arrays;
import java.util.List;


public class Word {

    private String word;
    private int frequency;
    private List<String> glidingLiquidsWords = Arrays.asList(
            "teffone",
            "pider",
            "bu"
    );

    public Word(final String word) {
        if (word == null) {
            throw new IllegalArgumentException(String.format("Parameter cannot be null"));
        }
        this.word = word;
    }

    public int getFrequency() {
        return frequency;
    }

    public void incrementFrequency() {
        frequency++;
    }

    public boolean hasMatch(final String word) {
        for (final String words : glidingLiquidsWords) {
            if (words.contains(word)) {
                incrementFrequency();
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return word;
    }

}
