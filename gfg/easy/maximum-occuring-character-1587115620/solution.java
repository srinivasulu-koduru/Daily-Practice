class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        int freq[]=new int[26];
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
        }
        int max=-1;
        char r='a';
       for(int i=0;i<26;i++)
        {
            if(freq[i]>max)
            {
                max=freq[i];
                r=(char)(i+'a');
            }
        }
        return r;
    }
}