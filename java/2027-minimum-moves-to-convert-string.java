class Solution {
    public int minimumMoves(String s) {

        // validation
        if (s == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        int moves = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == 'X') {
                moves++;
                i += 3; // skip next 2 positions
            } else {
                i++;
            }
        }
        return moves;
    }
}