class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        
        int maxKadane = nums[0];
        int currentMax = 0;
        
        int minKadane = nums[0];
        int currentMin = 0;
        
        for (int num : nums) {
            // Standard Kadane's algorithm for Max Subarray
            currentMax = Math.max(num, currentMax + num);
            maxKadane = Math.max(maxKadane, currentMax);
            
            // Modified Kadane's algorithm for Min Subarray
            currentMin = Math.min(num, currentMin + num);
            minKadane = Math.min(minKadane, currentMin);
            
            totalSum += num;
        }
        
        // Edge Case: If all numbers are negative, maxKadane is the largest negative number.
        // totalSum - minKadane would equal 0 (an empty subarray, which is invalid).
        if (maxKadane < 0) {
            return maxKadane;
        }
        
        return Math.max(maxKadane, totalSum - minKadane);
    }
}
OUTPUT:
Input
nums =
[1,-2,3,-2]
Output
3
