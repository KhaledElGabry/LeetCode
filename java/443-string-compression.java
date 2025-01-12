class Solution {
    public int compress(char[] chars) {

        // validation
        if (chars == null || chars.length > 2000) {
            throw new IllegalArgumentException("Invalid input");
        }

        int write = 0;
        int read = 0;
        int n = chars.length;

        while (read < n) {
            char currentChar = chars[read];
            int charCounter = 0;

            while (read < n && chars[read] == currentChar) {
                read++;
                charCounter++;
            }

            // write the character
            chars[write] = currentChar;
            write++;

            // write character count if greater than 1
            if (charCounter > 1) {
                String countStr = String.valueOf(charCounter);
                for (char digit : countStr.toCharArray()) {
                    chars[write] = digit;
                    write++;
                }
            }

        }

        return write;
    }
}