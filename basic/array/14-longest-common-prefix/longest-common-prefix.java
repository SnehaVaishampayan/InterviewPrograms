class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        for(String s: strs) {
            if(s.length() <= 0) {
                return "";
            }
            minLen = Math.min(minLen, s.length());
        }
        int numOfWords = strs.length;
        int itr = 0;
        char selectedChar = strs[0].charAt(0);
        StringBuilder sb = new StringBuilder();
        System.out.println("minLen " + minLen);

        for(int chItr = 0; chItr < minLen; chItr++) {
            System.out.println("chItr " + chItr);
            int wordindex = 0;
            selectedChar = strs[0].charAt(chItr);
            while(wordindex < strs.length && strs[wordindex].charAt(chItr) == selectedChar){
                wordindex++;
            }

            if(wordindex < strs.length) { // miss match found
                return sb.toString();
            }
            else {
                sb.append(selectedChar);                
            }
        }
        return sb.toString();
    }
}