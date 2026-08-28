class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        int countA = 0;
        int countB = 0;

        String vowels = "aeiouAEIOU";

        for (int i = 0; i < mid; i++) {
            if (vowels.indexOf(s.charAt(i)) >= 0) {
                countA++;
            }
        }

        for (int i = mid; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) >= 0) {
                countB++;
            }
        }

        return countA == countB;
    }
}

OUTPUT:
Input
s =
"book"
Output
true
