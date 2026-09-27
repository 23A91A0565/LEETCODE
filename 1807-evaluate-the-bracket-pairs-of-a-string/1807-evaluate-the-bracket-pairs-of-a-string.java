class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> h=new HashMap<>();
        for(List<String> ele:knowledge){
            h.put(ele.get(0),ele.get(1));
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                int next=s.indexOf(')',i+1);
                String sub=s.substring(i+1,next);
                if(h.containsKey(sub)){
                    sb.append(h.get(sub));
                }
                else{
                    sb.append("?");
                }
                i=next;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}