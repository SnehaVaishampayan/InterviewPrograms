class Solution {
    // 7:25 - 7:35
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums){
            set.add(n);
         }

        int count = 1;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int tempCount = 1;
                while (set.contains(num + 1)) {
                    tempCount++;
                    num++;
                }
                count = Math.max(count, tempCount);
            }

            if (count > nums.length / 2) break;
        }

        return count;
    }

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
    // }
}