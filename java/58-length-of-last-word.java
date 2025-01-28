class Solution{
    public int lengthOfLastWord(String s) {

        // validation
        if (s == null || s.isEmpty() || s.length() > 10_000) {
            throw new IllegalArgumentException("Invalid input String");
        }

        s = s.trim(); // trim the string to remove leading and trailing spaces
        int length = 0;

        // iterate from the end of the string
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length > 0) {
                break;
            }
        }

        return length;
    }
}