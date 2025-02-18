## [226. Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/)

### Approach I: Recursive DFS

#### Java:
```java
class Solution {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null; // base case
        TreeNode temp = root.left; // store temporary pointer

        // swap children
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
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
