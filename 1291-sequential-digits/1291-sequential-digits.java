class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer>list=new ArrayList<>();
        String str="123456789";
        for(int start=0;start<str.length();start++){
            for(int end=start+1;end<=str.length();end++){
                int digit=Integer.parseInt(str.substring(start,end));
                if(digit>=low&&digit<=high)
                    list.add(digit);
            }
        }
        Collections.sort(list);
        return list;



                        // OR

    //     ArrayList<Integer> ans=new ArrayList<>();
    //     for(int i=1;i<=9;i++){
    //         solve(low,high,ans,i,i);
    //     }
    //     Collections.sort(ans);
    //     return ans;
    // }
    // public static void solve(int l,int h,ArrayList<Integer> ans,int curr,int pre){
    //     if(curr>h)return;
    //     if(curr>=l && curr<=h){
    //         ans.add(curr);
    //     }
    //     curr=(curr*10)+pre+1;
    //     if(pre!=9){
    //         solve(l,h,ans,curr,pre+1);
    //     }
    }
}