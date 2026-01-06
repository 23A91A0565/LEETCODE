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
    public int maxLevelSum(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        dfs(ans,0,root);
        int max=Integer.MIN_VALUE,maxi=-1;
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)>max){
                max=ans.get(i);
                maxi=i+1;
            }
        }
        return maxi;
    }
    public void dfs(ArrayList<Integer> ans,int level,TreeNode root){
        if(root==null)return;
        if(ans.size()==level){
            ans.add(root.val);
        }
        else{
            ans.set(level,ans.get(level)+root.val);
        }
        dfs(ans,level+1,root.left);
        dfs(ans,level+1,root.right);
    }
}