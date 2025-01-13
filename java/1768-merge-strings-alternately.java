class Solution {
    public String mergeAlternately(String word1, String word2) {

        // validation
        if (word1 == null || word2 == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        if (word1.isEmpty() || word2.isEmpty() || word1.length() > 100 || word2.length() > 100) {
            throw new IllegalArgumentException("Invalid Input");
        }
        if (!word1.toLowerCase().equals(word1) || !word2.toLowerCase().equals(word2)) {
            throw new IllegalArgumentException("Lower Case only");
        }

        int left = 0;
        int right = 0;
        StringBuilder result = new StringBuilder();

        // append characters of word1 then word1 one by one
        while (left < word1.length() && right < word2.length()) {
            result.append(word1.charAt(left));
            result.append(word2.charAt(right));

            left++;
            right++;
        }

        // append any remaining characters
        while (left < word1.length()) {
            result.append(word1.charAt(left));
            left++;
        }
        while (right < word2.length()) {
            result.append(word2.charAt(right));
            right++;
        }

        return result.toString();
    }
}