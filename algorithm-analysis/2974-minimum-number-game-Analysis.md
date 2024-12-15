## [2974. Minimum Number Game](https://leetcode.com/problems/minimum-number-game/)

### Approach I: Using Insertion Sort 

#### Java:
```java
class Solution {
    public int[] numberGame(int[] nums) {
        if (nums.length < 2 || nums.length > 100 || nums.length % 2 == 1) {
            throw new IllegalArgumentException("invalid input");
        }

        // sort nums using insertion sort
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j;
            for (j = i - 1; j >= 0 ; --j) {
                if(key < nums[j]) {
                    nums[j+1] = nums[j];
                }else break;
            }
            nums[j+1] = key;
        }

        int[] arr = new int[nums.length];

        // swap adjacent items
        for (int i = 0; i < nums.length; i += 2) {
            if (i + 1 < nums.length) {
                arr[i] = nums[i + 1];
                arr[i + 1] = nums[i];
            }
        }

        return arr;
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
- *Space Complexity:* $O(n)$


---

### Approach II: Using Builtin Sort Method

#### Java:
```java
class Solution {
    public int[] numberGame(int[] nums) {
        if (nums.length < 2 || nums.length > 100 || nums.length % 2 == 1) {
            throw new IllegalArgumentException("invalid input");
        }
        
        Arrays.sort(nums); // sort nums using Arrays.sort
        
        int[] arr = new int[nums.length];

        // swap adjacent items
        for (int i = 0; i < nums.length; i += 2) {
            if (i + 1 < nums.length) {
                arr[i] = nums[i + 1];
                arr[i + 1] = nums[i];
            }
        }

        return arr;
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

- *Time Complexity:* $O(n \ log\ n)$
- *Space Complexity:* $O( n)$


---


