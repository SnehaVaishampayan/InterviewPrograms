class Solution {
    public void rotate(int[] nums, int k) {
        //  Swap first nums.length-k elements.. 0 - (nums.length-k) 7-3 = 4
        //  Swap nums.length-k - nums.length-1 
        //  Swap full array
        if(nums == null || nums.length <= 0 ) {
            return;
        }
        if (k > nums.length) {
            k = k % nums.length;
        }
        int pivot = nums.length - k;  // 4
        nums = swapArray(nums, 0, pivot-1);
        nums = swapArray(nums, pivot, nums.length-1);
        nums = swapArray(nums, 0, nums.length-1);
    }
    private int[] swapArray(int[] nums, int start, int end) {
        while(start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++; end--;
        }
        return nums;
    }
}