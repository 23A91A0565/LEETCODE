class Trie {
    class TrieNode{
        TrieNode child[]=new TrieNode[26];
        boolean isEnd=false;
    }
    TrieNode root;

    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr=root;
        for(char c:word.toCharArray()){
            int ind=c-'a';
            if(curr.child[ind]==null){
                curr.child[ind]=new TrieNode();
            }
            curr=curr.child[ind];
        }
        curr.isEnd=true;
    }
    
    public boolean search(String word) {
        TrieNode curr=root;
        for(char c:word.toCharArray()){
            int ind=c-'a';
            if(curr.child[ind]==null){
                return false;
            }
            curr=curr.child[ind];
        }
        return curr.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr=root;
        for(char c:prefix.toCharArray()){
            int ind=c-'a';
            if(curr.child[ind]==null){
                return false;
            }
            curr=curr.child[ind];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */