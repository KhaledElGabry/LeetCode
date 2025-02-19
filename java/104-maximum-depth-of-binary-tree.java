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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0; // base-case

        int leftDepth = maxDepth(root.left); // calculate depth of left subtree
        int rightDepth = maxDepth(root.right); // calculate depth of right subtree

        return Math.max(leftDepth, rightDepth) + 1; // maximum of left and right depths + 1 to account current node
    }
}