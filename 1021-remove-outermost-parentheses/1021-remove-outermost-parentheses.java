class Solution {
    public String removeOuterParentheses(String s) {
        // List<Integer> l=new ArrayList<>();
        // int open=0;
        // int close=0,i=0;
        // for(char ch:s.toCharArray()){
        //     if(ch=='('){
        //         open++;
        //     }
        //     else{
        //         close++;
        //     }

        //     if(open==close){
        //         l.add(i);
        //     }
        //     i++;
        // }
        // StringBuilder sb=new StringBuilder();
        // for(int k=0;k<l.size();k++){
        //     if(k==0){
        //         sb.append(s.substring(1,l.get(k)));
        //     }
        //     else{
        //         sb.append(s.substring(l.get(k-1)+2,l.get(k)));
        //     }
        // }
        // return sb.toString();

        // [ or ]

        int count=0;
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(count>0){
                    sb.append(ch);
                }
                count++;
            }
            else{
                count--;
                if(count>0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}