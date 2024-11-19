class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // track left right ptrs.
        // if left ptr == odd .. swap with right .. move right
        // if rightptr is even swap with left move right.. 
        // else move right left

        int left = 0; int right = nums.length - 1;
        while(left < right) {
            if(nums[left]%2 != 0) {
                // its odd 
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            }
            else {
                left++;
            }
            if(nums[right]%2 == 0 ) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
            else {
                right--;
            }
        }
        return nums;
    }
}