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
    int c=0;
    public int goodNodes(TreeNode root) {
        if(root==null)return 0;
        dfs(root,Integer.MIN_VALUE);
        return c;
    }
    public void dfs(TreeNode root,int max){
        if(root==null)return;
        if(root.val>=max){
            c++;
        }
        max=Math.max(max,root.val);
        dfs(root.left,max);
        dfs(root.right,max);
    }
}