class Solution {
    public int sum(int num1, int num2) {
        if (num1 < -100 || num2 > 100)
            throw new IllegalArgumentException("Numbers must be between -100 and 100");
        return num1 + num2;
    }
}