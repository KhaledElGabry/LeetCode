class Solution {
    public boolean isLongPressedName(String name, String typed) {

        // validation
        if (name.length() < 1 || typed.length() < 1 || name.length() > 1000 || typed.length() > 1000) {
            throw new IllegalArgumentException("Invalid");
        }

        int left = 0, right = 0;

        while (right < typed.length()) {

            if (left < name.length() && name.charAt(left) == typed.charAt(right)) {
                left++;
                right++;
            } else if (right > 0 && typed.charAt(right) == typed.charAt(right - 1)) {
                right++;
            } else {
                return false;
            }

        }

        return left == name.length();
    }
}