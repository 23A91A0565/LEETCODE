class Solution {
    public int minimumRounds(int[] tasks) {
        int res=0;
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int ele:tasks){
            ans.put(ele,ans.getOrDefault(ele,0)+1);
        }
        for(int key:ans.keySet()){
            int val=ans.get(key);
            if(val==1)return -1;
            if(val%3==0){
                res+=val/3;
            }
            else if(val%3==2){
                res+=(val-2)/3;
                res+=1;
            }
            else{//val%3==1
                res+=2;
                res+=(val-4)/3;
            }
        }
        return res;
    }
}