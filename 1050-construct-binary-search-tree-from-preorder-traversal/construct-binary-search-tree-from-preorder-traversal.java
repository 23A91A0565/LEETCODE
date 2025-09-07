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
    int i=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return construct(preorder,0,Integer.MAX_VALUE);
    }
    public TreeNode construct(int []preorder,int low,int high){
        if(i==preorder.length || i>preorder.length) return null;

        if(preorder[i]>low && preorder[i]<high){
            TreeNode root=new TreeNode(preorder[i++]);
            root.left=construct(preorder,low,root.val);
            root.right=construct(preorder,root.val,high);
            return root;
        }
        return null;
    }
}