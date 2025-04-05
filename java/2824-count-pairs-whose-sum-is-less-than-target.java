class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums); // sort the list

        int pairsCount = 0;
        int start = 0;
        int end = nums.size() - 1;

        while (start < end){
            if (nums.get(start) + nums.get(end) < target){
                pairsCount += end - start;
                start++;
            } else {
                end--;
            }
        }

        return pairsCount;
    }
}