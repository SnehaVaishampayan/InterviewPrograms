class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();        
        // traverse nums
        // define startPtr = 0; endPtr = 1;
        // while nums[endPtr] = nums[endPtr-1] +1 .. increase endPtr++
        // add startPtr-> endPtr num to result
        if(nums == null || nums.length == 0) {
            return result;
        }
        if(nums.length == 1) {
             result.add(nums[0]+"");
             return result;
        }
        int startPtr = 0; int endPtr = 1;
        while(endPtr < nums.length) {
            if(nums[endPtr] == nums[endPtr-1] + 1 ){
                endPtr++;
            }
            else {
                if(nums[startPtr] == nums[endPtr-1])
                    result.add(nums[startPtr]+"");
                else {
                    result.add(nums[startPtr]+"->"+nums[endPtr-1]);                
                }
                
                startPtr = endPtr;
                endPtr++;
            }
        }
        if(nums[startPtr] == nums[endPtr-1])
            result.add(nums[startPtr]+"");
        else {
            result.add(nums[startPtr]+"->"+nums[endPtr-1]);                
        }
        return result;
    }
}