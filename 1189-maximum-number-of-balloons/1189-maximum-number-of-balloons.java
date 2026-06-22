class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> ans=new HashMap<>();
        ans.put('b',0);
        ans.put('a',0);
        ans.put('l',0);
        ans.put('o',0);
        ans.put('n',0);
        
        String s="balloon";
        for(char c:text.toCharArray()){
            if(s.indexOf(c)!=-1){
                ans.put(c,ans.getOrDefault(c,0)+1);
            }
        }
        ans.put('o',ans.get('o')/2);
        ans.put('l',ans.get('l')/2);

        int min=Integer.MAX_VALUE;
        for(char c:ans.keySet()){
            min=Math.min(min,ans.get(c));
        }
        return Math.max(0,min);
    }
}