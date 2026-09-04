class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[0];
        int min=nums[0];
       // int r=-1;
        for(int i=0;i<nums.length;i++)
        {
             max=Math.max(nums[i],max);
             min=min_f(nums,i);
             int instability=max-min;
            if(instability<=k)
                return i;
        }
        return -1;
    }
public  int  min_f(int[] nums,int j)
        {
            int min=nums[j];
            for(int i=j;i<nums.length;i++)
            {
                if(nums[i]<min)
                    min=nums[i];
            }
            return min;
        }
}