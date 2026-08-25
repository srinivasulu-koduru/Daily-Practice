class Solution {
    public int missingMultiple(int[] nums, int k) {
       HashSet<Integer> r=new HashSet<>();
       for(int num:nums)
       {
           r.add(num);
       }
        int i=1;
       while(true)
       {
          if(!r.contains(k*i))
           return k*i;
                 i++;
       }

    }
}