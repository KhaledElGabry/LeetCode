## [141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)

### Approach I: Fast & Slow Pointers

#### Java:
```java
public class Solution {
    public boolean hasCycle(ListNode head) {

        // validation
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        // move slow by 1 and fast by 2
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // they meet
            if (slow == fast) {
                return true;
            }
        }

        return false;
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

