class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int ans = 0;
        if(people == null || people.length < 1 || limit == 0)
            return ans;
        Arrays.sort(people);
        int front = 0, back = people.length-1;
        
        while(front <= back)
        {
            ans++;
            if(people[front]+people[back] <= limit)
                front++;
            back--;
        }
        return ans;
    }
}