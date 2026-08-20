# Reverse Array in Groups

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array  **arr[]** and an integer  **k**, reverse every consecutive group of k elements. If fewer than k elements remain at the end, reverse all of them.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5], k = 3
Output: [3, 2, 1, 5, 4]
Explanation: First group consists of elements 1, 2, 3. Second group consists of 4, 5.
```

```
Input: arr[] = [5, 6, 8, 9], k = 5
Output: [9, 8, 6, 5]
Explnation: Since k is greater than the number of remaining elements, the entire array is reversed.
```

 **Constraints:** 
1 ≤ arr.size(), k ≤ 105
1 ≤ arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-20T07:30:28.709Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1)