/*Given an array of size N consisting of only 0's and 1's ,which is sorted in such a manner that all the 1's are placed first and then they are followed by all the 0's. You have to find  the count of all the 0's.
 

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. 
The first line of each test case contains an integer N, where N is the size of the array A[ ].
The second line of each test case contains N space separated integers of all 1's follwed by all the 0's, denoting elements of the array A[ ].


Output:
Print out the number of 0's in the array. 
 

Constraints:
1 <= T <= 100
1 <= N <= 30
0 <= A[i] <= 1
 

Example :

Input:
3
12
1 1 1 1 1 1 1 1 1 0 0 0 
5
0 0 0 0 0
6
1 1 1 1 1 1


Output:
3
5
0
 

Expected Complexity:

O(logN)*/



import java.lang.*;
import java.io.*;
class GFG {
  public static int firstZero(int arr[], int low, int high)  
    { 
        if (high >= low)  
        { 
            int mid = low + (high - low) / 2; 
            if ((mid == 0 || arr[mid - 1] == 1) && arr[mid] == 0) 
                return mid; 
  
            if (arr[mid] == 1)
                return firstZero(arr, (mid + 1), high); 
            else 
                return firstZero(arr, low, (mid - 1)); 
        } 
        return -1; 
    } 
  
    public static int countZeroes(int arr[], int n)  
    { 
        int first = firstZero(arr, 0, n - 1); 
        if (first == -1) 
            return 0; 
  
        return (n - first); 
    } 
	public static void main (String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int j=0;j<n;j++)
	            arr[j] = sc.nextInt();
	            System.out.println(countZeroes(arr,n));
	    }
	}
}
