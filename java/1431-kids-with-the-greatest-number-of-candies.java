class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // validation
        if (candies.length < 2 || candies.length > 100 || extraCandies < 1 || extraCandies > 50) {
            throw new IllegalArgumentException("Invalid");
        }

        // find the greatest Candy value
        int greatestCandies = 0;
        for (int candy : candies) {
            greatestCandies = Math.max(candy, greatestCandies);
        }

        int n = candies.length;
        List<Boolean> resultList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= greatestCandies) {
                resultList.add(i, true);
            } else {
                resultList.add(i, false);
            }
        }

        return resultList;
    }
}