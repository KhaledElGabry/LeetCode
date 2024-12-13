## [2037. Minimum Number of Moves to Seat Everyone](https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/)

### Approach I: Insertion Sort

#### Java:
```java
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        if(seats.length != students.length || seats.length == 0 || students.length > 100){
            throw new IllegalArgumentException("invalid input");
        }

        insertionSort(seats); // sort seats using insertion sort
        insertionSort(students); // sort students using insertion sort

        int totalMoves = 0;
        for (int i = 0; i < seats.length; i++) {
            totalMoves += Math.abs(students[i] - seats[i]);
        }

        return totalMoves;
    }
    static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (key < array[j]) {
                    array[j + 1] = array[j];
                } else break;
            }
            array[j + 1] = key;
        }
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

- *Time Complexity:* $O(n²)$
- *Space Complexity:* $O(n)$


---


