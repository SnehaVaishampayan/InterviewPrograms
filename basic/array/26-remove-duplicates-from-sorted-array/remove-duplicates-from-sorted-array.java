class Solution {
    public int removeDuplicates(int[] nums) {
        //  Traverse array
        //      selectedEle .. 
        //      resItr == selectedEle
        //      while currEle == selectedEle.. 
        //          move itr
        
        if(nums.length <= 1) {
            return nums.length;
        }
        int resultItr = 1;
        int itr = 1;
        int selectedEle = nums[0];
        
        while(itr < nums.length) {
            while(itr < nums.length && nums[itr] == selectedEle) {
                itr++;
            }
            if(itr >= nums.length ) {
                return resultItr;
            }
            else{                
                nums[resultItr] = nums[itr];
                selectedEle = nums[resultItr];
                resultItr++;
            }
        }
        return resultItr;
    }
}