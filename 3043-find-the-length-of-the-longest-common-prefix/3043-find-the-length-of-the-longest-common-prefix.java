class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> ans=new HashSet<>();
        for(int ele:arr1){
            // int t=ele;
            // while(t!=0){
            //     ans.add(t);
            //     t=t/10;
            // }
            String s=String.valueOf(ele);
            for(int i=1;i<=s.length();i++){
                int st=Integer.parseInt(s.substring(0,i));
                ans.add(st);
            }
        }

        int res=0;
        for(int ele:arr2){
            String s=String.valueOf(ele);
            for(int i=1;i<=s.length();i++){
                int st=Integer.parseInt(s.substring(0,i));
                if(ans.contains(st)){
                    res=Math.max(res,i);
                }
            }
        }
        return res;
    }
}