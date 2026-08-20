class Solution {
    public String removeSpaces(String s) {
        // code here
        String r="";
        for(char ch:s.toCharArray())
        {
            if(ch!=' ') r+=ch;
        }
        return r;
    }
}