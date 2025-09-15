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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length);
    }

    private TreeNode helper(int[] nums, int l, int r) {
        if (l == r)
            return null;

        int max_index = max(nums, l, r);
        TreeNode root = new TreeNode(nums[max_index]);
        root.left = helper(nums, l, max_index);
        root.right = helper(nums, max_index + 1, r);
        return root;
    }

    private int max(int[] nums, int l, int r) {
        int max_index = l;

        for (int i = l; i < r; i++) {
            if (nums[max_index] < nums[i])
                max_index = i;
        }

        return max_index;
    }
}