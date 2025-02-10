class Solution {
     public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

          //validation
          if (word1.length > 1000 || word2.length > 1000) {
               throw new IllegalArgumentException("Invalid array input");
          }

          String str1 = String.join("", word1);
          String str2 = String.join("", word2);

          return str1.equals(str2);
     }
}