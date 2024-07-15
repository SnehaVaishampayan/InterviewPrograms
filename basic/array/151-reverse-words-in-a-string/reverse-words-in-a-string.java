class Solution {
    public String reverseWords(String s) {
        // Trim.. 
        // split in words[].. 
        // string buidler append reverse words[]

        String[] words = s.trim().split(" ");
        System.out.println("len " + words.length);
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1 ; i >= 0 ; i--) {
            if(words[i].trim().length() != 0) {
                sb.append(words[i]);
                if(i != 0)
                    sb.append(" ");
            }
        }




















        return sb.toString();
        // char[] sArr = s.trim().toCharArray();
        // System.out.println("sArr len " + sArr.length);
        // String[] words = s
        // int start = 0;
        // int end = sArr.length;
        // System.out.println("Input arr len " + sArr.length);
        // System.out.println("Input " + new String(sArr));
        // int wordStart = start; 
        // StringBuilder sb = new StringBuilder();
        // for(int wordEnd = 1; wordEnd < end; wordEnd++) {
        //     if(sArr[wordEnd] == ' ') {
        //          sb.append(sArr[wordEnd]);
        //          continue;
        //     }            
        //     reverse(sArr, wordStart, wordEnd-1);                
        //     wordStart = wordEnd+1;
            
           
        // }
        // reverse(sArr, wordStart, end-1);
        // System.out.println("Output " + new String(sArr));        
        // return new String(reverse(sArr, start, end-1));
    }































    // private char[] reverse(char[] sArr, int start, int end) {   
    //     System.out.println("in rev start " + start);
    //     System.out.println("in rev end " + end);        
    //     while(start < end) {
    //         char temp = sArr[start];
    //         sArr[start] = sArr[end];
    //         sArr[end] = temp;
    //         start++;
    //         end--;
    //     }       
    //     System.out.println("re " + new String(sArr));
    //     return sArr;
    // }  
}