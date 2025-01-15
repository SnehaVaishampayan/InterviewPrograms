class Solution {
    public void rotate(int[] nums, int k) {
        // if(nums == null || nums.length <= 1) {
        //     return ;
        // } 
        if(nums.length <= k) {
            k = k % nums.length;
        }

        // rotate array len - k = 7 - 3 .. 4 that is 0 1 2 3
        reverseArray(nums, 0, nums.length - k - 1);
        reverseArray(nums, nums.length - k, nums.length - 1);
        reverseArray(nums, 0, nums.length - 1);
        
    }

    private void reverseArray(int[] arr, int left, int right) {
        while(left < right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }
}