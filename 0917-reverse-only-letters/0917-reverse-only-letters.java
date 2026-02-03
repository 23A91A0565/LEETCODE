class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[]=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            if(!Character.isLetter(s.charAt(i))){
                i++;
            }
            else if(!Character.isLetter(s.charAt(j))){
                j--;
            }
            else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}