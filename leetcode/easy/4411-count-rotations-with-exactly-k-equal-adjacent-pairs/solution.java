class Solution {
    public int countRotations(String s, int k) {
         int score=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            score=0;
            for(int j=0;j<s.length()-1;j++)
            {
                int c=s.charAt((i+j)%s.length());
                int n=s.charAt((i+j+1)%s.length());
                if(c==n) score++;
            }
            if(score==k) count++;
        }
        return count;
    }
}