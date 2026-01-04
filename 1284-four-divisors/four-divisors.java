class Solution {
    public int sumFourDivisors(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            int c=0,s=0;
            for(int j=1;j<=Math.sqrt(ele);j++){
                if(ele%j==0){
                    int k=ele/j;
                    if(j==k){
                        c+=1;
                        s+=j;
                    }
                    else{
                        c+=2;
                        s+=j+k;
                    }
                    if(c>4){
                        break;
                    }
                }
            }
            if(c==4){
                total+=s;
            }
        }
        return total;
    }
}