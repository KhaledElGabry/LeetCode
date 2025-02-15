class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String i : operations) {
            X = i.equals("++X") || i.equals("X++") ? 1 + X : X - 1;
        }
        return X;
    }
}