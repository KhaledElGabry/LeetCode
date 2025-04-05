class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxOfWords = 0;
        String sentenceWithMostSpaces = "";

        for (String sentence : sentences) {
            int currentSpaces = 1 + sentence.length() - sentence.replace(" ", "").length();
            if (currentSpaces > maxOfWords) {
                maxOfWords = currentSpaces;
                sentenceWithMostSpaces = sentence;
            }
        }

        return maxOfWords;
    }
}