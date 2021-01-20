class Solution {
    public boolean isValid(String s) {
        if(s == null || s.length() < 1)
            return true;
        if(s.length() % 2 == 1)
            return false;
        Stack<Character> st = new Stack<Character>();
        for(char ch: s.toCharArray())
        {
            if(ch == ')')
            {
                if(st.size() < 1)
                    return false;
                char temp = st.pop();
                if(temp != '(')
                    return false;
            }
            else if(ch == '}')
            {
                if(st.size() < 1)
                    return false;
                char temp = st.pop();
                if(temp != '{')
                    return false;
            }
            else if(ch == ']')
            {
                if(st.size() < 1)
                    return false;
                char temp = st.pop();
                if(temp != '[')
                    return false;
            }
            else
            {
                st.push(ch);
            }
        }
        return (st.size() == 0)?true:false;
    }
}