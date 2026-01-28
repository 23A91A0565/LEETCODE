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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            ans.put(inorder[i],i);
        }
        return solve(0,postorder.length-1,postorder,0,inorder.length-1,inorder,ans);
    }
    public TreeNode solve(int ps,int pe,int pos[],int ins,int ine,int ino[],HashMap<Integer,Integer> ans){
        if(ps>pe || ins>ine){
            return null;
        }
        int index=ans.get(pos[pe]);
        TreeNode res=new TreeNode(ino[index]);
        int left=index-ins;
        res.left=solve(ps,ps+left-1,pos,ins,index-1,ino,ans);
        res.right=solve(ps+left,pe-1,pos,index+1,ine,ino,ans);
        return res;
    }
}