class Solution{

    // first solution
    public int lengthOfLastWord1(String s) {

        s = s.trim(); // remove leading and trailing spaces
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

    // second solution more straightforward logic and readable
    public int lengthOfLastWord(String s) {

        s = s.trim(); // remove leading and trailing spaces
        int length = 0;

        // iterate from the end of the string
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            length++;
        }

        return length;
    }
}