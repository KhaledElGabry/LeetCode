class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        short numberOfEmployees = 0;
        for (var i = 0; i < hours.length; i++) {
            if(hours[i] >= target){
                ++numberOfEmployees;
            }
        }
        return numberOfEmployees;
    }
}