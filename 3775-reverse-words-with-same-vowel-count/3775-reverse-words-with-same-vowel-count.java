class Solution {
    public String reverseWords(String s) {
        String a[]=s.split(" ");
        int c=vowelCount(a[0]);
        StringBuilder sb=new StringBuilder();
        sb.append(a[0]);
        for(int i=1;i<a.length;i++){
            if(vowelCount(a[i])==c){
                StringBuilder du=new StringBuilder(a[i]);
                sb.append(" ");
                sb.append(du.reverse());
            }
            else{
                sb.append(" ");
                sb.append(a[i]);
            }
        }
        return sb.toString();
    }
    public int vowelCount(String s){
        int cnt=0;
        s=s.toLowerCase();
        for(char c:s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                cnt++;
            }
        }
        return cnt;
    }
}