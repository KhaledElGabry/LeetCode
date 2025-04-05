class Solution {
    public boolean isAnagram(String s, String t) {
        // convert the two strings into array of chars
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();

        // sort the characters
        Arrays.sort(charsS);
        Arrays.sort(charsT);

        return Arrays.equals(charsS, charsT);
    }
}