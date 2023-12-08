/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Queue myQueue = new Queue();
		myQueue.enque(7);
		myQueue.enque(6);
		myQueue.enque(3);
		myQueue.enque(9);
		myQueue.enque(2);
		
		myQueue.deque();
	}
}

class Queue{
    static Stack<Integer> pushStack = new Stack<>();
    static Stack<Integer> popStack = new Stack<>();
    
    public static void enque(int num){
        pushStack.push(num);
    }
    
    public static int deque(){
        if(popStack.size() == 0){
            while(pushStack.size() > 0){
            popStack.push(pushStack.pop());
            }
            return popStack.pop();
        }
        return popStack.pop();
    }
}
