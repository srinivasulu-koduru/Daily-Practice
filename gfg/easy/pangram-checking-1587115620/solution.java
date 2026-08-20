class Solution {
    public static boolean checkPangram(String s) {
        // code here
        int[] freq=new int[26];
        s=s.toLowerCase();
        for(char ch:s.toCharArray())
        {
            if(ch>='a'&&ch<='z')  freq[ch-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]==0)
                return false;
        }
        return true;
    }
}