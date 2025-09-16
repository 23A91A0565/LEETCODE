class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i:nums){
            ans.add(i);
            while(ans.size()>1){
                int a=ans.get(ans.size()-1);
                int b=ans.get(ans.size()-2);
                int g=gcd(a,b);
                if(g==1){
                    break;
                }
                else{
                    ans.remove(ans.size()-1);
                    ans.remove(ans.size()-1);
                    ans.add(lcm(a,b));
                }
            }
        }
        return ans;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public int lcm(int a,int b){
        if(a==0 || b==0)return 0;
        return (int)((long)a * b / gcd(a, b));
    }
}