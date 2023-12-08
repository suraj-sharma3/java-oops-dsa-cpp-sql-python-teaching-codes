/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Postfix evaluation & it's conversion to infix & prefix

/*
postfix : operand operand operator e.g. 3 4 + (operator comes at the end)
infix : operand operator operand e.g. 3 + 4 (operator comes in between the operands)
prefix : operator operand operand e.g. + 3 4 (operator comes at the beginning)
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a postfix expression : ");
		String exp = scan.next(); // take the postfix expression to be evaluated in the form of a string or an array
		int ans = postfixEvaluation(exp);
		System.out.println("The answer of the evaluated postfix expression is " + ans);
		String infix = postfixToInfix(exp);
		System.out.println("The infix expression of the entered postfix expression is " + infix);
		String prefix = postfixToPrefix(exp);
		System.out.println("The prefix expression of the entered postfix expression is " + prefix);
		
	}
	
	public static int postfixEvaluation(String exp){
	    Stack<Integer> st = new Stack<>(); // we'll convert the grabbed character into an integer & then we'll push it into the stack, that's why we have to take an integer stack
	    for(int i = 0; i < exp.length(); i++){
	        char ch = exp.charAt(i);
	        if(Character.isDigit(ch)){ // if the character is an operand
	            st.push(ch - '0'); // we'll push the operand in integer form
	        }
	        else{ // if the character is an operator (+, -, *, /)
	            int op1 = st.pop(); // pop 2 operands from the stack
	            int op2 = st.pop();
	            
	            // perform the operation on the 2 popped operands like op2 (+ or - or * or /) op1
	            // why op2 then operator then op1? operand in op2 was pushed into the stack before operand in op1
	            // op2 comes before than op1 in the entered expression if we go from left to right in the expression
	            if(ch == '+') st.push(op2 + op1);
	            else if(ch == '-') st.push(op2 - op1);
	            else if(ch == '*') st.push(op2 * op1);
	            else st.push(op2 / op1); // if ch == '/'
	        }
	    }
	    return st.peek(); // whatever is left in the stack outside the above for loop is the answer of the postfix expression
	}
	
	public static String postfixToInfix(String exp){
	    Stack<String> st = new Stack<>(); // make a stack of string type as it will store the infix expression
	    for(int i = 0; i < exp.length(); i++){
	        char ch = exp.charAt(i); // grab a character from the given postfix expression
	        if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){ // if the grabbed character is an operator
	            String op1 = st.pop(); // grab 2 operands from the stack
	            String op2 = st.pop();
	            String resultant = "(" + op2 + ch + op1 + ")"; // arrange the operands & operator in infix format & then push the infix expression into the stack
	            // or String resultant = "" + op2 + ch + op1;
	            st.push(resultant);
	        }
	        else{ // if the grabbed character is an operand, then push it into the stack
	            st.push(ch + ""); // convert the grabbed character into a string & then push it into the stack
	        }
	    }
	    return st.peek(); // whatever's left in the stack outside the for loop is the infix expression
	}
	
	public static String postfixToPrefix(String exp){
	    Stack<String> st = new Stack<>();
	    for(int i = 0; i < exp.length(); i++){
	        char ch = exp.charAt(i);
	        if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
	            String op1 = st.pop();
	            String op2 = st.pop();
	            String resultant = "(" + ch + op2 + op1 + ")"; //  arrange the operands & operator in prefix format & then push the prefix expression into the stack
	            // or String resultant = "" + ch + op2 + op1;
	            st.push(resultant);
	        }
	        else{
	            st.push(ch + "");
	        }
	    }
	    return st.peek(); // whatever's left in the stack outside the for loop is the prefix expression
	}
}
