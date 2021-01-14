class Solution {
    
    public int minOperations(int[] nums, int x) {
        if(x == 0)
            return 0;
        if(nums == null || nums.length < 1)
            return -1;
        int max = 0;
        int sum = 0;
        for(int n: nums)
            sum+=n;
        sum -= x;
        if(sum == 0)
            return nums.length;
        int i = 0, j = 0;
        int curr = 0;
        while(j < nums.length)
        {
            curr += nums[j];
            
            while(curr > sum && i <= j)
            {
                curr -= nums[i];
                i++;
            }
            
            //System.out.println(i + " " + j + " " + curr);
            if(curr == sum)
            {
                max = Math.max(max, j-i+1);
            }
            //System.out.println(" -> " + i + " " + j + " " + curr);
            j++;
        }
        
        return (max == 0)?-1:nums.length-max;
    }
}