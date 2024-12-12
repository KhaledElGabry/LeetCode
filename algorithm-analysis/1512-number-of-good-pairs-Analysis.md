<br>
<h1 align="center">Algorithm Analysis</h1>

## [1512. Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)

### Approach I: Using Nested loop

#### Java:
```java
class Solution {
    public int numIdenticalPairs(int[] nums) {
        if (nums == null || nums.length < 1 || nums.length > 100) {
            throw new IllegalArgumentException("Array length must be between 1 and 100");
        }

        int goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    goodPairs++;
                }
            }
        }
        return goodPairs;
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
- *Space Complexity:* $O(n²)$


---

### Approach II: Using HashMap

#### Java:
```java
class Solution {
    public int numIdenticalPairs(int[] nums) {

        if (nums == null || nums.length < 1 || nums.length > 100) {
            throw new IllegalArgumentException("Array length must be between 1 and 100");
        }

        HashMap<Integer, Integer> freq = new HashMap<>();
        int goodPairs = 0;

        for (int num : nums){
            if(freq.containsKey(num)){
                goodPairs += freq.get(num);
            }
            freq.put(num, freq.getOrDefault(num,0) + 1);
        }

        return goodPairs;
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
- *Space Complexity:* $O(n)$


---

