class Solution {
    public int sum(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=(n%10)*(n%10);
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> s=new HashSet();
         while(true)
         {
            n=sum(n);
             if(n==1||n==7) return true;
             if(n>9)
             {
                if(s.contains(n)) return false;
                else s.add(n);
             }
         }
    }
}