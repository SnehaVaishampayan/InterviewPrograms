class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        // int start = 0; 
        // int end = 0;
        // HashMap.. char - lastOccurenceIndex
        // Traverse string..
        //     Add/update char to hashMap.. char - lastOccurenceIndex
        //     if hm.size() > k .. 
        //         startChar lastOccurence.. 
        //         end = start 
        //         clear hashMap

        // Walkthru 
        // e = 2 ; c = 1 
        // size <= k
        // e= 2 ; c = 1; b = 3
        // now size > k 
        //  startChar = e 
        //  startCharLastOccurence= 2
        // start = startCharLastOccurence + 1 = 3 

        if(s == null || s.length() == 0 ){
            return 0;
        } 
        if(k >= s.length()) {
            return s.length();
        }
        Map<Character, Integer> hm = new HashMap<>();
        int start = 0;
        int result = k;
        for(int end = 0; end < s.length(); end++) {
            char currChar = s.charAt(end);

            hm.put(currChar, hm.getOrDefault(currChar,0) + 1);

            if( hm.size() > k) {
                
                result = Math.max(result, end-start);
                while(hm.size() > k ) {
                    char startChar = s.charAt(start);
                    if(hm.get(startChar) == 1) {
                        hm.remove(startChar);
                    }
                    else {
                        hm.put(startChar, hm.get(startChar) - 1);
                    }
                    start++;
                }                
             }
        }
        return Math.max(result, s.length()-start);
    }
}
