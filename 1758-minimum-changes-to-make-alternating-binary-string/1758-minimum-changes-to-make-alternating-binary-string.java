class Solution {
    public int minOperations(String s) {
        int min=Integer.MAX_VALUE;
        int op=0;
            for(int i=0;i<s.length();i++){
                if(i%2!=0 && s.charAt(i)!='0'){
                op+=1;
                }
                if(i%2==0 && s.charAt(i)!='1'){
                    op+=1;
                }
            }
        min=Math.min(min,op);
        op=0;
            for(int i=0;i<s.length();i++){
                if(i%2!=0 && s.charAt(i)!='1'){
                    op+=1;
                }
                if(i%2==0 && s.charAt(i)!='0'){
                    op+=1;
                }
            }
        min=Math.min(min,op);
        return min;
    }
}