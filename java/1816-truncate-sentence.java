class Solution {

    // approach1 using string builder with converting string to string array
    public String truncateSentences(String s, int k) {

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


    // approach2 using while loop to find kth word's end position
    public String truncateSentence(String s, int k) {
        if (s == null || s.length() < 1 || s.length() > 500) {
            throw new IllegalArgumentException("invalid string");
        }

        int wordCount = 0;
        int i = 0;
        while (i < s.length() && wordCount < k) {
            while (i < s.length() && s.charAt(i) != ' ') {
                i++;
            }

            wordCount++;
            if (wordCount < k) {
                i++;
            }
        }

        return s.substring(0, i);
    }

}