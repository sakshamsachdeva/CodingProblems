/*Given a string S consisting of lowercase Latin Letters. Find the first non repeating character in S.

Input:
The first line contains T denoting the number of testcases. Then follows description of testcases.
Each case begins with a single integer N denoting the length of string. The next line contains the string S.

Output:
For each testcase, print the first non repeating character present in string. Print -1 if there is no non repeating character.

Constraints:
1 <= T <= 900
1 <= N <= 104

Example:
Input :
3
5  
hello
12
zxvczbtxyzvy
6
xxyyzz

Output :
h
c
-1*/




import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n = sc.nextInt();
	        String inp = sc.next();
	        char str[] = inp.toCharArray();
	        int arr[]=new int[26];
	         for(int i=0;i<26;i++)
	        {
	            arr[i]=0;
	        }
	        for(int i=0;i<n;i++)
	        {
	            arr[str[i]-'a']++;
	        }
	        int count =0;
	        int a,b;
	        for(int i=0;i<n;i++)
	        {  a=str[i]-'a';
	           if(arr[a]==1)
	           {   
	               System.out.println( str[i]);
	             break;
	           }
	           else
	             count++;
	        }
	        if(count==n)
	           System.out.println("-1");
	       
	    }
	 }
}
