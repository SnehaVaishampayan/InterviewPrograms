class Solution {
    public boolean isSubsequence(String s, String t) {
        // traverse s .. 
        //      traverse t and find firstChar.. 
        //          match next chars .. 
        //              if all found.. return true.. 
        //          
        if(s == null && t == null) {
            return true;
        }
        if(t.length() < s.length()) {
            return false;
        }
        if(s.length() == 0 ) {
            return true;
        }
        int sItr = 0;
        char s_match = s.charAt(sItr);
        for(int i = 0 ; i < t.length(); i++) {

            if(t.charAt(i) == s_match) {

                System.out.println("sItr " + sItr);
                System.out.println("s_match " + s_match);
                if(sItr < s.length()-1) {
                    sItr++;
                    s_match = s.charAt(sItr);
                }
                else {
                    return true;
                }
            }
        }
        return false;//sItr >= s.length();
    }
}