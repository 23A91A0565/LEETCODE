class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int res[]=new int[s.length()];
        int x=startPos[0],y=startPos[1];
        for(int i=0;i<s.length();i++){
            int c=calculate(n,x,y,s.substring(i));
            res[i]=c;
        }
        return res;
    }
    public int calculate(int n,int x,int y,String s){
        int i=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='R')y+=1;
            else if(s.charAt(i)=='L')y-=1;
            else if(s.charAt(i)=='U')x-=1;
            else if(s.charAt(i)=='D')x+=1;

            if(x<0 || y>=n || x>=n || y<0)return i;
        }
        return s.length();
    }
}