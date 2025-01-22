class Solution {
    public int candy(int[] ratings) {
        // Traverse the array from left to right
        //      Assign values for all the ascending pairs
        // Traverse right to left
        //      Assign values to descending pairs.

        if(ratings == null || ratings.length == 0) {
            return 0;
        }
        int[] candies = new int[ratings.length];
        candies[0] = 1; 

        for(int i = 1; i < ratings.length; i++) {
            if(ratings[i-1] < ratings[i]) {     // Ascending order
                candies[i] = candies[i-1] + 1;
            }
            else {
                candies[i] = 1;
            }
        }
        int result = candies[candies.length - 1];
        for(int i = ratings.length - 2; i >= 0; i-- ) {
            // int newCandies = 1; 
            int prevCandiesCount = candies[i];
            if(ratings[i] > ratings[i+1]) {     // Descending order
                candies[i] = candies[i+1] + 1;
            }

            result += Math.max(prevCandiesCount, candies[i]);
            // candies[i] = newCandies;
        }

        
        return result;
    }
}