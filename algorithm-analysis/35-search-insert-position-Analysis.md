## [35. Search Insert Position](https://leetcode.com/problems/search-insert-position/)

### Approach I: Binary Search

#### Java:
```java
class Solution {
    public int searchInsert(int[] nums, int target) {

        // validation
        if(nums == null || nums.length < 1|| nums.length > 10_000){
            throw new IllegalArgumentException("Invalid array input");
        }
        if(target < -10_000 || target > 10_000){
            throw new IllegalArgumentException("Invalid target value");
        }

        int low = 0;
        int high = nums.length - 1;

        while (low <= high){
            int mid = (low + high) / 2; // calculate the midpoint

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){ // move low after mid
                low = mid + 1;
            }else {
                high = mid - 1; // move high before mid
            }

        }

        return low; // low will always be where target should be inserted
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
- *Space Complexity:* $O(1)$


---

