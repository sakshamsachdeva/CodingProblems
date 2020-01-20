/*
Complete the function to print spiral order traversal of a tree. For below tree, function should print 1, 2, 3, 4, 5, 6, 7.


 
 

Input Format:
The task is to complete the method which takes one argument, root of the Tree. The struct node has a data part which stores the data, pointer to left child and pointer to right child.
There are multiple test cases. For each test case, this method will be called individually.

Output Format:
The function should print level order traversal in spiral form .

User Task:
The task is to complete the function printSpiral() which prints the elements in spiral form of level order traversal. The newline is automatically appended by the driver code.

Constraints:
1 <= T <= 100
1 <= Number of nodes <= 3000
1 <= Data of a node <= 1000

Example:
Input:
2
2
1 2 R 1 3 L
4
10 20 L 10 30 R 20 40 L 20 60 R

Output:
1 3 2
10 20 30 60 40

Explanation:
Testcase1: The tree is
        1
     /      \
   3       2
So, the spiral level order would be 1 3 2
Testcase2: The tree is
                           10
                        /        \
                     20         30
                  /       \
               40       60
So, the spiral level order would be 10 20 30 60 40*/



*/



class Spiral
{
        // function to find height of tree
		int height(Node node)
		{
			// base case
			if(node==null)
				return 0;
			
			// height of left subtree
			int l = 1+height(node.left);
			
			// height of right subtree
			int r = 1+height(node.right);
			if(l>r)
				return l;
			else
				return r;
		}
		
		 void printGivenLevel(Node node, int level, boolean ltr) 
		{
			// base case
			if (node == null) 
				return;
			
			// when level is 1
			if (level == 1) 
				System.out.print(node.data + " ");
				
			// when level is greater than 1
			else if (level > 1) 
			{
				if (ltr != false) 
				{
				    // recurse for left side
					printGivenLevel(node.left, level - 1, ltr);
					
					// recurse for right side
					printGivenLevel(node.right, level - 1, ltr);
				} 
				else
				{
					printGivenLevel(node.right, level - 1, ltr);
					printGivenLevel(node.left, level - 1, ltr);
				}
            }
		}
		
		
	   void printSpiral(Node node) 
       {
			if(node==null)
				return;
			int h = height(node);
			int i;
	 
			/* ltr -> left to right. If this variable is set then the
			   given label is transversed from left to right */
			boolean ltr = false;
			for (i = 1; i <= h; i++) 
			{
				printGivenLevel(node, i, ltr);
	 
				/*Revert ltr to traverse next level in opposite order*/
				ltr = !ltr;
			}
 
		}
    
}

