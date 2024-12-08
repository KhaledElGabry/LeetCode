<br>
<h1 align="center">Algorithm Analysis</h1>

## [1678. Goal Parser Interpretation](https://leetcode.com/problems/goal-parser-interpretation/)

### Approach I: Using Replace Method

#### Java:
```java
class Solution {
    public String interpret(String command) {
        if (command.isEmpty() || command.length() > 100 || !command.contains("()") || !command.contains("(al)") || !command.contains("G")) {
            System.out.println("invalid input");
        }

        String goalParser = command;
        goalParser = goalParser.replace("()","o");
        goalParser = goalParser.replace("(al)","al");
        return goalParser;
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

- *Time Complexity:* $O(\ n)$
- *Space Complexity:* $O(\ n)$


---


