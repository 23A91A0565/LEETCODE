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
class BSTIterator {
    Stack<TreeNode> ans;
    public BSTIterator(TreeNode root) {
        ans=new Stack<>();
        pushLeft(root);
    }
    
    public int next() {
        TreeNode node = ans.pop();
        if (node.right != null) {
            pushLeft(node.right);
        }
        return node.val;
    }
    
    public boolean hasNext() {
        return !ans.isEmpty();
    }
    public void pushLeft(TreeNode node) {
        while (node != null) {
            ans.push(node);
            node = node.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */