class Solution {
    public boolean isValid(String s) {
        // if open put in stack. 
        // if close.. match with top

        // Valdiations
        if(s == null || s.length() == 0) {
            return true;
        }
        
        Stack<Character> st = new Stack<>();
        String openBrackets = "([{";
        for(char c: s.toCharArray()) {
            if(openBrackets.indexOf(c) >= 0) {
                // it is open .. put in stack
                st.push(c);
            }
            else {
                // it is close
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if(top == '(' && c != ')')  {
                    return false;
                }
                else if(top == '{' && c != '}') {
                    return false;
                }
                
            }
        }
        return st.isEmpty();

    }
}