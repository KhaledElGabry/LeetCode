class Solution {
    public String truncateSentence(String s, int k) {

        // Validations
        if (s == null || s.length() < 1 || s.length() > 500) {
            throw new IllegalArgumentException("invalid string");
        }

        String[] strToArray = s.split(" ");
        StringBuilder truncSentence = new StringBuilder();
        for (int i = 0; i < k; i++) {
            truncSentence.append(strToArray[i]).append(" ");
        }

        return truncSentence.substring(0, truncSentence.length() - 1);
    }
}