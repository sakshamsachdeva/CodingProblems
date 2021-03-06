/*Given a Linked List of size N, where every node represents a linked list and contains two pointers of its type:
(i) a next pointer to the next node,
(ii) a bottom pointer to a linked list where this node is head.

You have to flatten the linked list to a single linked list which should be sorted.

       5 -> 10 -> 19 -> 28
       |    |     |     |
       V    V     V     V
       7    20    22    35
       |          |     |
       V          V     V
       8          50    40
       |                |
       V                V
       30               45
And after flattening the above list, the sorted linked list looks like:

 5-> 7-> 8- > 10 -> 19-> 20-> 22-> 28-> 30-> 35-> 40-> 45-> 50.

Note: The flattened list will be printed using the bottom pointer instead of next pointer.

Input:
The first line of the input contains an integer 'T' denoting the number of test cases. Then T test cases follow.
First line of each test case contains an integer N denoting the number of head nodes connected to each other.
Second line of each test case contains N space separated numbers (M1, M2...Mn) denoting number of elements in linked lists starting with each head.
Third line of each test case contains all the elements of the linked list starting with 1st head node and covering all the elements through its down pointer, then 2nd head node and covering all its elements through down pointer and so on till the last head node of the linked list.

Output:
For each testcase, in a new line, print the flattened list in sorted order.

Your Task:
This is a function problem. You need to complete the function flatten() that takes head of the list as parameter and returns the root of flattened list. The printing is done by the driver code.

Constraints:
1 <= T <= 100
0 <= N <= 50
1 <= Mi <= 20
1 <= Element of linked list <= 103

Example:
Input:
1                   
4 
4 2 3 4                  
5 7 8 30 10 20 19 22 50 28 35 40 45

Output:
5 7 8 10 19 20 22 28 30 35 40 45 50
 */
 
 
 
 class GfG
{ 
    
    Node flatten(Node root)
    {   
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        Node head=root;
       
       while(head!=null)
       {
           minheap.add(head.data);
           
           if(head.bottom!=null)
                head=head.bottom;
           else
              {  root=root.next;
                head=root;}
       }
       
       Node dummy = new Node(-1);
       Node pointer=dummy;
       
       while(!minheap.isEmpty()){
           pointer.bottom= new Node(minheap.remove());
           pointer=pointer.bottom;
       }
       return dummy.bottom;
    }
}
