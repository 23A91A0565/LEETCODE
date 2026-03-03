class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb=new StringBuilder();
        sb.append('0');
        for(int i=1;i<n;i++){
            StringBuilder temp=new StringBuilder();
            for(char c:sb.toString().toCharArray()){
                temp.append((char)(c^1));
            }
            temp.reverse();
            sb.append('1');
            sb.append(temp);
        }
        return sb.charAt(k-1);
    }
}