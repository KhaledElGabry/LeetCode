<br>
<h1 align="center">Algorithm Analysis</h1>

## [2824. Count Pairs Whose Sum is Less than Target](https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/)

### Approach I: Brute Force

#### Java:
```java
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        if (nums.isEmpty() || nums.size() > 50 ) throw new IllegalArgumentException("invalid input");

        int pairsCount = 0 ;
        int i,j;
        for (i = 0; i < nums.size(); i++) {
            for (j = 1; j < nums.size(); j++) {
                if(i < j && nums.get(i) + nums.get(j) < target){
                    pairsCount++;
                }
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

- *Time Complexity:* $O(\ n²)$
- *Space Complexity:* $O(\ 1)$


---


