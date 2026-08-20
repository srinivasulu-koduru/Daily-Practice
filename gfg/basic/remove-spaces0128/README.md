# Remove Spaces

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, remove all the spaces from the string and return the modified string.

 **Examples:** 

```
Input: s = "g eeks for ge eks"
Output: "geeksforgeeks"
Explanation: All space characters are removed from the given string while preserving the order of the remaining characters, resulting in the final string "geeksforgeeks".

```

```
Input: s = "abc d "
Output: "abcd"
Explanation:  All space characters are removed from the given string while preserving the order of the remaining characters, resulting in the final string "abcd".
```

 **Constraints:** 
1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-20T07:40:43.424Z  

```java
class Solution {
    public String removeSpaces(String s) {
        // code here
        String r="";
        for(char ch:s.toCharArray())
        {
            if(ch!=' ') r+=ch;
        }
        return r;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-spaces0128/1)