/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        calculate(root,ans,0);
        return ans;

        // [ OR ]
        // if(root==null)return ans;
        // List<List<Integer>> st=new ArrayList<>();
        // Queue<TreeNode> q=new LinkedList<>();
        // q.offer(root);
        // while(!q.isEmpty()){
        //     int size=q.size();
        //     List<Integer> ele=new ArrayList<>();
        //     for(int i=0;i<size;i++){
        //         TreeNode curr=q.poll();
        //         ele.add(curr.val);
        //         if(curr.left!=null)q.offer(curr.left);
        //         if(curr.right!=null)q.offer(curr.right);
        //     }
        //     st.add(ele);
        // }

        // for(List<Integer> a:st){
        //     ans.add(a.get(a.size()-1));
        // }
        // return ans;


    }

    public void calculate(TreeNode root,List<Integer> ans,int depth){
        if(root==null)return;
        if(ans.size()==depth)ans.add(root.val);
        calculate(root.right,ans,depth+1);
        calculate(root.left,ans,depth+1);
    }
}