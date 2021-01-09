class Solution {
    
    private boolean check(String a, String b)
    {
        int count = 0;
        if(a.length() == b.length())
        {
            for(int i = 0; i  a.length(); i++)
            {
                if(a.charAt(i) != b.charAt(i))
                    count++;
            }
        }
        if(count == 1)
            return true;
        return false;
    }
    
    public int ladderLength(String beginWord, String endWord, ListString wordList) {
        int ans = 0;
        if(beginWord.equals(endWord)  !wordList.contains(endWord)  beginWord.length() != endWord.length())
            return ans;
        SetString words = new HashSet();
        for(String s wordList)
            words.add(s);
        QueueString q = new LinkedList();
        q.add(beginWord);
        words.remove(beginWord);
        
        while(!q.isEmpty())
        {
            int size = q.size();
            ans++;
            for(int i = 0; i  size; i++)
            {
                String s = q.poll();
                System.out.println(ans +   + s);
                ListString used = new ArrayList();
                for(String t words)
                {
                    if(check(s, t))
                    {
                        if(t.equals(endWord))
                            return ans+1;
                        used.add(t);
                        q.add(t);
                    }
                }
                for(String t used)
                    words.remove(t);
            }
        }
        
        return 0;
    }
}