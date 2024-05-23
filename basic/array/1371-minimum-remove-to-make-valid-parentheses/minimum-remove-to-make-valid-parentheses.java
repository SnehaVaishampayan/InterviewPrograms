//      10:27 - 10:40
class Solution {
    public String minRemoveToMakeValid(String s) {
        // string to array
        // leftPtr = 0 .. // to remove extra )
        //      move to left.. 
        //      if ( openBracketsCount++ .. 
        //      if ) .. reduce openBracketsCount .. if openBracketsCount == 0.. mark that place *

        //  right to left.. to remove extra ( 
// "lee(t(c)o)de)" .. left to right.. open  0 )->* lee(t(c)o)de*
// lee(t(c)o)de* .. right to left.. open = 0 .. 

// "le((e(t(c)o)de)" .. left to right.. open 1
// "le((e(t(c)o)de) .. right to left.. open = 1 .. for ( .. mark *
// le((e(t*c)o)de)

        char[] input = s.toCharArray();
        int openBracketsCount = 0;
        for(int i = 0 ; i < input.length; i++) {        // * extra closing brackets
            if(input[i] == '(') {
                openBracketsCount++;
            }
            if(input[i] == ')') {
                
                if(openBracketsCount == 0) {
                    input[i]  = '*';        // extra closing.
                }
                else {                    
                    openBracketsCount--;    // valid pair
                }
            }
        }
        for(int i = input.length - 1; i >= 0 ; i--) {        // * extra opening brackets
            if(input[i] == '(' && openBracketsCount > 0) {
                input[i] = '*';     // Extra opening.. as openBracketsCount > 0
                openBracketsCount--;
            } 
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < input.length; i++) {
            if(input[i] != '*') {
                sb.append(input[i]);
            }
        }
        return sb.toString();
    }
}