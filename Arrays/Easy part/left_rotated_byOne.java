class Solution {
    public void rotateArrayByOne(int[] nums) {
        int n = nums.length;
        int temp = nums[0];
        for (int i = 1; i < n; i++) {
            nums[i - 1] = nums[i];
        }
        nums[n - 1] = temp;
    }
}

// left rotated array by k places
class Solution {

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);

        // int n = arr.length;

        // for(int i = 0; i < (k%n); i++){
        // int temp = arr[0];
        // for(int j=1; j<n; j++){
        // arr[j-1] = arr[j];
        // }
        // arr[n-1] = temp;
        // }

        // optimal solution..

    }
}