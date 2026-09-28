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
