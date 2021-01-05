class Solution {
    
    private void dfs(int n, int curr, Set<Integer> done)
    {
        if(curr > n)
        {
            ans++;
            return;
        }
        for(int i = 1; i <= n; i++)
        {
            if(!done.contains(i) && (curr % i == 0 || i % curr == 0))
            {
                done.add(i);
                dfs(n, curr+1, done);
                done.remove(i);
            }
        }
    }
    
    private int ans = 0;
    
    public int countArrangement(int n) {
        dfs(n, 1, new HashSet<Integer>());
        return ans;
    }
}