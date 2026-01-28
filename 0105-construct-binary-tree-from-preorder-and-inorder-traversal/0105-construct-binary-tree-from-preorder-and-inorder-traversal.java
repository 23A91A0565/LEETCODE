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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            ans.put(inorder[i],i);
        }
        return solve(0,preorder.length-1,preorder,0,inorder.length-1,inorder,ans);
    }
    public TreeNode solve(int ps,int pe,int pre[],int ins,int ine,int ino[],HashMap<Integer,Integer> ans){
        if(ps>pe || ins>ine){
            return null;
        }
        int index=ans.get(pre[ps]);
        TreeNode res=new TreeNode(ino[index]);
        int left=index-ins;
        res.left=solve(ps+1,ps+left,pre,ins,index-1,ino,ans);
        res.right=solve(ps+left+1,pe,pre,index+1,ine,ino,ans);
        return res;
    }
}