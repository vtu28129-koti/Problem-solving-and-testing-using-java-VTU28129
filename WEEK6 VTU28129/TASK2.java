class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        // Search for 's' within (s + s) excluding the first and last character
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }
}
OUTPUT:
Input
s =
"abab"
Output
true
