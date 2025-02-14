## [35. Search Insert Position](https://leetcode.com/problems/search-insert-position/)

### Approach I: Binary Search

#### Java:
```java
class Solution {
    public int searchInsert(int[] nums, int target) {

        // validation
        if(nums == null){
            throw new IllegalArgumentException("Invalid array input");
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

#### Go:

```go
func searchInsert(nums []int, target int) int {

    // validation
    if nums == nil {
        panic("Invalid array input")
    }

    var low int = 0
    var high int = len(nums) - 1
    
    for low <= high {
        var mid int = (low + high) / 2 // calculate the midpoint
    
        if nums[mid] == target {
            return mid
        } else if nums[mid] < target {
            low = mid + 1 // move low after mid
        } else {
            high = mid - 1 // move high before mid
        }
    }
    
    return low // low will always be where target should be inserted
}
```

### Complexity Analysis:

- *Time Complexity:* $O(log\ n)$
- *Space Complexity:* $O(1)$


---

