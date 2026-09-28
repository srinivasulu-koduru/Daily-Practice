# The Reverse Difference

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A number can reveal an interesting pattern when its digits are reversed.

Given a positive integer N:

- Reverse the digits of N to obtain R.
- Calculate the absolute difference between N and R.
- Find the sum of the digits of this difference.

Your task is to print the final digit sum.

 **Input Format** 

The input contains a single positive integer N.

 **Constraints** 

10 ≤ N ≤ 1,000,000,000

 **Output Format** 

Print a single integer representing the sum of the digits of the absolute difference between N and its reverse.

 **Sample Input 0** 

```
1234

```

 **Sample Output 0** 

```
18

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T09:16:37.924Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long rev=0;
        long temp=n;
        while(temp>0)
        {
            rev=rev*10+(temp%10);
            temp/=10;
        }
        long diff=Math.abs(n-rev);
        long sum=0;
        while(diff>0)
        {
            sum+=diff%10;
            diff/=10;
        }
        System.out.println(sum);
    }
    
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/the-reverse-difference/problem)