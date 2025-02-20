/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long minValue, long maxValue) {
        if (node == null) return true; // empty tree is valid BST

        // current node value must be between min and max bounds
        if (node.val <= minValue || node.val >= maxValue) {return false;}

        // recursively validate left and right subtrees with updated bounds
        return validate(node.left, minValue, node.val) && validate(node.right, node.val, maxValue);
    }
}