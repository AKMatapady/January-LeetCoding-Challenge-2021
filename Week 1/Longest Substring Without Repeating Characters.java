class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() < 1)
            return 0;
        int len = s.length();
        if(len < 2)
            return len;
        int max = 0;
        int[] arr = new int[128];
        for(int i=0, j=0; j < len; j++)
        {
            i = Math.max(arr[s.charAt(j)], i);
            max = Math.max(max, j+1-i);
            arr[s.charAt(j)] = j + 1;
        }
        return max;
    }
}