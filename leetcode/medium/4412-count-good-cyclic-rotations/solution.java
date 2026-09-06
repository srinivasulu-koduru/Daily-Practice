class Solution {
    public int countGoodRotations(int[] nums) {
       int n=nums.length;
       int count=0;
        int half=n/2;
        long total_sum=0;
        long first_sum=0;
        long second_sum=0;
        for(int i=0;i<n;i++)
            {
                total_sum+=nums[i];
                if(i<half)
                {
                    first_sum+=nums[i];
                }
            }
        for(int i=0;i<n;i++)
        {
            second_sum=total_sum-first_sum;
            if(first_sum>second_sum) count++;
            first_sum=first_sum-nums[i]+nums[(i+half)%n];
        }
        return count;
    }
}