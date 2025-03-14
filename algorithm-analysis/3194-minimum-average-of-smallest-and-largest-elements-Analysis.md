## [3194. Minimum Average of Smallest and Largest Elements](https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/)

### Approach I: Two Pointers

#### Java:
```java
public class Solution {
    public double minimumAverage(int[] nums) {

        Arrays.sort(nums); // sort the input array

        double minAvg = Double.MAX_VALUE;
        int left = 0;
        int right = nums.length - 1;

        for (int i = 0; i < nums.length / 2; i++) {
            double avg = (nums[left] + nums[right]) / 2.0;
            
            if (avg < minAvg) {
                minAvg = avg;
            }

            left++;
            right--;
        }

        return minAvg;
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
- *Space Complexity:* $O(1)$


---

