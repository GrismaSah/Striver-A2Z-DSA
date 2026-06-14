class Solution {
    public int secondLargestElement(int[] nums) {
       int first_largest = Integer.MIN_VALUE;
       int second_largest = Integer.MIN_VALUE;

       for(int i=0; i<nums.length; i++){
        if(nums[i]>first_largest){
            second_largest = first_largest;
            first_largest = nums[i];
        }else if(nums[i]> second_largest && nums[i] != first_largest){
            second_largest = nums[i];
        }
        }
        if(second_largest == Integer.MIN_VALUE){
            return -1;
        }
        return second_largest;
    }
}