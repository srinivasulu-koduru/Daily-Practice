# Matrix Boundary Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a matrix  **mat[][]**. Return the boundary traversal on the matrix in a clockwise manner starting from the first row of the matrix.

 **Examples:** 

```
Input: mat[][] = [[1, 2, 3, 4],
                [5, 6, 7, 8],
                [9, 10, 11, 12],
                [13, 14, 15,16]]
Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5]
Explanation: The boundary traversal is: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5]

```

```
Input:mat[][] = [[12, 11, 10, 9],
               [8, 7, 6, 5],
               [4, 3, 2, 1]]
Output: [12, 11, 10, 9, 5, 1, 2, 3, 4, 8]
Explanation: The boundary traversal is: [12, 11, 10, 9, 5, 1, 2, 3, 4, 8]
```

```
Input:mat[][] = [[12, 11],
                [4, 3]] 
Output: [12, 11, 3, 4]
Explanation: The boundary traversal is: [12, 11, 3, 4]

```

 **Constraints:** 
1 ≤ mat.size()≤ 1000
1 ≤ mat[0].size() ≤ 1000
0 ≤ mat[i][j] ≤ 1000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T06:17:25.358Z  

```java
class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int left=0;
        int right=m-1;
        int top=0;
        int buttom=n-1;
        ArrayList<Integer> r=new ArrayList<>();
        while(left<=right)
        {
            r.add(mat[top][left]);
            left++;
        }
        top=1;
        while(top<=buttom)
        {
            r.add(mat[top][right]);
            top++;
        }
        if(n==1) return r;
        left=0;
        right-=1;
        if(buttom>0)
        {
        while(right>=left)
        {
            r.add(mat[buttom][right]);
            right--;
        }
        }
        if(m==1) return r;
        top=1;
        buttom-=1;
      while(buttom>=top)
      {
          r.add(mat[buttom][left]);
          buttom--;
      }
        return r;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/boundary-traversal-of-matrix-1587115620/1)