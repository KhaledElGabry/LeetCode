class Solution {
    public String convertDateToBinary(String date) {

        // validations
        if (date == null ||
                date.length() != 10 ||
                date.charAt(4) != '-' ||
                date.charAt(7) != '-') {
            throw new IllegalArgumentException("invalid date format");
        }

        String year = date.substring(0, 4);
        String month = date.substring(5, 7);
        String day = date.substring(8, 10);
        StringBuilder binaryDate = new StringBuilder();

        binaryDate.append(Integer.toBinaryString(Integer.parseInt(year)));
        binaryDate.append("-");
        binaryDate.append(Integer.toBinaryString(Integer.parseInt(month)));
        binaryDate.append("-");
        binaryDate.append(Integer.toBinaryString(Integer.parseInt(day)));

        return binaryDate.toString();
    }
}