## [541. Reverse String II](https://leetcode.com/problems/reverse-string-ii/)

### Approach I: Two Pointers

#### Java:
```java
class Solution {
    public String reverseStr(String s, int k) {

        // validation
        if (s.length() < 1 || s.length() > 10000) {
            throw new IllegalArgumentException("String length must be between 1 and 10000");
        }
        if (k < 1 || k > 10000) {
            throw new IllegalArgumentException("k must be between 1 and 10000");
        }

        char[] charArray = s.toCharArray();
        int n = charArray.length;

        // iterate over the string in steps of 2k
        for (int start = 0; start < n; start += 2 * k) {

            int end = start + k - 1;
            if (end >= n) {
                end = n - 1;
            }

            reverse(charArray, start, end); // reverse the characters from start to end
        }

        return new String(charArray);
    }

    // helper function to reverse a portion of characters
    private void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
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

