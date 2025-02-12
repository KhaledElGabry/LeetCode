## [67. Add Binary](https://leetcode.com/problems/add-binary/)

### Approach I: Binary Addition

#### Java:
```java
class Solution {
    public String addBinary(String a, String b) {

        // validation
        if (!a.matches("[01]+") || !b.matches("[01]+")) {
            return "Invalid string inputs";
        }

        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            // add digit from a
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            // add digit from b
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2); // append current digit using remainder (0 or 1)
            carry = sum / 2; // update carry for next iteration
        }

        return result.reverse().toString();
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

- *Time Complexity:* $O(max(n, m))$ where $n$ and $m$ are lengths of input strings
- *Space Complexity:* $O(max(n, m))$ where $n$ and $m$ are lengths of the result strings

---