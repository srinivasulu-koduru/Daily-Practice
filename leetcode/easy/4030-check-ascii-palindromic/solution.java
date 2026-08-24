class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder binary=new StringBuilder();
        for(int i=0;i<s.length();i++)
            {
                int value=s.charAt(i);
                String t=Integer.toBinaryString(value);
                while(t.length()<8)
                    t='0'+t;
                binary.append(t);
            }
       int left=0;
        int right=binary.length()-1;
        while(left<right)
            {
                if(binary.charAt(left)!=binary.charAt(right))
                    return false;
                left++;
                right--;
            }
        return true;
    }
}