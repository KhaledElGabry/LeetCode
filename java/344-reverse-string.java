class Solution {

    //Two-Pointer Technique
    public void reverseString(char[] s) {

        //validations
        if (s.length == 0) {
            System.out.print("Invalid Input");
            return;
        }

        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}