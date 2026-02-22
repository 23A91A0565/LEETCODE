class Solution {
    HashMap<String,Integer> p=new HashMap<>();
    public int countSequences(int[] nums, long k) {
        // long val=1;
        int res=solve(1,1,nums,0,k);
        return res;
    }
    public int solve(long num,long den,int nums[],int ind,long k){
        long g=gcd(num,den);
        num/=g;
        den/=g;
        
        if(ind==nums.length){
            if(num==k*den)return 1;
            else return 0;
        }
        
        String s=ind+","+num+","+den;
        if(p.containsKey(s))return p.get(s);
        
        int a=solve(num,den,nums,ind+1,k);
        int b=solve(num*nums[ind],den,nums,ind+1,k);
        int c=solve(num,den*nums[ind],nums,ind+1,k);
        
        p.put(s,a+b+c);
        return a+b+c;
    }
    public long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}