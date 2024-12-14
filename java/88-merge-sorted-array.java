class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int isNumberOfItemsInNums = 0;
        for (int i : nums1) {
            if (i != 0) {
                isNumberOfItemsInNums++;
            }
        }
        if (isNumberOfItemsInNums != m || nums2.length != n || m + n > 200){
            throw new IllegalArgumentException("invalid");
        }


        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        if (n == 0) {
            return;
        }


        // store original nums1 items
        int[] originalNums1 = new int[m];
        for (int i = 0; i < m; i++) {
            originalNums1[i] = nums1[i];
        }

        // sort both arrays
        mergeSortRecursive(originalNums1, 0, originalNums1.length - 1);
        mergeSortRecursive(nums2, 0, nums2.length - 1);


        int originalArrayIndex = 0;
        int nums2Index = 0;
        int mergedArrayIndex = 0;

        // compare and merge items
        while (originalArrayIndex < m && nums2Index < n) {
            if (originalNums1[originalArrayIndex] <= nums2[nums2Index]) {
                nums1[mergedArrayIndex] = originalNums1[originalArrayIndex];
                originalArrayIndex++;
            } else {
                nums1[mergedArrayIndex] = nums2[nums2Index];
                nums2Index++;
            }
            mergedArrayIndex++;
        }

        // copy remaining items from originalNums1 if there is remain
        while (originalArrayIndex < m) {
            nums1[mergedArrayIndex] = originalNums1[originalArrayIndex];
            originalArrayIndex++;
            mergedArrayIndex++;
        }

        // copy remaining items from nums2 if there is remain
        while (nums2Index < n) {
            nums1[mergedArrayIndex] = nums2[nums2Index];
            nums2Index++;
            mergedArrayIndex++;
        }

    }


    static void mergeSortRecursive(int[] array, int start, int end){
        if (end <= start) return;
        int midpoint = (end + start) / 2;
        mergeSortRecursive(array, start, midpoint);
        mergeSortRecursive(array, midpoint + 1, end);
        mergeSort(array, start, midpoint, end);
    }
    static void mergeSort(int[] array, int start, int midpoint, int end){
        int leftLength = midpoint - start + 1;
        int rightLength = end - midpoint;
        int[] leftArray = new int[leftLength];
        int[] rightArray = new int[rightLength];

        for (int i = 0; i < leftLength; i++) {
            leftArray[i] = array[start + i];
        }

        for (int j = 0; j < rightLength; j++) {
            rightArray[j] = array[midpoint + 1 + j];
        }

        int i = 0, j = 0;
        int k = start;

        while (i < leftLength && j < rightLength){
            if(leftArray[i] <= rightArray[j]){
                array[k] = leftArray[i];
                i++;
            }else{
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftLength){
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightLength){
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}