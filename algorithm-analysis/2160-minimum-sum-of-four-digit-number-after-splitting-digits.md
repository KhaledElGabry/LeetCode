## [2160. Minimum Sum of Four Digit Number After Splitting Digits](https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/)

### Approach I: Greedy

#### Java:
```java
class Solution {
    public int minimumSum(int num) {

        // validation
        if (num < 1000 || num > 9999) {
            throw new IllegalArgumentException("Invalid input");
        }


        // convert number to array of digits
        int[] digits = new int[4];
        int index = 0;
        while (num > 0) {
            digits[index] = num % 10;
            num /= 10;
            index++;
        }

        Arrays.sort(digits); // sort digits

        // form two numbers and put smallest digits in tens place (multiply by 10)
        int new1 = digits[0] * 10 + digits[2];
        int new2 = digits[1] * 10 + digits[3];

        return new1 + new2;
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

- *Time Complexity:* $O(1)$
- *Space Complexity:* $O(1)$


---

