class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) { // If we see a zero, use one flip
            if (nums[right] == 0) {
                k--;
                
            }// If flips exceeded, move left pointer
            if (k < 0) {
                if (nums[left] == 0) {
                    k++; // restore flip
                }
                left++;
            }
        }// Final window size
        return nums.length - left;
    }
}