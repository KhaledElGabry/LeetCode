## [98. Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/)

### Approach I: Recursive Range Validation (Left & Right Subtree)

#### Java:
```java
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
```

[//]: # (#### Go:)

[//]: # (```go)

[//]: # (func solution&#40;&#41; {)

[//]: # ()
[//]: # (})

[//]: # (```)

### Complexity Analysis:

- *Time Complexity:* $O(n)$
- *Space Complexity:* $O(h)$ where $h$ is height of tree

---