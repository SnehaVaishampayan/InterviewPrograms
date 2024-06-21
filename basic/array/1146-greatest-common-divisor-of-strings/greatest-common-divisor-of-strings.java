class Solution {
    public String gcdOfStrings(String s, String t) {
        if(!(s+t).equals(t+s)){
            return "";
        }
        int gcd = gcdRecursive(s.length(), t.length()); 
        return s.substring(0, gcd);
    }
    private int gcdRecursive(int s, int t) { 
        return (t == 0 ? s : gcdRecursive(t, s % t));
    }
}