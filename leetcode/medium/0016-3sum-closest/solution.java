class Solution {
    public int threeSumClosest(int[] nums, int target) {
           Arrays.sort(nums);
       int n=nums.length;
       int diff;
       int r=Integer.MAX_VALUE;
       int r1=0;
        for(int k=0;k<n-2;k++)
        {
            if(k>0&&nums[k]==nums[k-1])
                continue;
              int i=k+1;
             int j=n-1;
        while(i<j)
        {
            int sum=nums[k]+nums[i]+nums[j];
            diff=Math.abs(sum-target);
            if(diff<r)
            {
              r=diff;
              r1=sum;
            }
            else if(sum<target)
                i++;
            else
                j--;
        }
        }
        return r1;
    }
}