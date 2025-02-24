class Solution {
    public boolean isPalindrome(int x) {

        String numberAsString = String.valueOf(x); // convert int to string
        int start = 0;
        int end = numberAsString.length() - 1;

        for (int i = 0; i < numberAsString.length(); i++) {
            if (numberAsString.charAt(start) == numberAsString.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}