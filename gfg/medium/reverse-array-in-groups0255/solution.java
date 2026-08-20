class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n=arr.length;
       int a=0;
        while(a<n)
        {
        int left=a;
        int right=Math.min(a+k-1,n-1);
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        a+=k;
      
        }
    }
}