class Solution {
    
    private String s;
    
    private int check(int left, int right)
    {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
    
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1)
            return "";
        this.s = s;
        int first = 0, last = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int even = check(i, i);
            int odd = check(i, i+1);
            int max = Math.max(even, odd);
            if(max > (last-first+1))
            {
                first = i-((max-1)/2);
                last = i + (max/2);
            }
        }
        return s.substring(first, last+1);
    }
}