/*Given a singly linked list: A0→A1→…→An-1→An, reorder it to: A0→An→A1→An-1→A2→An-2→…
For example: Given 1->2->3->4->5 its reorder is 1->5->2->4->3.

Note: It is recommended do this in-place without altering the nodes' values.

Input:
First line of input contains number of testcases T. For each testcase, there will be two lines of input, first of which contains length of linked list and next line contains elements of the nodes of linked list.

Output:
Reorder it as explained above.

User Task:
The task is to complete the function reorderList() which should reorder the list as required.

Constraints:
1 <= T <= 200
1 <= N <= 200

Example:
Input:

2
3
1 2 3
4
1 7 3 4

Output:
1 3 2
1 4 7 3

Explanation:
Testcase 2: After rearranging the given list as required, we have list as 1 -> 4 -> 7 -> 3.*/




class saksham
{
    Node reorderlist(Node head)
    {
        Node ref=head;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(ref!=null)
        {
            list.add(ref.data);
            ref=ref.next;
        }
     
         Node result=new Node(-1);
         Node pointer=result;
         
        int n=list.size();
                        int m=0;
int o=n-1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                pointer.next=new Node(list.get(m));
                m++;
                pointer=pointer.next;
            }
            else{
                pointer.next=new Node(list.get(o));
                o--;
                pointer=pointer.next;               
            }
        }
        return result.next;
    }
}
