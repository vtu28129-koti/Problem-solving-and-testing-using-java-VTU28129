import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        
        int sLen = s.length();
        int pLen = p.length();
        
        // Edge case: if p is longer than s, p cannot be an anagram of any substring in s
        if (sLen < pLen) {
            return result;
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Fill frequency array for p and the first window of s
        for (int i = 0; i < pLen; i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        // Compare the first window
        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }

        // Slide the window across string s
        for (int i = pLen; i < sLen; i++) {
            // Add the new character entering the window
            sCount[s.charAt(i) - 'a']++;
            // Remove the character leaving the window
            sCount[s.charAt(i - pLen) - 'a']--;

            // If frequencies match, record the start index
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - pLen + 1);
            }
        }

        return result;
    }
}
OUTPUT:
Input
s =
"cbaebabacd"
p =
"abc"
Output
[0,6]
