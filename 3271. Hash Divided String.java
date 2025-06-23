class Solution {
    public String stringHash(String s, int k) {
        int n = s.length();
        int d = (n/k);
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n;i++){
            int e = k,f = 0;
            while(e!=0){
                f += ((int)(s.charAt(i)))%97;
                e--;
                i++;
            }
            f%=26;
            f+=97;
            str.append((char)(f));
            i--;
        }
        return str.toString();
    }
}
