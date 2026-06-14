/*
 * Given an integer array nums, return the largest element in the array.
 * 
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: 3
 * Explanation: The largest element in the array is 3.
 * 
 * Example 2:
 * Input: nums = [1,5,2,4]
 * Output: 5
 * Explanation: The largest element in the array is 5.
 * 
 * Constraints:
 * - 1 <= nums.length <= 100
 * - -10^4 <= nums[i] <= 10^4
 */
class Solution {
    public int largestElement(int[] nums) {
        int largest = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
        }
        return largest;
    }
}