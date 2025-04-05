class Solution {
    public int minimumSum(int num) {
        // convert number to array of digits
        int[] digits = new int[4];
        int index = 0;

        while (num > 0) {
            digits[index] = num % 10;
            num /= 10;
            index++;
        }

        Arrays.sort(digits); // sort digits
        // form two numbers and put smallest digits in tens place (multiply by 10)
        int new1 = digits[0] * 10 + digits[2];
        int new2 = digits[1] * 10 + digits[3];

        return new1 + new2;
    }
}