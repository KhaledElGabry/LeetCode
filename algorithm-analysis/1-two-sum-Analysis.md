## [1. Two Sum](https://leetcode.com/problems/two-sum/)

### Approach I: Brute Force

#### Java:
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                        return new int[] { i, j };
            }
        }
        return null;
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


### Approach II: HashTable

#### Java:
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                return new int[] { map.get(target - nums[i]), i };
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[] { -1, -1 };
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


### Approach III: Two Pointers with Array

#### Java:
```java
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        
        // create array to hold the original indices
        Integer[] indices = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            indices[i] = i;
        }

        // sort the indices based on the values
        Arrays.sort(indices, Comparator.comparingInt(i -> nums[i]));

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int currentSum = nums[indices[left]] + nums[indices[right]];

            if (currentSum == target) {
                return new int[]{indices[left], indices[right]};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
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

- *Time Complexity:* $O(n\ log\ n)$ 
- *Space Complexity:* $O(n)$

If the Array needs to be sorted first, Sorting the array takes $O(n\ log\ n)$ time (merge sort). after sorting, the two pointers traversal takes $O(n)$ time.
If the array is already sorted, we skip the sorting step. so the two pointers traversal takes $O(n)$ time.

---