## [104. Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

### Approach I: Recursive Calculation

#### Java:
```java
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0; // base-case

        int leftDepth = maxDepth(root.left); // calculate depth of left subtree
        int rightDepth = maxDepth(root.right); // calculate depth of right subtree

        return Math.max(leftDepth, rightDepth) + 1; // maximum of left and right depths + 1 to account current node
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

- *Time Complexity:* $O(log\ n)$ 
- *Space Complexity:* $O(h)$ where $h$ is height of tree, Best case $O(log\ n)$ (*balanced tree*), Worst case $O(n)$ (*skewed tree*)


---

