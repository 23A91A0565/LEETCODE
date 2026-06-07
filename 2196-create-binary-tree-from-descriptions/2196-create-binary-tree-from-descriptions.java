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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> tree=new HashMap<>();
        HashSet<Integer> ans=new HashSet<>();
        for(int ele[]:descriptions){
            if(!tree.containsKey(ele[0])){
                tree.put(ele[0],new TreeNode(ele[0]));
            }
            if(!tree.containsKey(ele[1])){
                tree.put(ele[1],new TreeNode(ele[1]));
            }
            if(ele[2]==1){
                tree.get(ele[0]).left=tree.get(ele[1]);
            }
            if(ele[2]==0){
                tree.get(ele[0]).right=tree.get(ele[1]);
            }
            ans.add(ele[1]);
        }

        for(int ele[]:descriptions){
            if(!ans.contains(ele[0])){
                return tree.get(ele[0]);
            }
        }
        return null;
    }
}