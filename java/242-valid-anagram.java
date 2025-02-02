class Solution{
    public boolean isAnagram(String s, String t) {

        //validation
        if (s.isEmpty() || t.isEmpty() || s.length() > 50_000 || t.length() > 50_000) {
            throw new IllegalArgumentException("Invalid input length");
        }

        if (s.length() != t.length()) {
            return false;
        }

        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        Arrays.sort(charsS);
        Arrays.sort(charsT);

        return Arrays.equals(charsS, charsT);
    }
}
