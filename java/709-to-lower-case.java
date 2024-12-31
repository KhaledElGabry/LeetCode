class Solution {
    public String toLowerCase(String s) {

        //validation
        if (s.length() < 1 || s.length() > 100) {
            throw new IllegalArgumentException("Invalid String Length");
        }

        return s.toLowerCase();
    }
}