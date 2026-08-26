import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	  Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();
	  while(t-->0)
	  {
	      int a=sc.nextInt();
	      int b=sc.nextInt();
	      int p=sc.nextInt();
	      int q=sc.nextInt();
	      int r=sc.nextInt();
	      int cost=0;
	      if(a==b)
	      {
	          cost=r*2;
	          System.out.println(cost);
	      }
	      while(a>0)
	      {
	          cost+=p;
	          a/=2;
	      }
	      while(b>0)
	      {
	          cost+=q;
	          b/=2;
	      }
	      System.out.println(cost);
	      
	  }

	}
}
