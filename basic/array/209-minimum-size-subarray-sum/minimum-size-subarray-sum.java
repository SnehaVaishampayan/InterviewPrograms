class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // Traverse .. 
        //     unitl current sum is < target
        //     if == target.. calc resultLen 
        //     if currSum > target.. move start

        int start  = 0;
        int end = 0;
        int resultLen = Integer.MAX_VALUE;
        int currSum = 0;//nums[0];
        while(end < nums.length) {    //  
            System.out.println("currSum " + currSum);
            currSum = currSum + nums[end]; 
            end++;
            // if(nums[end] == target || nums[start] == target) {
            //     return 1;
            // }
            // else if( currSum >= target) {
            while(currSum >= target) {
                // calc result.. 
                // resultLen = resultLen == 0 ? end-start : Math.min(resultLen, end-start+1);
                resultLen = Math.min(resultLen, end-start);
                currSum = currSum - nums[start];
                start++;
                // end = start;
            }
        }
        System.out.println("start " + start);
        System.out.println("end " + end);
        return resultLen  == Integer.MAX_VALUE ? 0 :resultLen ;//Math.min(resultLen, end-start+1);
    }
}