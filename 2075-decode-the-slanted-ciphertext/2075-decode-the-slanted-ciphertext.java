class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int len=encodedText.length();
        int cols=len/rows;
        char arr[][]=new char[rows][cols];
        int k=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=encodedText.charAt(k);
                k++;
            }
        }

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<cols;i++){
                int l=i;
                int j=0;
                while(j<rows && l<cols){
                    sb.append(arr[j][l]);
                    l++;
                    j++;
                }
        }
        return sb.toString().stripTrailing();
    }
}