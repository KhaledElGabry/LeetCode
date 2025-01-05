## [344. Reverse String](https://leetcode.com/problems/reverse-string/)

### Approach I:  Two-Pointer Technique

#### Java:
```java
class Solution {
    public void reverseString(char[] s) {

        //validations
        if (s.length == 0) {
            System.out.print("Invalid Input");
            return;
        }

        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
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

