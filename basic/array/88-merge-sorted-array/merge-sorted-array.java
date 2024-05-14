class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // null checks

        // iterated p1 = m-1, p2 =n-1
        //      bigger element .. put in nums1

        // if(nums1 == null || nums2 == null) {
        //     return nums1;
        // }
        
        int p1 = m-1; int p2 = n-1;
        int resItr = nums1.length-1;

        while(resItr >= 0 && p2 >= 0) {
            System.out.println("p1 " + p1 + " p2 " + p2);
            if(p1 >= 0 && p2 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[resItr] = nums1[p1]; 
                p1--;               
            }
            else {
                nums1[resItr] = nums2[p2];
                p2--;
            }
            resItr--;
        }
    }
}