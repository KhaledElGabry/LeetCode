## [2011. Final Value of Variable After Performing Operations](https://leetcode.com/problems/final-value-of-variable-after-performing-operations/)

### Approach I:

#### Java:
```java
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        if(1 <= operations.length && operations.length <= 100){
            for (String i : operations){
                X = i.equals("++X") || i.equals("X++") ? 1 + X : X - 1;
            }
        }else{
            throw new ArrayIndexOutOfBoundsException("Invalid Array Length, should be less than 100");
        }
        return X;
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


