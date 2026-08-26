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
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int max=-1;
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]>max)
		            max=arr[i];
		        for(int j=i+1;j<n;j++)
		        {
		            if(arr[i]<arr[j]&&arr[i]+arr[j]>max)
		            {
		                max=arr[i]+arr[j];
		            }
		        }
		    }
		    System.out.println(max);
		}

	}
}
