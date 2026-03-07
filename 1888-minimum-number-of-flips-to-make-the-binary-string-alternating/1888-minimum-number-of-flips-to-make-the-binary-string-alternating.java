class Solution {
    public int minFlips(String s) {
        int n=s.length();
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        String p=s+s;

        for(int i=0;i<2*n;i++){
            if(i%2==0){
                s1.append('0');
                s2.append('1');
            }
            else{
                s1.append('1');
                s2.append('0');
            }
        }
        int d1=0,d2=0;
        int min=Integer.MAX_VALUE;
        int l=0;

        for(int i=0;i<2*n;i++){
            if(p.charAt(i)!=s1.charAt(i))d1++;
            if(p.charAt(i)!=s2.charAt(i))d2++;

            if(i-l+1>n){
                if(p.charAt(l)!=s1.charAt(l))d1--;
                if(p.charAt(l)!=s2.charAt(l))d2--;
                l++;
            }

            if(i-l+1==n){
                min=Math.min(min,Math.min(d1,d2));
            }
        }
        return min;
    }
}