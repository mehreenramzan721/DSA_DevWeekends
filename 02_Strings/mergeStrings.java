/*1768. Merge Strings Alternately
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.
*/
class mergeStrings {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result =new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(j)); 
            i++;
            j++;
        }
        while (i < word1.length()) result.append(word1.charAt(i++));
        while (j < word2.length()) result.append(word2.charAt(j++));
        return result.toString();
    }
}
