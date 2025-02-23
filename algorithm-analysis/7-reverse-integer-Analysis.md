## [7. Reverse Integer](https://leetcode.com/problems/reverse-integer/)

### Approach I: Modulus and Division

#### Java:
```java
class Solution {
    public int reverse(int x) {

        // validation
        if (x == 0) return 0;

        int result = 0;
        while (x != 0) {
            int digit = x % 10; // last digit

            // check for overflow before multiplying
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 ||
                    (result == Integer.MIN_VALUE / 10 && digit < Integer.MIN_VALUE % 10)) {
                return 0;
            }
            result = result * 10 + digit;

            x = x / 10; // remove the last digit from x
        }
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

- *Time Complexity:* $O(log\ n)$
- *Space Complexity:* $O(1)$

---