class Solution {
    public int maximumProduct(int[] nums) {
        int a=Integer.MIN_VALUE,b=a,c=a;
        int x=Integer.MAX_VALUE,y=x;
        for(int ele:nums){
            if(ele>=a){
                c=b;
                b=a;
                a=ele;
            }
            else if(ele>=b){
                c=b;
                b=ele;
            }
            else if(c<ele){
                c=ele;
            }

            if(ele<=x){
                y=x;
                x=ele;
            }
            else if(y>ele){
                y=ele;
            }
        }
        return Math.max(a*b*c, x*y*a);
    }
}