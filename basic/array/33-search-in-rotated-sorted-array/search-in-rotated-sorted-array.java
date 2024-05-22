// 3:50 - 4:05
class Solution {
    public int search(int[] nums, int target) {
        // binary search
        // get the mid..    if nums[mid] == target.. return mid
        //                  if nums[start] < nums[mid] // left is sorted
        //                         if (target between start and mid) .. binary search left
        //                         else .. binary search right
        //                  else if nums[mid] < nums[right] // right is sorted. 
        //                        if (target between start and mid) .. binary search right
        //                        else .. binary search left

        int start = 0; int end = nums.length - 1; int mid = 0;
        while(start <= end) {
            mid = start + ( end - start)/2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[start] <= nums[mid]) {
                if(nums[start] <= target && target < nums[mid]) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                if(nums[mid] < target && target <= nums[end]) {
                    // search right
                    start = mid+1;
                }
                else {
                    // search left
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}