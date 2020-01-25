/*Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.

Input:
The first line contains T denoting the number of testcases. T testcases follow. Each case contains a string S containing characters.

Output:
For each test case, in a new line, output a single line containing the reversed String.

Constraints:
1 <= T <= 100
1 <= |S| <= 2000

Example:
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr*/



import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)throws IOException
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	    while(t-->0)
	    {
	        String arr[]=sc.next().split("\\.");
	        StringBuilder sb=new StringBuilder();
	        for(int i=arr.length-1;i>=0;i--)
	        {
	            if(i==0)
	                sb.append(arr[i]);
	            else
	                sb.append(arr[i]+".");
	        }
	        String res=sb.toString();
	        System.out.println(res);
	    
	        
	    
	    }
	 }
}
