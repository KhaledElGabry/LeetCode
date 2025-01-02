## [9. Palindrome Number.](https://leetcode.com/problems/palindrome-number/)

### Approach I: Two Pointers
#### Java:
```java
class Solution {
    public boolean isPalindrome(int x) {

        // validation
        if (x > Integer.MAX_VALUE - 1) {
            throw new IllegalArgumentException("Invalid Number");
        }

        String numberAsString = String.valueOf(x);
        int start = 0;
        int end = numberAsString.length() - 1;

        for (int i = 0; i < numberAsString.length(); i++) {
            if (numberAsString.charAt(start) == numberAsString.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }

        return true;
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

