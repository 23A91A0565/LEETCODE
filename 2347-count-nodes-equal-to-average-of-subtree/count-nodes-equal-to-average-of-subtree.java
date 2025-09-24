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
    int count=0;
    public int averageOfSubtree(TreeNode root) {
        solve(root);
        return count;
    }
    public int[] solve(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        int left[]=solve(root.left);
        int right[]=solve(root.right);
        int sum=left[0]+right[0]+root.val;
        int len=left[1]+right[1]+1;
        int avg=sum/len;
        if(avg==root.val)
            count+=1;
        return new int[]{sum,len};
    }
}