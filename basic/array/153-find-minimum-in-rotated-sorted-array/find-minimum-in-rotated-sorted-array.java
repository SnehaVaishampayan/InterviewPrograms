class Solution {
    public int findMin(int[] nums) {
        // TEMPLATE Binary Search

        // Recursively 
        //      find mid
        //      for mid .. check if it is min by comparing with sides.. 
        //      if not move to unsorted part
        //      if start < end .. means sorted.. 
        //      else .. search here 


        if(nums == null || nums.length == 0) {
            return -1;
        } 
        if( nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            return nums[0] < nums[1] ? nums[0] : nums[1];
        }

        int start = 0; int end = nums.length-1;

        if(nums[start] <= nums[end]) {
            return nums[start];
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if( (end-start) == 1) {         // While terminating condition
                return nums[end];
            }

            if( nums[start] >= nums[mid]){      // UNSorted Array
                end = mid;
            }
            else {
                start = mid;    
            }
        }
        return -1;
    }
}