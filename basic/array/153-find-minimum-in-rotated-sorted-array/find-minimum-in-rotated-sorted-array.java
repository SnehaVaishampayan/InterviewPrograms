class Solution {
    public int findMin(int[] nums) {
        int start = 0; int end = nums.length-1;
        if(nums[start] < nums[end]) {
            return nums[start];
        }
        while(start <= end) {
            System.out.println("start " + start);
            System.out.println("end " + end);

            if((end - start) == 1) {
                return nums[end];
            }
            int mid = start + (end - start)/2;
            if(nums[start] > nums[mid]) {
                // Unsorted left 
                end = mid;
            }
            else if (nums[mid] > nums[end]) {
                start = mid;
            }
            else {
                return nums[start];
                }
        }
    
        return nums[start];
    }
}