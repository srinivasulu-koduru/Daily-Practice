class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> r=new ArrayList<>();
        Arrays.sort(nums);
       int n=nums.length;
        for(int k=0;k<n-2;k++)
        {
            if(k>0&&nums[k]==nums[k-1])
                continue;
              int i=k+1;
             int j=n-1;
        while(i<j)
        {
            if(nums[k]+nums[i]+nums[j]==0)
            {
              r.add(Arrays.asList(nums[k],nums[i],nums[j]));
              while(i<j&&nums[i]==nums[i+1])
                i++;
            while(i<j&&nums[j]==nums[j-1])
                j--;
            i++;
            j--;
            }
            else if(nums[k]+nums[i]+nums[j]<0)
                i++;
            else
                j--;
        }
        }
        return r;
    }
}