# Count Commas in Range II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer `n`.

Return the  **total**  number of commas used when writing all integers from `[1, n]` (inclusive) in  **standard**  number formatting.

In  **standard**  formatting:

- A comma is inserted after every three digits from the right.
- Numbers with fewer than 4 digits contain no commas.

 

 **Example 1:** 

 **Input:**  n = 1002

 **Output:**  3

 **Explanation:** 

The numbers `"1,000"`, `"1,001"`, and `"1,002"` each contain one comma, giving a total of 3.

 **Example 2:** 

 **Input:**  n = 998

 **Output:**  0

 **Explanation:** 

 **​​​​​​​** All numbers from 1 to 998 have fewer than four digits. Therefore, no commas are used.

 

 **Constraints:** 

- 1 <= n <= 1015

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.24%)  
**Memory:** 42.7 MB (beats 53.61%)  
**Submitted:** 2026-09-10T18:06:36.307Z  

```java
class Solution {
    public long countCommas(long n) {
     long count=0;
     long c=1;
     long s=1000;
     while(s<=n)
     {
        long e=s*1000-1;
        if(n<=e)
        {
            count+=(n-s+1)*c;
            break;
        }
        count+=(e-s+1)*c;
        s*=1000;
        c++;
     }
    return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-commas-in-range-ii/)