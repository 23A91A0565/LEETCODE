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
    public TreeNode pruneTree(TreeNode root) {
        if(!check(root.left) && !check(root.right) && root.val!=1){
            return null;
        }
        if(!check(root.left)){
            root.left=null;
        }
        if(!check(root.right)){
            root.right=null;
        }
        if(root.left!=null)
            pruneTree(root.left);
        if(root.right!=null)
            pruneTree(root.right);
        return root;
    }
    public boolean check(TreeNode root){
        if(root==null)return false;
        if(root.val==1)return true;
        boolean val=false;
        if(root.left!=null){
            val=check(root.left);
        }
        boolean val2=false;
        if(root.right!=null){
            val2=check(root.right);
        }
        return val||val2;
    }
}