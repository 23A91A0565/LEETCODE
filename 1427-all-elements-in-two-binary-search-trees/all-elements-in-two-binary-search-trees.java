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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> ans=new ArrayList<>();
        traverse(ans,root1);
        traverse(ans,root2);
        Collections.sort(ans);
        return ans;
    }
    public static void traverse(List<Integer>ans,TreeNode root)
    {
        if(root==null) return;
        ans.add(root.val);
        traverse(ans,root.left);
        traverse(ans,root.right);

    }
}