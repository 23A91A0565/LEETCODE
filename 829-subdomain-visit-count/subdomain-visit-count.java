class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> ans=new HashMap<>();
        for(int i=0;i<cpdomains.length;i++){
            String s=cpdomains[i];
            int index=s.indexOf(' ');
            int val=Integer.valueOf(s.substring(0,index));
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='.'){
                    String p=s.substring(j+1);
                    ans.put(p,ans.getOrDefault(p,0)+val);
                }
            }
            ans.put(s.substring(index+1),ans.getOrDefault(s.substring(index+1),0)+val);
        }
        ArrayList<String> res=new ArrayList<>();
        for(String i:ans.keySet()){
            res.add(ans.get(i)+" "+i);
        }
        return res;
    }
}