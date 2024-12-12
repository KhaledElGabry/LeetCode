<br>
<h1 align="center">Algorithm Analysis</h1>

## [1108. Defanging an IP Address](https://leetcode.com/problems/defanging-an-ip-address)

### Approach I: Using Regex

#### Java:
```java
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
```

[//]: # (#### Go:)

[//]: # (```go)

[//]: # (func solution&#40;&#41; {)

[//]: # ()
[//]: # (})

[//]: # (```)

### Complexity Analysis:

- *Time Complexity:* $O(1)$
- *Space Complexity:* $O(1)$


---


