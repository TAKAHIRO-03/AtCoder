package past;

import java.util.ArrayList;
import java.util.List;

public class Trie {

    private List<String> storeList = new ArrayList<>();

    public Trie() {

    }

    public void insert(String word) {
        this.storeList.add(word);
    }

    public boolean search(String word) {
        return this.storeList.contains(word);
    }

    public boolean startsWith(String prefix) {
        return this.storeList.stream().anyMatch(x -> x.startsWith(prefix));
    }
}
