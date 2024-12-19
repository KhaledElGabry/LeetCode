## [2942. Find Words Containing Character](https://leetcode.com/problems/find-words-containing-character/)

### Approach I: Contains Method

#### Java:
```java
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        if (words.length < 1 || words.length > 50) throw new IllegalArgumentException("invalid");

        ArrayList<Integer> countIndices = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].contains(String.valueOf(x))){
                countIndices.add(i);
            }
        }

        return countIndices;
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

- *Time Complexity:* $O(n \cdot m)$
- *Space Complexity:* $O(n)$


---


