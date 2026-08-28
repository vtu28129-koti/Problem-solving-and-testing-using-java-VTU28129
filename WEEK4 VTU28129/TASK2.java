import java.util.*;

public class Main {

    public static boolean isLapindrome(String s) {
        int n = s.length();

        int[] left = new int[256];
        int[] right = new int[256];

        for (int i = 0; i < n / 2; i++) {
            left[s.charAt(i)]++;
        }

        for (int i = (n + 1) / 2; i < n; i++) {
            right[s.charAt(i)]++;
        }

        return Arrays.equals(left, right);
    }

    public static void main(String[] args) {

        String[] testCases = {
            "gaga",
            "abccab",
            "rotor",
            "xyzxy",
            "abbaab"
        };

        for (String s : testCases) {
            System.out.println(s + " -> " + isLapindrome(s));
        }
    }
}

Output:
gaga -> true
abccab -> true
rotor -> true
xyzxy -> false
abbaab -> true
