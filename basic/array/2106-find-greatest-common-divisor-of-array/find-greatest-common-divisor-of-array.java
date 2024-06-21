class Solution {
    public int findGCD(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int greatest = Integer.MIN_VALUE;
        for(int i : nums) {
            if( i < smallest) {
                smallest = i;
            }
            if(i > greatest) {
                greatest = i;
            }
        }
        
        int gcd = 1;
        for(int i = 1; i <= smallest && i <= greatest; i++) {
            if(smallest % i == 0 && greatest % i == 0) {
                gcd = i;
            }
        }
        return gcd;//gcdRecursive( smallest, greatest);
    }

    int gcdRecursive(int a, int b) {        
        return( a == 0 ? b : gcdRecursive(a , b / a));
    }
}