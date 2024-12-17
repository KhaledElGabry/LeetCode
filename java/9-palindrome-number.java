class Solution {
    public static boolean isPalindrome(int x) {

        String xString = String.valueOf(x);
        if (xString.length() == 1)
            return true;
        if (xString.length() == 2 && xString.charAt(0) == xString.charAt(1))
            return true;

        while (xString.charAt(0) == xString.charAt(xString.length() - 1)) {

            if (xString.length() == 3)
                return true;
            if (xString.length() == 4 && xString.charAt(1) == xString.charAt(2))
                return true;
            if (xString.length() == 5 && xString.charAt(1) == xString.charAt(3))
                return true;
            if (xString.length() == 6 && xString.charAt(1) == xString.charAt(4)
                    && xString.charAt(2) == xString.charAt(3))
                return true;
            if (xString.length() == 7 && xString.charAt(1) == xString.charAt(5)
                    && xString.charAt(2) == xString.charAt(4))
                return true;
            if (xString.length() == 8 && xString.charAt(1) == xString.charAt(6)
                    && xString.charAt(2) == xString.charAt(5) && xString.charAt(3) == xString.charAt(4))
                return true;

            if (xString.length() == 9 && xString.charAt(1) == xString.charAt(7)
                    && xString.charAt(2) == xString.charAt(6) && xString.charAt(3) == xString.charAt(5))
                return true;

            if (xString.length() == 10 && xString.charAt(1) == xString.charAt(8)
                    && xString.charAt(2) == xString.charAt(7)
                    && xString.charAt(3) == xString.charAt(6)
                    && xString.charAt(4) == xString.charAt(5))
                return true;

            return false;
        }
        return false;
    }
}