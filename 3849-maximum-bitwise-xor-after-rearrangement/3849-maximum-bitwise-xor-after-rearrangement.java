class Solution {
    public String maximumXor(String s, String t) {
        int c1=0,c2=0;
        for(char c:t.toCharArray()){
            if(c=='0'){
                c1+=1;
            }
            else{
                c2+=1;
            }
        }

        StringBuilder res=new StringBuilder();
        // The xor of smae bits is 0 otherwise it is 1
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(c1>0){
                    // 1 xor 0 is 1
                    res.append('1');
                    c1-=1;
                }
                else{
                    // 1 xor 1 is 0
                    res.append('0');
                    c2-=1;
                }
            }
            else{
                if(c2>0){
                    // 0 xor 1 is 1
                    res.append('1');
                    c2-=1;
                }
                else{
                    // 0 xor 0 is 0
                    res.append('0');
                    c1-=1;
                }
            }
        }
        return res.toString();
    }
}