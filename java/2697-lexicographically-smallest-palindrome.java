class Solution {
    public String makeSmallestPalindrome(String s) {

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // replace the character with the smaller one to ensure lexicographical order
            if (chars[left] != chars[right]) {
                char min = (char) Math.min(chars[left], chars[right]);
                chars[left] = min;
                chars[right] = min;
            }

            left++;
            right--;
        }

        return new String(chars);
    }
}