/*# **796. Rotate String**

Given two strings `s` and `goal`, return `true` *if and only if* `s` *can become* `goal` *after some number of **shifts** on* `s`.

A **shift** on `s` consists of moving the leftmost character of `s` to the rightmost position.

- For example, if `s = "abcde"`, then it will be `"bcdea"` after one shift.

*/
class Solution {
    public boolean rotateString(String s, String goal) {
        // brute force rotation simulation;
        // if (s.length() != goal.length()) 
        //     return false;
        // if (s.length() == 0)
        //     return true;
        // String current = s;
        // for (int i = 0; i < s.length(); i++) {
        //     if (current.equals(goal)) 
        //         return true;
        //     current = current.substring(1) + current.charAt(0);
        // }
        // return false;
        // 2nd approach concatenation
        if (s.length() != goal.length()) 
            return false;
        String doubled = s + s;
        return doubled.contains(goal);
    }
}
