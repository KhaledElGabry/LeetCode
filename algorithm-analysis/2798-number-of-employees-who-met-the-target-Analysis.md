## [2798. Number of Employees Who Met the Target](https://leetcode.com/problems/number-of-employees-who-met-the-target/)

### Approach I: 

#### Java:
```java
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        short numberOfEmployees = 0;
        for (var i = 0; i < hours.length; i++) {
            if(hours[i] >= target){
                ++numberOfEmployees;
            }
        }
        return numberOfEmployees;
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


