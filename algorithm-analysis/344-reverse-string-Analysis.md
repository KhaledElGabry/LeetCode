<br>
<h1 align="center">Algorithm Analysis</h1>

## [344. Reverse String](https://leetcode.com/problems/reverse-string/)

### Approach I:  Reverse Array in Place

#### Java:
```java
class Solution {
    public void reverseString(char[] s) {
        if (s.length == 0) {
            System.out.println("Invalid Input");
            return;
        }
        for (int i = 0; i < s.length / 2; i++) {
            char j = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = j;
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
- *Space Complexity:* $O(1)$


---


