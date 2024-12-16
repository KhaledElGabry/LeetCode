class Solution {
    public int scoreOfString(String s) {
        if (s.length() < 2 || s.length() > 100) {
            throw new IllegalArgumentException("invalid");
        }
        s = s.toLowerCase();

        int score = 0;
        for (var i = 1; i < s.length(); i++) {
            char prevChar = s.charAt(i - 1);
            char currentChar = s.charAt(i);
            score += Math.abs(prevChar - currentChar);
        }

        return score;
    }
}