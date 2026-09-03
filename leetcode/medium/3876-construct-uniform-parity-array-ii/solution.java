class Solution {
    public boolean uniformArray(int[] num1) {
        int odd_index=-1;
        int odd_number=Integer.MAX_VALUE;
        for(int i=0;i<num1.length;i++)
        {
            if(num1[i]%2!=0)
            {
                   if(num1[i]<=odd_number)
                   {
                    odd_index=i;
                    odd_number=num1[i];
                   }
            }
        }
        if(odd_index>-1)
        {
            for(int i=0;i<num1.length;i++)
            {
                if(num1[i]%2==0&&num1[i]-num1[odd_index]<1) return false;
            }
        }
        return true;
    }
}