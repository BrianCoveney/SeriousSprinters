import java.util.Arrays;
import java.util.List;


public class Word {

    private String word;
    private int frequency;
    private List<String> glidingLiquidsWords = Arrays.asList(
            "teffoneeeeeeeeeeeeeeeeeteffoneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee",
            "pider",
            "bu"
    );

    public Word(String word) {
        if (word == null)
            throw new IllegalArgumentException(String.format("Parameter cannot be null"));
        this.word = word;
    }

    public int getFrequency() {
        return frequency;
    }

    public void incrementFrequency() {
        frequency++;
    }

    public boolean hasMatch(String word) {
        for (String words : glidingLiquidsWords) {
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
