class Solution {
    public int balancedStringSplit(String s) {

        // validations
        if (!(s.length() >= 2) || !(s.length() <= 1000)) {
            throw new IllegalArgumentException("invalid");
        }

        int balance = 0;
        int count = 0;
        for (char c : s.toCharArray()) {

            if (c == 'R') {
                balance++;
            } else if (c == 'L') {
                balance--;
            }

            if (balance == 0) {
                count++;
            }
        }

        return count;
    }
}