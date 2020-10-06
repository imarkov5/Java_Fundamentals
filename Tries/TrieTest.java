import java.util.HashMap;

public class TrieTest {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertWord("cat");
        trie.insertWord("car");
        trie.insertWord("clock");
        trie.insertWord("rain");
        trie.insertWord("rainbow");
        trie.insertWord("rainboots");

        Set<Character> keys = trie.root.children.keySet();
        for(Character key : keys){
            System.out.println(key);
        }
    }
}
