class Solution {
    public int scoreOfString(String s) {
        int score = 0;

        for (var i = 1; i < s.length(); i++){
            char prevChar = s.charAt(i-1);
            char currentChar = s.charAt(i);
            score += Math.abs(prevChar - currentChar);
        }

        return score;
    }
}