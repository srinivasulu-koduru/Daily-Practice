class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0) even++;
            else odd++;
        }
        int[] r=new int[2];
        r[0]=odd;
        r[1]=even;
        return r;
    }
}