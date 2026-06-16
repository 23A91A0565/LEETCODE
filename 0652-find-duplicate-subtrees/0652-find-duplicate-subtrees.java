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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        HashMap<String,Integer> ans =new HashMap<>();
        List<TreeNode> res=new ArrayList<>();
        solve(root,res,ans);
        return res;
    }
    public String solve(TreeNode root,List<TreeNode> res,HashMap<String,Integer> ans){
        if(root==null){
            return "";
        }
        int val=root.val;
        String left=solve(root.left,res,ans);
        String right=solve(root.right,res,ans);
        String formed=val+"$"+left+"$"+right;
        if(ans.getOrDefault(formed,0)==1){
            res.add(root);
        }
        ans.put(formed,ans.getOrDefault(formed,0)+1);
        return formed;
    }
}