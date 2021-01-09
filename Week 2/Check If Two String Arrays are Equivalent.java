class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        for(String s: word1)
        {
            sb.append(s);
        }
        int i = 0;
        for(String s:word2)
        {
            if(i+s.length() > sb.length())
                return false;
            if(!sb.substring(i, i+s.length()).equals(s))
                return false;
            i += s.length();
        }
        if(i < sb.length())
            return false;
        return true;
    }
}