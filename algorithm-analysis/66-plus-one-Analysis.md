## [66. Plus One](https://leetcode.com/problems/plus-one/)

### Approach I: Greedy

#### Java:
```java
    class Solution {
    public int[] plusOne(int[] digits) {
        
        // traverse the array from the last digit to the first
        for (int i = digits.length - 1; i >= 0; i--) {
            
            if (digits[i] < 0 || digits[i] > 9) { // validation for for each digit
                throw new IllegalArgumentException("Invalid Array item: "+ digits[i]);
            }

            if (digits[i] < 9) {  // if current digit is less than 9, increment it by one and return
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // if digit is 9, set it to 0 (carry over to the next digit)
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
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
