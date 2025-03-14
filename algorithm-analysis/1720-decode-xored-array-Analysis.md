## [1720. Decode XORed Array](https://leetcode.com/problems/decode-xored-array/)

### Approach I: 

#### Java:
```java
class Solution {
    public int[] decode(int[] encoded, int first) {

        // validations
        if (encoded.length < 1 || first > 100_000) {
            throw new IllegalArgumentException("invalid");
        }

        int[] decode = new int[encoded.length + 1];
        decode[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            decode[i + 1] = encoded[i] ^ decode[i];
        }

        return decode;
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
