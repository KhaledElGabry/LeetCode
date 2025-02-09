## [925. Long Pressed Name](https://leetcode.com/problems/long-pressed-name/)

### Approach I: Two Pointers

#### Java:
```java
class Solution {
    public boolean isLongPressedName(String name, String typed) {

        // validation
        if(name.isEmpty() || typed.isEmpty() || name.length() > 1000 || typed.length() > 1000){
            throw new IllegalArgumentException("Invalid Input");
        }

        int left = 0, right = 0;

        while (right < typed.length()) {

            if (left < name.length() && name.charAt(left) == typed.charAt(right)) {
                left++;
                right++;
            } else if (right > 0 && typed.charAt(right) == typed.charAt(right - 1)) {
                right++;
            } else {
                return false;
            }

        }

        return left == name.length();
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

