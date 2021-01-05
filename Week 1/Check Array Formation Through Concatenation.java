class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int curr = 0;
        int prev = 0;
        while(curr < arr.length)
        {
            prev = curr;
            for(int j = 0; j < pieces.length; j++)
            {
                if(curr+pieces[j].length > arr.length)
                    continue;
                
                boolean flag = true;
                for(int k = 0; k < pieces[j].length; k++)
                {
                    if(arr[curr+k] != pieces[j][k])
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    curr += pieces[j].length;
                
                if(curr == arr.length)
                    return true;
            }
            if(prev == curr)
                break;
        }
        return false;
    }
}