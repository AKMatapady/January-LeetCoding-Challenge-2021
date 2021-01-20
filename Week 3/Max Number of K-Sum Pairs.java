class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        int ans = 0;
        
        for(int x: nums)
        {
            if(map.getOrDefault(k-x, 0) > 0)
            {
                map.put(k-x, map.get(k-x)-1);
                ans++;
            }
            else
            {
                map.put(x, map.getOrDefault(x, 0)+1);
            }
        }
        
        return ans;
    }
}