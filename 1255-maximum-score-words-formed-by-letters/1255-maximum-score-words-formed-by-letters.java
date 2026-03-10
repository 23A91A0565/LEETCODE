class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int freq[]=new int[26];
        int ans=0;
        for(char c:letters){
            freq[c-'a']++;
        }
        int res=solve(0,words,letters,freq,score,ans);
        return res;
    }
    public int solve(int index,String words[],char letters[],int freq[],int score[],int ans){
        if(index==words.length){
            return ans;
        }
        int sum=0;
        int same[]=freq.clone();

        boolean isPoss=true;
        for(char c:words[index].toCharArray()){
            if(freq[c-'a']==0){
                isPoss=false;
                break;
            }
            else{
                freq[c-'a']--;
                sum+=(score[c-'a']);
            }
        }
        int a=0,b=0;

        if(isPoss){
            a+=solve(index+1,words,letters,freq,score,ans+sum);
        }
        b+=solve(index+1,words,letters,same,score,ans);
        return Math.max(a,b);
    }
}