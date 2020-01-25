/*Ishaan being curious as always, was playing with numbers when he started to reversing the numbers. He invented something called the "inverting factor" of two numbers.
Inverting Factor of 2 integers is defined as the absolute difference between the reverse of the 2 integers.
Ishaan has an array A of N integers. He wants to find out the smallest possible Inverting Factor among all pairs of his integers. Help him find that.
Note : Trailing zeros in a number of ignored while reversing, i.e. 1200 becomes 21 when reversed.

Input : 
First line of input contains a single integer T denoting the number of test cases.
The first line of each test case contains an integer N.
The second line contains N space-separated integers denoting the array A.

Output : 
For each test case, print the required answer in a new line.

Constraints : 
1 <= T <= 100
2 <= N <= 1000
1 <= A[i] <= 10^5

Example : 
Input : 
3
5
56 20 47 93 45
6
48 23 100 71 56 89
4
26 15 45 150
Output : 
9
14
0

Explanation : 
Case 1 : 
The minimum inverting factor is 9, of the pair (56,47)

Case 2 : 
The minimum inverting factor is 14, of the pair (48,89)

Case 3 : 
The minimum inverting factor is 0, of the pair (15,150)
 */import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	    while(t>0)
	    {
	      int n=sc.nextInt();
	      int arr[]=new int[n];
	      for(int i=0;i<n;i++)
	      {
	          arr[i]=sc.nextInt();
	      }
	     for(int i=0;i<n;i++)
	     {
	         int temp=arr[i];
	         int reverse=0;
	          while(temp!= 0)
                   {
                        reverse = reverse * 10;
                        reverse = reverse + temp%10;
                        temp = temp/10;
                   }
                   
            arr[i]=reverse;
	         
	     }
	    Arrays.sort(arr);
	    int ans=(arr[1] - arr[0]);
	    for(int i=1;i<n;i++)
	     {ans = Math.min(ans, Math.abs(arr[i] - arr[i - 1]));
	     }
	     System.out.println(ans);
	    t--;
	    }
	 }
}
