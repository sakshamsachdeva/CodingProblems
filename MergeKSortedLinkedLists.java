/*Given K sorted linked lists of different sizes. The task is to merge them in such a way that after merging they will be a single sorted linked list.

Input:
First line of input contains number of testcases T. For each testcase, first line of input contains number of linked lists N and next line contains data of nodes of all K linked lists, with first element as M, the length of linked list and next M elements for the same linked list.

Output:
For each testcase, in a new line, print the merged linked list.

Your Task:
The task is to complete the function mergeKList() which merges the K given lists into a sorted one. The printing is done automatically by the driver code.

Constraints
1 <= T <= 50
1 <= N <= 103

Example:
Input:
2
4
3 1 2 3 2 4 5 2 5 6 2 7 8
3
2 1 3 3 4 5 6 1 8

Output:
1 2 3 4 5 5 6 7 8
1 2 3 4 5 6 8

Explanation :
Testcase 1: The test case has 4 sorted linked list of size 3, 2, 2, 2
1st    list     1 -> 2-> 3
2nd   list      4->5
3rd    list      5->6
4th    list      7->8
The merged list will be 1->2->3->4->5->5->6->7->8.
 */
 
 
 
 class saksham
{
    Node mergeKList(Node[]a,int N)
    {
     PriorityQueue<Integer> minheap= new PriorityQueue<>();
     for(Node head:a)
     {
         while(head!=null)
         {minheap.add(head.data);
         head=head.next;
         }
     }
     
     Node dummy = new Node(-1);
     Node head=dummy;
     while(!minheap.isEmpty())
     {
         head.next=new Node(minheap.remove());
         head=head.next;
     }
     return dummy.next;
    }
}
