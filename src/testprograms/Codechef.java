package testprograms;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[]= new int[n];
		int b[]= new int[n];
		
		for(int i=0;i<n;i++){
		    a[i]= sc.nextInt();
		    b[i]= sc.nextInt();
		}
		int temp[] = new int[n] ;
		
		for(int i=0;i<a.length;i++){
		   if(a[i]/2<b[i]){
		       temp [i]=a[i]/2;
		   }else
		       temp [i]=b[i];
		      
		   System.out.println(temp[i]);
		    
		}
		
	}
}
