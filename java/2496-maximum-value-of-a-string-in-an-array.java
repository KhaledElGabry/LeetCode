class Solution {

    // using (Try-Catch) try to parsing string if applicable
    public int maximumValueTry(String[] strs) {

        // validations
        if (!(strs.length >= 1) || !(strs.length <= 100)) {
            throw new IllegalArgumentException("invalid");
        }

        int maxValue = 0;
        for (String str : strs) {
            if (str.length() <= 9) {
                try {
                    int numValue = Integer.parseInt(str); // parse the string as an integer if applicable
                    maxValue = Math.max(maxValue, numValue);
                } catch (NumberFormatException e) {
                    maxValue = Math.max(maxValue, str.length()); // use the string length
                }
            }
        }

        return maxValue;
    }


    // using helper method to parsing string
    public int maximumValue(String[] strs) {

        // validations
        if (!(strs.length >= 1) || !(strs.length <= 100)) {
            throw new IllegalArgumentException("invalid");
        }

        int maxValue = 0;
        for (String str : strs) {
            maxValue = Math.max(maxValue, parser(str));
        }

        return maxValue;
    }

        private int parser(String str) {
            for (int i = 0; i < str.length(); ++i) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    return str.length();
                }
            }
            return Integer.parseInt(str);
        }

}