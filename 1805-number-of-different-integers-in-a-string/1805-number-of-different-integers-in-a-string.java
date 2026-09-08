class Solution {
    public int numDifferentIntegers(String word) {
        String arr[]=word.replaceAll("[a-zA-Z]"," ").split("\\s+");
        Set<String> st=new HashSet<>();
        for(String s:arr){
            if(!s.isEmpty()){
                st.add(String.valueOf(s.replaceAll("^0*","")));
            }
        }
        return st.size();
    }
}