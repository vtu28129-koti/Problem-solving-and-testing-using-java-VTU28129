import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        
        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }
        
        String[] result = new String[n];
        int index = 0;
        for (int height : map.keySet()) {
            result[index++] = map.get(height);
        }
        
        return result;
    }
}

Output:
names = ["Mary", "John", "Emma"]
heights = [180,165,170]

["Mary", "Emma", "John"]
