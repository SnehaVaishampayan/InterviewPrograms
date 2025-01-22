class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int total_len = nums1.length + nums2.length;
        int[] full_arr = new int[total_len];

        int n1_itr = 0; int n2_itr = 0; int full_itr = 0;

        while(n1_itr <= nums1.length && n2_itr <= nums2.length) {

            if(n1_itr == nums1.length) {            // End of arr1 reached
                while(n2_itr < nums2.length) {
                    full_arr[full_itr++] = nums2[n2_itr];
                    n2_itr++;
                }
                break;
            }
            else if(n2_itr == nums2.length) {
                while(n1_itr < nums1.length) {
                    full_arr[full_itr++] = nums1[n1_itr];
                    n1_itr++;
                }
                break;
            }

            if(nums1[n1_itr] < nums2[n2_itr]) {
                full_arr[full_itr++] = nums1[n1_itr++];
            }
            else {
                full_arr[full_itr++] = nums2[n2_itr++];
            }
        }

        if((total_len)%2 == 0) {  // total even length 
            return (float) (full_arr[(total_len)/2] + full_arr[(total_len)/2 - 1])/ 2;
        }
        else {
            return (float) (full_arr[(total_len)/2]);
        }
    }
}