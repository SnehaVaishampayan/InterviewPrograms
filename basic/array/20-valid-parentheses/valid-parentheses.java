class Solution {
    public boolean isValid(String s) {
        // if open put in stack.. 
        // if close pop and match
        if(s == null || s.length() <= 0) {
            return false;
        }

        String openBrackets = "([{";
        Stack<Character> st = new Stack<>();
        for(int i = 0;i < s.length(); i++) {
            char c = s.charAt(i);
            if(openBrackets.indexOf(c) != -1) {
                st.push(c);
            }
            else {
                if(st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if(c == ')' ){
                    if(top != '(') {
                        return false;
                    }
                }
                if(c == ']') {
                    if(top != '[') {
                        return false;
                    }
                }
                if(c== '}') {
                    if(top != '{') {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}