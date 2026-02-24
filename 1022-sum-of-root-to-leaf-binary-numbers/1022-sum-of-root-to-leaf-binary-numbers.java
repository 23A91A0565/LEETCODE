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
    int ans=0;
    public int sumRootToLeaf(TreeNode root) {
        if(root==null)return 0;
        calculate(0,root);
        return ans;
    }
    public void calculate(int prev,TreeNode root){
        int curr=prev*2+root.val;
        if(root.left==null && root.right==null){
            ans+=curr;
            return;
        }

        if(root.left!=null){
            calculate(curr,root.left);
        }
        if(root.right!=null){
            calculate(curr,root.right);
        }
    }
}