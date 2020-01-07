/*Given a singly linked list, remove all the nodes which have a greater value on its next adjacent element.

Input:
First line of input contains numbe of testcases T. For each testcase, first line of input contains length of the linked list and next line contains the elements of the linked list.

Output:
For each testcase, print the modified linked list.

User Task:
The task is to complete the function compute() which should modify the list as required. The printing is done by the driver code,

Constraints:
1 <= T <= 50
1 <= size of linked list <= 100
1 <= element of linked list <= 1000

Example:
Input:
3
8
12 15 10 11 5 6 2 3
6
10 20 30 40 50 60
6
60 50 40 30 20 10

Output:
15 11 6 3
60
60 50 40 30 20 10

Explanation:
Testcase 1: Since, 12, 10, 5 and 2 are the elements which have greater elements on their next node. So, after deleting them, the linked list would like be 15, 11, 6, 3.*/



class GfG
{
   void compute(LinkedList l)
    {
        Node current = l.head;
        Node nextN = current.next;
        Node prev = null;
        while(current != null && nextN != null) {
            if(current.data < nextN.data) {
                current.next = null;
                if(prev != null) {
                    prev.next = nextN;
                }
                if(l.head == current) {
                    l.head = nextN;
                }
                compute(l);
            }
            prev = current;
            current = nextN;
            nextN = current.next;

        }
    }
}
  
