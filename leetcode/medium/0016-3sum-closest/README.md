# 3Sum Closest

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` of length `n` and an integer `target`, find three integers at  **distinct indices**  in `nums` such that the sum is closest to `target`.

Return  *the sum of the three integers*.

You may assume that each input would have exactly one solution.

 

 **Example 1:** 

```
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

```

 **Example 2:** 

```
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

```

 

 **Constraints:** 

- 3 <= nums.length <= 500
- -1000 <= nums[i] <= 1000
- -104 <= target <= 104

## Solution

**Language:** Java  
**Runtime:** 18 ms (beats 40.56%)  
**Memory:** 45.4 MB (beats 81.74%)  
**Submitted:** 2026-08-17T16:58:05.857Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/3sum-closest/)