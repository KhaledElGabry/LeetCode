## [2942. Find Words Containing Character](https://leetcode.com/problems/find-words-containing-character/)

### Approach I: Iterate on each Element

#### Java:
```java
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
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


