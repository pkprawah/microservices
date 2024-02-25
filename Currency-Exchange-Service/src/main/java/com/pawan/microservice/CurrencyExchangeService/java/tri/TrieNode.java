package tri;


import java.util.Arrays;

public class TrieNode {

    public boolean isEndOfWord;
    public TrieNode character[] = new TrieNode[26];
    public char val;


    public TrieNode() {
        isEndOfWord = false;
        for (int i = 0; i < 26; i++){
            character[i] = null;
    }
    }

    public TrieNode(char val){
        TrieNode node = new TrieNode();
        node.val=val;
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public TrieNode[] getCharacter() {
        return character;
    }

    public void setCharacter(TrieNode[] character) {
        this.character = character;
    }

    public void setEndOfWord(boolean endOfWord) {
        isEndOfWord = endOfWord;
    }

    @Override
    public String toString() {
        return "TriNode{" +
                "isEndOfWord=" + isEndOfWord +
                ", character=" + Arrays.toString(character) +
                '}';
    }
}
