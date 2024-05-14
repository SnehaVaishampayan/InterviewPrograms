class Solution {
    public boolean isOneEditDistance(String s, String t) {
       
        if(Math.abs(s.length() - t.length()) > 1 ) {
            return false;
        }

        if(s.length() == t.length()) {
            return checkIfReplace(s,t);
        }
        else {
            if(s.length() > t.length()){
                return checkifInsertDelete(s,t);
            }                
            else {
                return checkifInsertDelete(t, s);
            }
        }
    }

    private boolean checkIfReplace(String s, String t) {
        int sItr = 0; int tItr = 0;
        boolean replacefound = false;
        
        while( sItr < s.length() && tItr < t.length()) {
            if(s.charAt(sItr) != t.charAt(tItr)) {
                if(!replacefound) {
                    replacefound = true;
                }
                else {
                    return false;
                }
            }
            sItr++; tItr++;
        }
        return replacefound;
    }
    private boolean checkifInsertDelete(String bigStr, String smallStr) {
        int bigItr = 0; int smallItr = 0;
        boolean foundDiff = false;
        while( bigItr < bigStr.length() &&  smallItr < smallStr.length()) {
            if(smallStr.charAt(smallItr) != bigStr.charAt(bigItr)) {
                bigItr++; 
                if(!foundDiff) {
                    foundDiff = true;
                }
                else {
                    return false;
                }
            }
            else {
                smallItr++; bigItr++;
            }
        }
        return true;
    }
}