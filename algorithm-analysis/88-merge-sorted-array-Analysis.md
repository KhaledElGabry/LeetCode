## [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

### Approach I: Three Pointers

#### Java:
```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m + n > 200) return;

        int lastIndex = m + n - 1;
        int nums1Index = m - 1;
        int nums2Index = n - 1;

        while (nums2Index >= 0) {
            if (nums1Index >= 0 && nums1[nums1Index] > nums2[nums2Index]) {
                nums1[lastIndex] = nums1[nums1Index];
                nums1Index--;
            } else {
                nums1[lastIndex] = nums2[nums2Index];
                nums2Index--;
            }
            lastIndex--;
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


