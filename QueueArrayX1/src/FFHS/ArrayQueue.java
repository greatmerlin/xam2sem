package FFHS;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;              // front and back will be initialised with the zero value.
    private int back;               // back is the next available position, like top in the stack implementation.
                                    // when we add an item, the front never changes, because we add the item at the back.
    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {        // add elements to the back of the queue, front element is always at index front, and back element is always (back -1)
        if (back == queue.length) {             // the back field will always points out to the next available position at the queue.
            Employee[] newArray = new Employee[2 * queue.length];           // px back points to 3, that mean the end of the q is at position 2 ( = back -1).
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = employee;
        back++;
    }

    public Employee remove() {
        if (size() == 0) {                          // check whether the queue is empty
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];           // we always take items from the FRONT of the queue
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return employee;
    }

    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }

}
