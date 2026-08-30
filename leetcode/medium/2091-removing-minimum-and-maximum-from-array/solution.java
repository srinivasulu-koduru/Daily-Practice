class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1) return 1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int index1=0;
        int index2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                index1=i;
            }
            if(nums[i]<min)
            {
                min=nums[i];
                index2=i;
            }
        }
        int r=Integer.MAX_VALUE;
        int n=nums.length;
        if(Math.max(index1,index2)+1<r)
            r=Math.max(index1,index2)+1;
        if(n-Math.min(index1,index2)<r)
            r=n-Math.min(index1,index2);
        if((index1+1)+(n-index2)<r)
            r=index1+1+(n-index2);
        if((index2+1)+(n-index1)<r)
            r=index2+1+(n-index1);
        return r;
    }
}