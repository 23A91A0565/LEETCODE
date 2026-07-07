class Solution {
    public int brokenCalc(int startValue, int target) {
        int res=0;
        if(startValue==target)return 0;
        while(target>startValue){
            if(target%2!=0){
                target+=1;
                res+=1;
            }
            target=target/2;
            res+=1;
        }
        return res+startValue-target;
    }
}