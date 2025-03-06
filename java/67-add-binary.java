class Solution {
    public String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            // add digit from a
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            // add digit from b
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2); // append current digit using remainder (0 or 1)
            carry = sum / 2; // update carry for next iteration
        }

        return result.reverse().toString();
    }
}