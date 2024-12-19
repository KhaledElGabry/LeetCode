class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        if (words.length < 1 || words.length > 50) throw new IllegalArgumentException("invalid");

        ArrayList<Integer> countIndices = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].contains(String.valueOf(x))){
                countIndices.add(i);
            }
        }

        return countIndices;
    }
}