class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int pre[]=new int[n];
        int suff[]=new int[n];

        // next smaller element
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            suff[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }

        // previous smaller element
        Stack<Integer> st2=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st2.isEmpty() && heights[st2.peek()]>=heights[i]){
                st2.pop();
            }
            pre[i]=st2.isEmpty()?-1:st2.peek();
            st2.push(i);
        }

        int res=0;
        for(int i=0;i<n;i++){
            int width=suff[i]-pre[i]-1;
            int area=width*heights[i];
            res=Math.max(res,area);
        }
        return res;

    }
}