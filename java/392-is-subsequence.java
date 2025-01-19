class Solution {
    public boolean isSubsequence(String s, String t) {

        // validation
        if (s == null || t == null) {
            throw new IllegalArgumentException("Strings Cannot be null");
        }

        if (s.length() > 100 || t.length() > 10_000) {
            throw new IllegalArgumentException("Invalid input");
        }

        if (s.isEmpty()) {
            return true;
        }

        int left = 0; // to track position of s
        int right = 0; // to track position of t

        while (right < t.length()) {
            if (s.charAt(left) == t.charAt(right)) {
                left++;
                if (left == s.length()) { // if we've matched all chars in sub
                    return true;
                }
            }
            right++; // always move right pointer
        }

        return false; // if we haven't found all characters of sub
    }
}