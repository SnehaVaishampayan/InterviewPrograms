class Solution {
    public int removeDuplicates(int[] nums) {

// TEMPLATE : POINTERS - resultItr / itr

        //  Traverse array
        //      selectedEle .. 
        //      resItr == selectedEle
        //      while currEle == selectedEle.. 
        //          move itr
        
        if(nums.length <= 1) {
            return nums.length;
        }
        // int resultItr = 1;
        // int runner = 1;
        // int selectedEle = nums[0];
        
        // while(runner < nums.length) {
        //     while(runner < nums.length && nums[runner] == selectedEle) {
        //         itr++;
        //     }
        //     if(runner >= nums.length ) {
        //         return resultItr;
        //     }
        //     else{                
        //         nums[resultItr] = nums[runner];
        //         selectedEle = nums[resultItr];
        //         resultItr++;
        //     }
        // }
        // return resultItr;
    


        int runner = 1;
        int resPtr = 1;

        while(runner < nums.length) {            
            if( nums[runner] != nums[resPtr-1]) {   // if currEle is not equal to last 2 ele of result arrray           
                nums[resPtr] = nums[runner];
                resPtr++;
            }
            runner++;
        }
        return resPtr;
    }
}