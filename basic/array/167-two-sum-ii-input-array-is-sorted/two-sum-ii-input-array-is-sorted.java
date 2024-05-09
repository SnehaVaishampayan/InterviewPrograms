class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers == null || numbers.length == 0 ) 
            return null;
        int leftPtr = 0; int rightPtr = numbers.length-1;

        int[] result = new int[2];

        while(leftPtr < rightPtr) {
            int currSum = numbers[leftPtr] + numbers[rightPtr];
            if(currSum < target) {
                leftPtr++;
            }
            else if(currSum > target) {
                rightPtr--;
            }
            else {
                result[0] = leftPtr + 1;
                result[1] = rightPtr + 1;
                return result;
            }
        }
        return result;
        
    }
}