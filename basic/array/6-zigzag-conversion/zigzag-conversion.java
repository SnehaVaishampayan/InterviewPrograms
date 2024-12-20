class Solution {
    public String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        StringBuilder[] sbarr = new StringBuilder[numRows];
        for(int sa = 0; sa < numRows; sa++) {
            sbarr[sa] = new StringBuilder();
        }
        int t = 0; 
        while(t < s.length()) {
            for(int i = 0 ; i < numRows && t < s.length(); i++) {
                sbarr[i].append(s.charAt(t)); 
                t++;
            }
            for(int i = numRows - 2; i > 0 && t < s.length() ; i--) {
                sbarr[i].append(s.charAt(t)); 
                t++;
            }
        }

        StringBuilder res = new StringBuilder();
        for(int r = 0; r < numRows; r++) {
            res.append(sbarr[r]);
        }
        return res.toString();
    }
}