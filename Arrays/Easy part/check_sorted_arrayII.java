class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        int n = nums.size();
        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}