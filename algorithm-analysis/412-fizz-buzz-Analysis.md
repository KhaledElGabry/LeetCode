## [412. Fizz Buzz](https://leetcode.com/problems/fizz-buzz/)

### Approach I:

#### Java:
```java
class Solution {
    public static List<String> fizzBuzz(int n) {

        // validation
        if (n < 1 || n > 10_000) {
            throw new IllegalArgumentException("Invalid input");
        }

        List<String> answer = new ArrayList<String>(n);

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) answer.add("FizzBuzz");
            else if ((i + 1) % 3 == 0) answer.add("Fizz");
            else if ((i + 1) % 5 == 0) answer.add("Buzz");
            else answer.add(String.valueOf(i + 1));
        }

        return answer;
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

