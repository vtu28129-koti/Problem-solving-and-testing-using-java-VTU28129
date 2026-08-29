import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            // If number is already present
            if (set.contains(num)) {
                return true;
            }

            // Add number to set
            set.add(num);
        }

        return false;
    }
}

OUTPUT:
Input
nums =
[1,2,3,1]
Output
true
