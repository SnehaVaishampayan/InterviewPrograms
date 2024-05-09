class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Sort the array 
        List<List<Integer>> result = new ArrayList<>();
        
        if(nums == null || nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        for(int firstPtr = 0; firstPtr < nums.length - 2; firstPtr++) {

            if(firstPtr == 0 || nums[firstPtr-1] < nums[firstPtr]) {

                int leftPtr = firstPtr + 1;
                int rightPtr = nums.length - 1;

                while(leftPtr < rightPtr) {
                    
                    int currSum = nums[firstPtr] + nums[leftPtr] + nums[rightPtr];
                    if(currSum < 0){
                        leftPtr++;
                    }
                    else if( currSum > 0 ) {
                        rightPtr--;
                    }
                    else {
                        List<Integer> al = new ArrayList<>();
                        al.add(nums[firstPtr]); al.add(nums[leftPtr]); al.add(nums[rightPtr]); 
                        result.add(al);
                        leftPtr++; rightPtr--;
                        while((leftPtr < rightPtr) && (nums[leftPtr] == nums[leftPtr-1])){
                            leftPtr++;
                        }
                        while((leftPtr < rightPtr) && (nums[rightPtr] == nums[rightPtr + 1])){
                            rightPtr--;
                        }
                    }
                }
            }
        }
        return result;

    }
}