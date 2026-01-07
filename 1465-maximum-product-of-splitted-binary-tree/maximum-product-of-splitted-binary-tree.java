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
    long total=0;
    long max=0;
    long mod=1_000_000_007;
    public int maxProduct(TreeNode root) {
        total=dfs(root);
        dfs(root);
        return (int)(max % mod);
    }
    public int dfs(TreeNode root){
        if(root==null)return 0;
        int left=dfs(root.left);
        int right=dfs(root.right);
        int sum=root.val+left+right;

        max=Math.max(max,sum*(total-sum));
        return sum;
    }
}