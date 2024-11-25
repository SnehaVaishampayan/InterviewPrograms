class Solution {
    public int maxProfit(int[] prices) {
        // traverse low and high price ptrs.. 
        // if curr < low.. update low
        // if curr > high update high.. 

        int low = prices[0];
        int high = prices[0];
        int currDiff = 0;
        // vlaidations
        if(prices == null || prices.length <= 1) {
            return 0;
        }
        for(int i = 0 ; i < prices.length; i++) {
            if( prices[i] < low) {
                low = prices[i];
            }

            currDiff = Math.max(currDiff, prices[i]-low);
        }
        return currDiff;// (high-low) < 0 ? 0 : high-low);
    }
}