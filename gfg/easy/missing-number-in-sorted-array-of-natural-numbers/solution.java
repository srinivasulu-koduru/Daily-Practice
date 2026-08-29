class Solution {
    int missingNumber(int arr[]) {
        // code here
        int n=arr.length;
        int freq[]=new int[n+2];
        for(int num:arr)
        {
             freq[num]++;
        }
       for(int i=1;i<n+2;i++)
       {
           if(freq[i]==0) return i;
       }
       return n+1;
    }
}