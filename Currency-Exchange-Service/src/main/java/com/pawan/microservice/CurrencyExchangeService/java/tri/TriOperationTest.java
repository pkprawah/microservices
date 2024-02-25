package tri;

public class TriOperationTest {

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("pawan");
        trie.insert("cat");
        trie.insert("car");
        trie.insert("dog");
        trie.insert("pick");
        trie.insert("pickle");


        boolean isPresent = trie.search("cat");
        System.out.println(isPresent);

        isPresent = trie.search("picky");
        System.out.println(isPresent);




    }


}
