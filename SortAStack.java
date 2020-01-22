/*Given a stack, the task is to sort it such that the top of the stack has the greatest element.

Input:
The first line of input will contains an integer T denoting the no of test cases . Then T test cases follow. Each test case contains an integer N denoting the size of the stack. Then in the next line are N space separated values which are pushed to the the stack. 

Output:
For each test case output will be the popped elements from the sorted stack.

Constraints:
1<=T<=100
1<=N<=100

Example(To be used only for expected output):
Input:
2
3
3 2 1
5
11 2 32 3 41

Output:
3 2 1
41 32 11 3 2

Explanation:
For first test case stack will be
1
2
3
After sorting 
3
2 
1

When elements  popped : 3 2 1*/class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		Stack <Integer> aux = new Stack<>();
		
		while(!s.isEmpty())
		{
		    int temp = s.pop();
		    while(!aux.isEmpty()&& aux.peek()>temp)
		    {
		        s.push(aux.pop());
		    }
		    aux.push(temp); 
		}
		return aux;
	}
	
}
