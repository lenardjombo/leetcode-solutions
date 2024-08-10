class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int k = 0; // Pointer for the position of the last unique element
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the last unique element
            if (nums[i] != nums[k]) {
                k++; // Move the pointer for unique elements
                nums[k] = nums[i]; // Update the array with the new unique element
            }
        }
        
        return k + 1; // The length of the unique elements
    }
}
