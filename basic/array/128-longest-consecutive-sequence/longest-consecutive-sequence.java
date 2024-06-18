class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0; 
        // Add to the HashSet
        Set<Integer> hs = new HashSet<>();
        for(int i: nums) {
            hs.add(i);
        }
        // Traverse through an array curr
        // If previous ele not exist.. 
        //      the move till we find nextEle
        //      max result = diff between nextEle - currEle

        for(int currNum: nums) {
            if(!hs.contains(currNum - 1)) {
                int currRight = currNum + 1;
                while(hs.contains(currRight)) {
                    currRight++;
                }
                res = Math.max(currRight - currNum, res);
            }
        }
        return res;
    }
}