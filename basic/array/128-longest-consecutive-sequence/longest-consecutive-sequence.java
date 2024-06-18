class Solution {
    // 7:25 - 7:35
    public int longestConsecutive(int[] nums) {
              HashSet<Integer> arr = new HashSet<>();
        for (int num : nums) {
            arr.add(num);
        }
        
        int maxx = 0;
        
        for (int i : nums) {
            int x = i - 1;
            int curr = 0;
            
            if (!arr.contains(x)) {
                while (arr.contains(x + 1)) {
                    curr += 1;
                    x += 1;
                }
                
                maxx = Math.max(maxx, curr);
            }
        }
        
        return maxx;
    
        // int count = 0; 
        // int res = 0; 
        // if(nums.length <= 0 || nums.length == 1) {
        //     return nums.length;
        // }        
        // // Add to the HashSet
        // Set<Integer> hs = new HashSet<>();
        // for(int i: nums) {
        //     hs.add(i);
        // }
        // // Traverse through an array curr
        // for(int currNum: nums) {
        //     if(hs.contains(currNum - 1)) {
        //         continue;
        //     }
        //     int currRight = currNum + 1;
        //     if(hs.contains(currRight)) {
        //         count = 1;
                
        //         while(hs.contains(currRight)) {
        //             count++;
        //             currRight++;
        //         }
        //         res = Math.max(count, res);
        //     } else {
        //         count = 1;
        //     }
        // }
        // return res;
    }
}