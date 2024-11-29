class Solution {
    public String defangIPaddr(String address) {

        String ipv4Regex = "^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])" + "(\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])){3}$";
        String ipDefang;

        if (address == null || address.isEmpty() || !address.matches(ipv4Regex)) {
            return "Empty or False IP Address";
        }else {
            ipDefang = address.replace(".","[.]");
        }
        return ipDefang;
    }
}