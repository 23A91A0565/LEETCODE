class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(char c:s.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        TreeMap<Integer,List<Character>> ans=new TreeMap<>(Collections.reverseOrder());
        for(char c:h.keySet()){
            int freq=h.get(c);
            ans.putIfAbsent(freq,new ArrayList<>());
            ans.get(freq).add(c);
        }
        StringBuilder sb=new StringBuilder();
        for(int freq:ans.keySet()){
            List<Character> l=ans.get(freq);
            for(int i=0;i<l.size();i++){
                for(int j=0;j<freq;j++){
                    sb.append(l.get(i));
                }
            }
        }
        return sb.toString();
    }
}