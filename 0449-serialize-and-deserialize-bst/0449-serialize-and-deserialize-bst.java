/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        formStr(root,sb);
        return sb.toString();
    }
    public void formStr(TreeNode root,StringBuilder sb){
        if(root==null)return;
        sb.append(root.val);
        sb.append(',');
        formStr(root.left,sb);
        formStr(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty())return null;
        Queue<String> q=new LinkedList<>(Arrays.asList(data.split(",")));
        TreeNode root=formTree(q,Integer.MIN_VALUE,Integer.MAX_VALUE);
        return root;
    }
    public TreeNode formTree(Queue<String>q,int low,int high){
        if(q.isEmpty())return null;
        String peek=q.peek();
        int val=Integer.parseInt(peek);
        if(val<low || val>high){
            return null;
        }
        TreeNode root=new TreeNode(val);
        q.poll();
        root.left=formTree(q,low,val);
        root.right=formTree(q,val,high);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;