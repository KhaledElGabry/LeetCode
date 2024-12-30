## [1431. Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75)

### Approach I: Two-Pass

#### Java:
```java
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // validation
        if (candies.length < 2 || candies.length > 100 || extraCandies < 1 || extraCandies > 50) {
            throw new IllegalArgumentException("Invalid");
        }

        // find the greatest Candy value
        int greatestCandies = 0;
        for (int candy : candies) {
            greatestCandies = Math.max(candy, greatestCandies);
        }

        int n = candies.length;
        List<Boolean> resultList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= greatestCandies) {
                resultList.add(i, true);
            } else {
                resultList.add(i, false);
            }
        }

        return resultList;
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

