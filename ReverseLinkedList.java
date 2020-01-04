/*Given a linked list of size N. The task is to reverse every k nodes (where k is an input to the function) in the linked list.

Input:
First line of input contains number of testcases T. For each testcase, first line contains length of linked list and next line contains the linked list elements.

Output:
For each testcase, there will be a single line of output which contains the linked list with every k group elements reversed.

User Task:
The task is to complete the function reverse() which should reverse the linked list in group of size k.

Example:
Input:
1
8
1 2 2 4 5 6 7 8
4

Output:
4 2 2 1 8 7 6 5

Explanation:
Testcase 2: Since, k = 4. So, we have to reverse everty group of two elements. Modified linked list is as 4, 2, 2, 1, 8, 7, 6, 5.*/



   class saksham
{
    public static Node reverse(Node node, int k)
    {
        
        Node pre = null;
        Node next = null;
        Node cur = node;
        int count = 0;
        while(count < k  && cur !=null)
        {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            count++;
        }
        
        if(next != null)
            node.next = reverse(next,k);
            
        return pre;
    }
}
