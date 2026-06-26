/*# **242. Valid Anagram**

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.
*/

class validAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sArr =s.toCharArray();
        char[] tArr =t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
}
