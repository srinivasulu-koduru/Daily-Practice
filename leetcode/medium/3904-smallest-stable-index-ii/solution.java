class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[0];
        int[] min_value=new int[nums.length];
        int prev_min=nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--)
        {
           
              min_value[i]=Math.min(prev_min,nums[i]);
              prev_min=Math.min(prev_min,nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
            int r=max-min_value[i];
            if(r<=k) return i;
        }
     return -1;
    }
}