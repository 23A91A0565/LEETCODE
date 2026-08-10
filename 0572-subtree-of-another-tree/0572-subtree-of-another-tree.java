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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)return false;
        if(root.val==subRoot.val && (solve(root,subRoot))){
            return true;
        }
        else if(isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot)){
            return true;
        }
        return false;
    }
    public boolean solve(TreeNode root1,TreeNode root2){
        if(root1==null || root2==null){
            return root1==root2;
        }
        return root1.val==root2.val && solve(root1.left,root2.left) && solve(root1.right,root2.right);
    }
}