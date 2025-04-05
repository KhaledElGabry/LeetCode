class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        insertionSort(seats); // sort seats using insertion sort
        insertionSort(students); // sort students using insertion sort

        int totalMoves = 0;
        for (int i = 0; i < seats.length; i++) {
            totalMoves += Math.abs(students[i] - seats[i]);
        }

        return totalMoves;
    }

    // insertion-sort
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