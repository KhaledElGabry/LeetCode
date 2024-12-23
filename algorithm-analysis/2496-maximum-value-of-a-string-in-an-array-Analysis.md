## [2496. Maximum Value of a String in an Array](https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/)

### Approach I: using helper Method to Parsing String item

#### Java:
```java
class Solution {
    public int maximumValue(String[] strs) {

        // validations
        if (!(strs.length >= 1) || !(strs.length <= 100)) {
            throw new IllegalArgumentException("invalid");
        }

        int maxValue = 0;
        for (String str : strs) {
            maxValue = Math.max(maxValue, parser(str));
        }

        return maxValue;
    }

        private int parser(String str) {
            for (int i = 0; i < str.length(); ++i) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    return str.length();
                }
            }
            return Integer.parseInt(str);
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

- *Time Complexity:* $O(n \cdot m)$ where $m$ is average length of the strings in the array.
- *Space Complexity:* $O(1)$


---


### Approach II: using (Try-Catch) try to parsing string if applicable

#### Java:
```java
class Solution {
    public int maximumValueTry(String[] strs) {

        // validations
        if (!(strs.length >= 1) || !(strs.length <= 100)) {
            throw new IllegalArgumentException("invalid");
        }

        int maxValue = 0;
        for (String str : strs) {
            if (str.length() <= 9) {
                try {
                    int numValue = Integer.parseInt(str); // parse the string as an integer if applicable
                    maxValue = Math.max(maxValue, numValue);
                } catch (NumberFormatException e) {
                    maxValue = Math.max(maxValue, str.length()); // use the string length
                }
            }
        }

        return maxValue;
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