## [2469. Convert the Temperature](https://leetcode.com/problems/convert-the-temperature/)

### Approach I: 

#### Java:
```java
class Solution {
    public double[] convertTemperature(double celsius) {

        double[] ans = new double[2];

        if (celsius >= 0.0 && celsius <= 1000) {

            double kelvin = celsius + 273.15;
            double fahrenheit = celsius * 1.80 + 32.00;
            ans[0] = kelvin;
            ans[1] = fahrenheit;
        }
        return ans;
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

- *Time Complexity:* $O(1)$
- *Space Complexity:* $O(1)$


---