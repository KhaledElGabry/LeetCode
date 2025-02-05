## [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

### Approach I: Two Pointers (Merge From the End)

#### Java:
```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // validation
        if (m < 0 || n < 0 || m + n > 200) {
            throw new IllegalArgumentException("Invalid represent number");
        }
        if (nums1.length != m + n || nums2.length != n) {
            throw new IllegalArgumentException("Invalid array lengths don't match the parameters");
        }

        // start from the end of nums1
        int p = m + n - 1; // last position in merged array
        int p1 = m - 1; // last element in nums1
        int p2 = n - 1; // last element in nums2

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }

            p--;
        }

        // remaining elements in nums2 if any
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }

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

- *Time Complexity:* $O(n + m)$ where m represents the number of valid elements in the first array and n represents the second array
- *Space Complexity:* $O(1)$


---


