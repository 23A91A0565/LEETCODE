class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones=0;
        for(char c:s.toCharArray()){
            if(c=='1')ones+=1;
        }
        String t="1"+s+"1";
        int max=ones;
        int m=t.length();
        int i=1;
        while(i<m-1){
            if(t.charAt(i)=='1' && t.charAt(i-1)=='0'){
                int j=i+1;
                while(j<m && t.charAt(j)=='1')j++;
                int zero=0;
                int end=j;
                if(j<m){
                    while(j<m && t.charAt(j)=='0'){
                        zero++;
                        j++;
                    }
                    end=j;
                    j=i-1;
                    while(j>=0 && t.charAt(j)=='0'){
                        zero++;
                        j--;
                    }
                    max=Math.max(max,ones+zero);
                }
                i=end;
            }
            else{
                i++;
            }
        }
        return max;
    }
}