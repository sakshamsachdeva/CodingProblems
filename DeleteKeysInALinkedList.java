/*Given a single linked list and an integer x. Your task is to complete the function deleteAllOccurances() which deletes all occurences of a key x present in the linked list. The function takes two arguments: the head of the linked list and an integer x. The function should return the head of the modified linked list.

Input:
The first line of input contains an element T, denoting the number of test cases. Then T test cases follow. Each test case contains three lines. The first line of each test case contains an integer N denoting the no of elements of the linked list. Then in the next line are N space separated values of the linked list. The third line of each test case contains an integer x.

Output:
The output for each test case will be the space separated value of the returned linked list.

User Task:
The task is to complete the function deleteAllOccurances() which should delete all the occurrences of given number x from the list.

Constraints:
1 <= T <= 300
1 <= N <= 100
1 <= x <= N

Example:
Input:
2
5
2 2 1 4 4
4
6
1 2 2 3 2 3
2

Output:
2 2 1
1 3 3

Example:
Testcase 2: Given number to delete is 2. After deleting all occurrences of 2, we have elements in the list as 1, 3, and 3.
 */
 
 
 
 class GfG
{
    void deleteNode(Node no)
    {
        no.data=no.next.data;
        no.next=no.next.next;
    }
    
    Node deleteAllOccurances(Node head, int x)
    {
        Node he=head,prev=null;
        while(head!=null && head.next!=null)
        {
            if(head.data==x)
            deleteNode(head);
            else
            {
                prev=head;
                head=head.next;
            }
        }
        if(head.data==x)
        {
            prev.next=null;
        }
        return he;
    }
}
