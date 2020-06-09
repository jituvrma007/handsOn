package easy_problems;

import java.util.Stack;

/**
 155. Min Stack
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 

Example 1:
Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
min.push(-2);
min.push(0);
min.push(-3);
min.getMin(); // return -3
min.pop();
min.top();    // return 0
min.getMin(); // return -2
 

Constraints:
Methods pop, top and getMin operations will always be called on non-empty stacks.
 */

public class Min_Stack {

	Stack<Long> stack;
	long minElement;

	public Min_Stack() {
		stack = new Stack<Long>();

	}

	public void push(long x) {
		if (stack.isEmpty()) {
			stack.push(x);
			minElement = x;
		}
		if (x < minElement) {
			stack.push(2 * x - minElement);
			minElement = x;
		} else
			stack.push(x);
	}

	public void pop() {

		long y = stack.pop();
		if (y < minElement) {
			minElement = 2 * minElement - y;
		}

	}

	public long top() {
		System.out.println(stack.peek());
		return stack.peek();
	}

	public long getMin() {
		System.out.println(minElement);
		return minElement;
	}
	
	public class MinStack {
		
		Stack<Integer> stack1;
		Stack<Integer> stack2;

		public MinStack() {
	        stack1 = new Stack<>();
	        stack2 = new Stack<>();
	    }
	    
	    public void push(int x) {
	        stack1.push(x);
	        if (stack2.isEmpty()) {
	            stack2.push(x);
	        } else {
	            stack2.push(Math.min(stack2.peek(), x));
	        }
	    }
	    
	    public void pop() {
	        stack1.pop();
	        stack2.pop();
	    }
	    
	    public int top() {
	        return stack1.peek();
	    }
	    
	    public int getMin() {
	        return stack2.peek();
	    }
			
	}

	public static void main(String[] args) {

		Min_Stack minStack = new Min_Stack();
		//["MinStack","push","push","push","top","pop","getMin","pop","getMin","pop","push","top","getMin","push","top","getMin","pop","getMin"]
		//[[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]
		//[null,null,null,null,2147483647,null,2147483646,null,2147483646,null,null,2147483647,2147483647,null,-2147483648,-2147483648,null,2147483647]
		
		MinStack min = minStack.new MinStack();
		min.push(2147483646);
		min.push(2147483646);
		min.push(2147483647);
		min.top(); // return -3
		min.pop();
		min.getMin(); // return -2
		min.pop();
		min.getMin(); // return -2
		min.pop();
		min.push(2147483647);
		min.top();
		min.getMin(); 
		min.push(-2147483648);
		min.top();
		min.getMin(); 
		min.pop();
		min.getMin(); 

	}
}
