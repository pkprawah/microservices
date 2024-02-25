package tri;

import org.w3c.dom.ls.LSOutput;

public class Trie {

    private TrieNode root;

    public Trie(){
        root = new TrieNode();
        root.val = ' ';
    }

    public void insert(String word) {

        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
          char c = word.charAt(i);
            if (node.character[c - 'a'] == null) {
                node.character[c - 'a'] = new TrieNode(c);
            }
            node = node.character[c - 'a'];

            System.out.println("temp " + node);
        }
        node.isEndOfWord=true;
    }

    public boolean search(String word) {
        return isMatch(word, root, 0, true);
    }

    public boolean isMatch( String s, TrieNode node, int index, boolean isFullMatch) {
        if (node == null)
            return false;

        if (index == s.length())
            return !isFullMatch || node.isEndOfWord;

        return isMatch(s, node.character[s.charAt(index) - 'a'], index + 1, isFullMatch);
    }

}