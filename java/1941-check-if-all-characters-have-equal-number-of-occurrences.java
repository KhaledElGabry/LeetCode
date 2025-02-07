class Solution {
    public boolean areOccurrencesEqual(String s) {

        // validation
        if (s == null || s.isEmpty() || s.length() > 1000) {
            return false;
        }

        HashMap<Character, Integer> charMap = new HashMap<>();

        // count occurrences of each character
        for (char ch : s.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        int frequency = -1; // get the first frequency as reference
        for (int count : charMap.values()) {
            if (frequency == -1) {
                frequency = count;  // set first freq
            } else if (count != frequency) {
                return false;  // diff freq found
            }
        }

        return true;
    }
}