## [2824. Count Pairs Whose Sum is Less than Target](https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/)

### Approach I: Brute Force

#### Java:
```java
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums); // sort the list

        int pairsCount = 0;
        int start = 0;
        int end = nums.size() - 1;

        while (start < end){
            if (nums.get(start) + nums.get(end) < target){
                pairsCount += end - start;
                start++;
            } else {
                end--;
            }
        }

        return pairsCount;
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

- *Time Complexity:* $O(n²)$
- *Space Complexity:* $O(1)$


---


