class Solution {
    public String reverseWords(String s) {

        // validations
        if (s == null || s.isEmpty()) {
            System.out.println("Text is Empty, string cannot be null or empty");
            return "";
        }

        if (s.charAt(0) == ' ' || s.charAt(s.length() - 1) == ' ') {
            throw new IllegalArgumentException("Invalid, Text is leading or trailing spaces, try again!");
        }

        if (s.replaceAll("\\s", "").equals(s)) {
            return reverseString(s);
        }

        String[] words = s.split(" ");
        StringBuilder revWords = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            revWords.append(reverseString(words[i]));

            if (i < words.length - 1) {
                revWords.append(" ");
            }
        }

        return revWords.toString();
    }

    private String reverseString(String str) {
        char[] characters = str.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }

        return String.valueOf(characters);
    }
}