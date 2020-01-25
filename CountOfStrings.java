/*Given a length n, count the number of strings of length n that can be made using ‘a’, ‘b’ and ‘c’ with at-most one ‘b’ and two ‘c’s allowed.

 

Input:

The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. The first line of each test case contains an integer N denoting the length of the string.


Output:

Output the count of the strings that can be formed under the given constraint.


Constraints:

1<= T <=100

1<= N <=1000


Example:

Input:

2

1

3

Output:

3

19*/



import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt(); // test cases first int in first line
        
       
        for(int caseNum=1; caseNum <= t; caseNum++){
            scan.nextLine();
            int n = scan.nextInt();
            System.out.println(getStringCountForLength(n));
            
        }
   
	}
		// String with length n with at most
        // n a's
        // 1 b 
        // 2 c's
	public static int getStringCountForLength(int n){
        int sum;
        
        sum = 1; //(a) All n's are a
        sum += n; //(a one b) there are n different positions where b can stand
        sum += n; // (a one c) there are n different positions where one c can stand (but we have 2...)
        sum += n*(n-1); //( a one b one c)  there are n positions where b can stand and n-1 positions where one c can stand (divide by 2 is because two c's are used and order doesnt matter)
        sum += n*(n-1)/2; //( a two c 's) there are n positions where first c can stay and (n-1)/2 positions where second c can stand
        sum += n*(n-1)*(n-2)/2 ; // (a one b two c's)
        return sum;

    }
}
