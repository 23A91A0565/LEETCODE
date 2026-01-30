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
    public void flatten(TreeNode root) {
        TreeNode curr=root;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode left=curr.left;
                TreeNode right=curr.right;
                TreeNode pre=left;
                while(pre.right!=null){
                    pre=pre.right;
                }
                pre.right=right;
                curr.right=left;
                curr.left=null;
            }
            curr=curr.right;
        }
    }
}