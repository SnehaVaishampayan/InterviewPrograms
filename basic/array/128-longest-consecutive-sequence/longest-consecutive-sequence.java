class Solution {
    // 7:25 - 7:35
    public int longestConsecutive(int[] nums) {
    //    HashSet<Integer> hs = new HashSet<>();

    //     for (int i: nums){
    //         hs.add(i);
    //     }
    //     int c =0;

    //     for (int x:hs){
    //         if(!hs.contains(x-1)){
    //             int y = x+1;
    //             while(hs.contains(y)){
    //                 y++;
    //             }
    //             c= Math.max(c,y-x);
    //         }
    //     }
    //     return c;
    // }

        int res = 0; 
        // int res = 0; 
        // if(nums.length <= 0 || nums.length == 1) {
        //     return nums.length;
        // }        
        // // Add to the HashSet
        Set<Integer> hs = new HashSet<>();
        for(int i: nums) {
            hs.add(i);
        }
        // // Traverse through an array curr
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