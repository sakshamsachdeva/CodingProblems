/*You are given a sorted array containing only numbers 0 and 1. Find the transition point efficiently. Transition point is a point where "0" ends and "1" begins.

Input:

You have to complete the method which takes 2 argument: the array arr[] and size of array N. You should not read any input from stdin/console. There are multiple test cases. For each test cases, this method will be called individually.

Output:

Your function should return transition point.

Constraints:

1 ≤ T ≤ 100
1 ≤ N ≤ 500000
0 ≤ C[i] ≤ 1

Example:

Input
1
5
0 0 0 1 1

Output
3*/


class GfG
{
   
    
	int transitionPoint(int a[],int n)
	{
           int low=0;
int high=n-1;

while(low < high)
{
    int mid=(low+high)/2;
    if(a[mid]==0 && a[mid+1]==1)
    return mid+1;
    if(a[mid]==1 && a[mid-1]==0)
    return mid;
    else if(a[mid]==0)
    low=mid+1;
    else if(a[mid]==1)
    high=mid-1;
}
return -1;
        } 
}
