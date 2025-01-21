## [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

### Approach I: Two Pointers

#### Java:
```java
class Solution{
    public int removeDuplicates(int[] nums) {

        // validation
        if(nums.length < 1 || nums.length > 30_000){
            throw new IllegalArgumentException("Invalid input");
        }

        int nextNonDuplicate = 1; // keeps track the position of next unique item

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < -100 || nums[i] > 100){
                throw new IllegalArgumentException("Invalid item value: "+ nums[i]);
            }

            if(nums[nextNonDuplicate - 1] != nums[i]){
                nums[nextNonDuplicate] = nums[i];
                nextNonDuplicate++;
            }
        }

        return nextNonDuplicate;
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
- *Space Complexity:* $O(1)$


---

