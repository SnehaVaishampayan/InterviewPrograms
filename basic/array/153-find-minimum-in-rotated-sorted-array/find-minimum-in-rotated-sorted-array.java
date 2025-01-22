class Solution {
    public int findMin(int[] nums) {
        // TEMPLATE Binary Search

        // Recursively while start <= end
        //      find mid
        //      if end-start == 1 .. while termination.. return end
        //      Look up to unsorted part
        //      if start > end .. means unsorted.. end = mid
        //      else .. search here .. start = mid


        if(nums == null || nums.length == 0) {
            return -1;
        } 
        // if( nums.length == 1) {
        //     return nums[0];
        // }

        int start = 0; int end = nums.length-1;
        while(start <= end) {

            if(nums[start] <= nums[end]) {
                return nums[start];
            }

            int mid = start + (end - start) / 2;
            if( nums[start] > nums[mid]){      // UNSorted Array
                end = mid;
            }
            else {
                start = mid+1;    
            }
        }
        return -1;
    }
}