## [345. Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75)

### Approach I: Two Pointers

#### Java:
```java
class Solution {
    public String reverseVowels(String s) {

        // validation
        if(s.isEmpty() || s.length() > 300_000){
            throw new IllegalArgumentException("Invalid Input");
        }

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        final String vowels = "aeiouAEIOU";

        while(left < right){

            // moving the left pointer to the next vowel
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }

            // moving the right pointer to the next vowel
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }

            // reverse
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return String.valueOf(chars);
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

