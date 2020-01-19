/*Given an array with n distinct elements, convert the given array to a reduced form where all elements are in range from 0 to n-1. The order of elements is same, i.e., 0 is placed in place of smallest element, 1 is placed for second smallest element, … n-1 is placed for largest element.

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N, where N is the size of array.
The second line of each test case contains N input arr[i].

Output:

Print the reduced form of the array.

Constraints:

1 ≤ T ≤ 100
1 ≤ N ≤ 200
1 ≤ arr[i] ≤ 1000

Example:

Input:
2
3
10 40 20
5
5 10 40 30 20

Output:
0 2 1
0 1 4 3 2*/



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
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        int b[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	            b[i]=arr[i];
	        }
	        Arrays.sort(b);
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++)
	            {    if(b[i]==arr[j])
	                     {arr[j]=i;
	                     break;
	                     }
	            }
	        }
	        for(int i=0;i<n;i++)
	        {
	            System.out.print(arr[i]+" ");
	        }
	        System.out.println();
	        
	    }
	 }
}
