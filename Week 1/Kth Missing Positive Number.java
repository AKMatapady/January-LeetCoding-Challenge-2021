class Solution {
    public int findKthPositive(int[] arr, int k) {
        int j = 1;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != j)
            {
                int l = arr[i] - j;
                if(l >= k)
                {
                    return (j + k-1);
                }
                else
                    k -= l;
                j += l;
            }
            j++;
        }
        return (j + k-1);
    }
}