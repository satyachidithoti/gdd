/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N,K,sum=0;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		int[] a=new int[10];
		for(int i=0;i<N;i++)
		{
			a[i]=sc.nextInt();
			if(i<K)
			{
				sum=sum+a[i];
				
			}
			System.out.println(sum);
			
		}
		
		
	
		
	}
