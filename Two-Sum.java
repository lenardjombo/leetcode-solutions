import java.util.HashMap;
import java.util.Map;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its index
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        // Iterate through the list of numbers
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement number needed to reach the target
            int complement = target - nums[i];
            
            // Checked if the complement number is already in the HashMap
            if (numToIndex.containsKey(complement)) {
                // If found, return the indices of the complement and the current number
                return new int[] { numToIndex.get(complement), i };
            }
            
            // Otherwise, add the number and its index to the HashMap
            numToIndex.put(nums[i], i);
        }
        
        // If no solution is found, throw an exception or return an empty array
        throw new IllegalArgumentException("No two sum solution");
    }
}
