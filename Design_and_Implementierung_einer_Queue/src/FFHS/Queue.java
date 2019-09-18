package FFHS;

public class Queue {

    int queue[] = new int[5]; //create an array
    int size;
    int front; // the front element
    int rear;  // the rear element (default value 0, if we don't set a value)

    public void enQueue(int data){

        if(!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++; //the size is also been increased when we add elements
        }
        else{
            System.out.println("Sorry, the list is Full");
        }
    }

    public int deQueue(){    //to remove a value , we just have to move the front +1

        int data = queue[front];

        if(!isEmpty()) {
            front = (front + 1) % 5;
            size--;
        }
        else{
            System.out.println("Nothing to be deleted, the list is empty");
        }
        return data;
    }

    public void show(){

        System.out.println("Elements: ");
        for(int i=0; i < size; i++){

            System.out.println(queue[(front + i) % 5] + "");
        }
        System.out.println();

        for(int numbers : queue){
            System.out.println(numbers);
        }
    }

    public int getSize(){

        return size;
    }

    public boolean isEmpty(){ // simply written: return size == 0;

        if(getSize() == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){

        return getSize() == 5;
    }
}
