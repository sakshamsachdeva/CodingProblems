/*
An string of words is given, the task is to reverse the string using stack.

Input Format:
The first line of input will contains an integer T denoting the no of test cases . Then T test cases follow. Each test case contains a string s of words without spaces.

Output Format:
For each test case ,print the reverse of the string in new line. 

Your Task:
Since this is a function problem, you don't need to take any input. Just complete the provided function.

Constraints:
1 <= T <= 100
1 <= length of the string <= 100

Example:
Input:
2
GeeksQuiz
GeeksforGeeks
Output:
ziuQskeeG
skeeGrofskeeG*/



class Stack{
    int n;
    int top;
    char a[];
    
    Stack (int size){
        n=size;
        top=-1;
        a=new char[n];
    }
    
    boolean isEmpty(){
        return(top<0);
    }
    
    boolean push(char x){
        if(top>n)
            return false;
        else
        {a[++top]=x;
          return true;
        }
    }
    char pop(){
        if(top<0)
           return 0;
        else
          return a[top--];
    }
}
class Solution {
      
       public void reverse(String str){
       StringBuffer sb= new StringBuffer(str);
       int n = sb.length();
       Stack s = new Stack(n);
       
       for(int i=0;i<n;i++){
           s.push(sb.charAt(i));
       }
       for(int i=0;i<n;i++)
       {
           char ch=s.pop();
           sb.setCharAt(i,ch);
       }
       System.out.println(sb.toString());
       
    }
}
