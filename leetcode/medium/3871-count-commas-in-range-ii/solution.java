class Solution {
    public long countCommas(long n) {
     long count=0;
     long c=1;
     long s=1000;
     while(s<=n)
     {
        long e=s*1000-1;
        if(n<=e)
        {
            count+=(n-s+1)*c;
            break;
        }
        count+=(e-s+1)*c;
        s*=1000;
        c++;
     }
    return count;
    }
}