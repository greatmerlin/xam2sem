package FFHS;

public class Main {

    public static void main(String[] args) {

    Queue myList = new Queue();
    myList.enQueue(5);
    myList.enQueue(2);
    myList.enQueue(7);
    myList.enQueue(3);
    myList.enQueue(8);

    myList.deQueue();

    //  myList.deQueue();      //me to deQ den kanw remove ta elements, kanw shift ta pointers
   // myList.deQueue();

    myList.show();


    //adding 4 elements, removing 2, then adding 2 ,total 6, array size 5

        System.out.println("Size: " + myList.getSize());

        System.out.println("Is the Queue empty? : " + myList.isEmpty());
        System.out.println("Is the Queue full? : " + myList.isFull());


    }
}
