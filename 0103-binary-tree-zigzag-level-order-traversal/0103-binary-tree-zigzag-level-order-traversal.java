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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)return ans;
        boolean isLeft=false;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            Integer st[]=new Integer[size];
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(isLeft){
                    st[size-1-i]=curr.val;
                }
                else{
                    st[i]=curr.val;
                }
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            isLeft=!isLeft;
            ans.add(Arrays.asList(st));
        }
        return ans;
    }
}