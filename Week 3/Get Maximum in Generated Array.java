class Solution {
    public int getMaximumGenerated(int n) {
        if(n < 1)
            return 0;
        int[] ref = new int[n+1];
        int max = 1;
        ref[0] = 0;
        ref[1] = 1;
        for(int i = 2; i <= n; i++)
        {
            ref[i] = ref[i/2];
            if(i % 2 == 1)
            {
                ref[i] += ref[i/2 +1];
            }
            if(max < ref[i])
                max = ref[i];
        }
        
        return max;
    }
}