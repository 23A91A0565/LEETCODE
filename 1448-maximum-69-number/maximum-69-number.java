class Solution {
    public int maximum69Number (int num) {
     char c[]=String.valueOf(num).toCharArray();
     for(int i=0;i<c.length;i++)
     {
        if(c[i]!='9')
        {
            c[i]='9';
            break;
        }
     }
     return Integer.parseInt(new String(c));
    }
}