class WordDictionary {
    class TrieNode{
        TrieNode child[]=new TrieNode[26];
        boolean isEnd=false;
    }
    TrieNode root;
    public WordDictionary() {
        root=new TrieNode();
    }
    
    public void addWord(String word) {
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
        return dfs(word,root,0);
    }
    public boolean dfs(String word,TrieNode curr,int ind){
        if(ind==word.length()){
            return curr.isEnd;
        }
        char c=word.charAt(ind);
        if(c!='.'){
            if(curr.child[c-'a']==null){
                return false;
            }
            return dfs(word,curr.child[c-'a'],ind+1);
        }
        for(int i=0;i<26;i++){
            if(curr.child[i]!=null){
                if(dfs(word,curr.child[i],ind+1)){
                    return true;
                }
            }
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */