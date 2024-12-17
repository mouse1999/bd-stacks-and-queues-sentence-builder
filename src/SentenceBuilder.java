import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class SentenceBuilder {


    private Stack<String> messageStack;


    /**
     * Constructor.
     */
    public SentenceBuilder() {
        messageStack = new Stack<>();
    }

    /**
     * Adds a word to the sentence.
     * @param word to be added to the sentence.
     */
    public void addWord(String word) {
        messageStack.push(word);

    }

    /**
     * Undoes the last word added, and returns it.
     * @return The word most recently added to the sentence, if any; null, otherwise.
     */
    public String undo() {
        if (messageStack.isEmpty()) {
            return null;
        }

        return messageStack.pop();
    }

    /**
     * Display all the current words in our sentence.
     * @return string representation of the words currently in the sentence.
     */
    public String getSentenceWords() {

        StringBuilder wordsBuilder = new StringBuilder("[");
        Iterator<String> iterator = messageStack.iterator();

        while (iterator.hasNext()) {
            wordsBuilder.append(iterator.next());
            if (iterator.hasNext()) {
                wordsBuilder.append(", ");
            }
        }

        wordsBuilder.append("]");
        return wordsBuilder.toString();
    }

}
