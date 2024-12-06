class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        if(hours.length > 50 || target > 105) throw new IllegalArgumentException("invalid input");

        short numberOfEmployees = 0;

        for (var i = 0; i < hours.length; i++) {
            if(hours[i] >= target){
                ++numberOfEmployees;
            }
        }
        return numberOfEmployees;
    }
}