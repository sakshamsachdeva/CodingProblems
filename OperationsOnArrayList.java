/*Given an arraylist of integers. The task is to perform operations on ArrayList according to the queries and print output for the required queries.

Note: use Collections.sort() to sort the list in natural order, Collections.reverseOrder() to arrange the elements in reverse, get() to return the element at index of the list, binarySearch() to find the index of the specified element in the list.

Input Format:
First line of input contains number of testcase T. For each testcase, first line of input contains Q, number of queries. Next line contains Q queries as:

a x : inserts the element x at the end of the list.

i : arrange the list in increasing order.

d : arrange the list in decreasing order.

s y : search for the element y in the list and prints the first-index(for duplicate) (0-based indexing) of that in the list. -1 if not found.

Output Format:
For each testcase, print the output according to the queries.

Your Task:
Your task is to complete the functions insert(), IncOrder(), Search() and DecOrder() such that driver code will be able to perform required queries.

Constraints:
1 <= T <= 100
1 <= A[i] <= 106
1 <= Q <= 103

Example:
Input:
2
6
a 2 a 3 a 4 a 2 i s 2
5
a 2 a 3 a 3 d s 5

Output:
0
-1

Explanation:
Testcase 1: After inserting elements, list is (2, 3, 4, 2) and arranging them in ascending order, we have list as (2, 2, 3, 4). Now, serching for 2, first occurence is at 0th index.

Testcase 2: After inserting elements, list is (2, 3, 3) and arranging them in descending order, we have list as (3, 3, 2). Finding 5 gives -1, as 5 is not present.*/


class Geeks
{
     // Function to insert element into list
    public static void insert(ArrayList<Integer> list, int x)
    {
        list.add(x);
    }
    
    // Function to sort list in Increasing order
    public static void IncOrder(ArrayList<Integer> list)
    {
        Collections.sort(list);
    }
    
    // Function to search element in the lise
    // val : element to be searched
    public static void Search(ArrayList<Integer> list, int val)
    {
        
        
        int flag = -1;
        if(list.contains(val))
        {
            System.out.println(list.indexOf(val));
            flag = 0;
        }
        else if(flag == -1){
            System.out.println("-1");
        }
    }
    
    // Function to sort list in decreasing order
    public static void DecOrder(ArrayList<Integer> list)
    {
        Collections.reverse(list);
    }
}
