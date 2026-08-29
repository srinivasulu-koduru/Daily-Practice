# Missing Number in Sorted Array of Natural Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sorted array  **arr[]**  of n-1 integers, these integers are in the range of 1 to n. There are no duplicates in the array. One of the integers is  **missing** in the array. Find the  **missing integer**.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 6, 7, 8]
Output: 5
Explanation: The missing integer in the array is 5.
```

```
Input: arr[] = [1, 2, 3, 4, 5, 6, 8, 9]
Output: 7
Explanation: The missing integer in the array is 7.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ arr.size()+1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-29T13:49:20.952Z  

```java
class Solution {
    int missingNumber(int arr[]) {
        // code here
        int n=arr.length;
        int freq[]=new int[n+2];
        for(int num:arr)
        {
             freq[num]++;
        }
       for(int i=1;i<n+2;i++)
       {
           if(freq[i]==0) return i;
       }
       return n+1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/missing-number-in-sorted-array-of-natural-numbers/1)