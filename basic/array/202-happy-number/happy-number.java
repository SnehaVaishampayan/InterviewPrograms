class Solution {
    public boolean isHappy(int n) {
        int sq_sum = 0;            
        if(n == 1 || n == 7 )
            return true;
        else if (n < 10 ) {
            return false;
        }
        else {
            while(n > 0) {
                sq_sum += ((n % 10) * (n % 10));                
                n = n/10;
            }
        }            
        return isHappy(sq_sum);
    }
}