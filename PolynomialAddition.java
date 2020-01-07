/*Given two polynomial numbers represented by a linked list. The task is to complete the  function addPolynomial() that adds these lists meaning adds the coefficients who have same variable powers.

Input:
The first line of input contains an integer T denoting the number of test cases. Then in the next line is an integer N denoting the number of terms of first polynomial. In the next line are N space separated pairs x and y where x denotes the coefficient and y denotes the power. Similarly In the next line is an integer M denoting the no of terms of the second polynomial and in the line following it are N space separated pairs for second polynomial.

Output:
For each test case in a new line print the required polynomial in decreasing order of the power.

User Task:
The task is to complete the function addPolynomial() which should add the polynomial with same powers.

Constraints:
1 <= T <= 100
1 <= N, M <= 105
1 <= x, y <= 106

Example:
Input:
2
1
1 2
1
1 3
2
1 3 2 2
2
3 3 4 2
Output:
1x^3 + 1x^2
4x^3 + 6x^2

Explanation:
Testcase 1: Since, x2 and x3 both have different powers as 2 and 3. So, their coefficient can't be added up.

Testcase 2: Since, x3 has two different coefficients as 3 and 1. Adding them up will lead to 4x3. Also, x2 has two coefficients as 4 and 2. So, adding them up will give 6x2.
 */
 
 
 
 class GFG
{
    public static void addPolynomial(Node p1,Node p2)
    {
       Node head=new Node(2,2);
       head.next=null;
       Node p=head;
        while(p1!=null&&p2!=null)
        {
            if(p1.pow==p2.pow)
            {
                
                p1.coeff=p1.coeff+p2.coeff;
                head.next=p1;
                head=p1;
                p1=p1.next;
                p2=p2.next;
                
            }
           else if(p1.pow>p2.pow)
            {
              
                head.next=p1;
                head=p1;
                p1=p1.next;
                //p2=p2.next 
            }
           else  if(p1.pow<p2.pow)
            {
              
                head.next=p2;
                head=p2;
                //p1=p1.next;
                p2=p2.next ;
            }
            
        }
        if(p1!=null)
        {
            head.next=p1;
        }
        if(p2!=null)
        head.next=p2;
        
        p=p.next;
        while(p!=null)
        {
            System.out.print(p.coeff+"x"+"^"+p.pow+" ");
            p=p.next;
            if(p!=null)
             System.out.print("+"+" ");
        }
        
    }
}
