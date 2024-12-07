class Solution {
    public int countPairs(List<Integer> nums, int target) {
        if (nums.isEmpty() || nums.size() > 50 ) throw new IllegalArgumentException("invalid input");

        int pairsCount = 0 ;
        int i,j;

        for (i = 0; i < nums.size() ; i++) {
            for (j = 1; j < nums.size(); j++) {
                if(i < j && nums.get(i) + nums.get(j) < target){
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }
}