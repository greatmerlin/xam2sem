package FFHS;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top; // in this implementation, top will be always 1 above the last element added, the top item = (top -1)

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (top == stack.length) {              // if it's full, we double the capacity before we increment the pointer (top) by one
            // need to resize the backing array             --- it matters how large the size of the array is ->, worst case of push: O(n) linear
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = employee; // to do this, it doesn't matter how large is the stack (array), O(1)
    }

    public Employee pop() {                     // always in constant time  O(1) because it doesn't depent on the number of items
        if (isEmpty()) {                        // isEmpty implementation -> create a Method that returns true if a condition is met.
            throw new EmptyStackException();
        }

        Employee employee = stack[--top]; // decrement top and use the result as index to the stack
        stack[top] = null;
        return employee;
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {   // top item = located at (top - 1) -> print our stack from top to bottom
            System.out.println(stack[i]);
        }
    }

}
