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
    public int maxDepth(TreeNode root) {
        // Queue<TreeNode> ans=new LinkedList<>();
        // if(root==null)return 0;
        // int c=0;
        // ans.offer(root);
        // while(!ans.isEmpty()){
        //     int size=ans.size();
        //     for(int i=0;i<size;i++){
        //         TreeNode curr=ans.poll();
        //         if(curr.left!=null){
        //             ans.offer(curr.left);
        //         }
        //         if(curr.right!=null){
        //             ans.offer(curr.right);
        //         }
        //     }
        //     c+=1;
        // }
        // return c;

        if(root==null)
            return 0;
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return 1+Math.max(l,r);
    }
}