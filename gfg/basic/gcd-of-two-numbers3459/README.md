# GCD of two numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two positive integers  **a**  and  **b**, find  **GCD** of a and b.

 **Note:**  Don't use the inbuilt gcd function

 **Examples:** 

```
Input: a = 20, b = 28
Output: 4
Explanation: GCD of 20 and 28 is 4
```

```
Input: a = 60, b = 36
Output: 12
Explanation: GCD of 60 and 36 is 12
```

 **Constraints:** 
1 ≤ a, b ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T17:02:02.135Z  

```java
class Solution {
    public static int gcd(int a, int b) {
        // code here
       while(a>0&&b>0)
       {
           if(a>b)
               a=a%b;
           else
               b=b%a;
       }
       if(a==0)
           return b;
       else
           return a;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1)