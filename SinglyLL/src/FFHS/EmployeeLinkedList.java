package FFHS;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head); // the new node should point where the current head points
        head = node; // the new node is now the head
        size++;
    }

    public EmployeeNode removedFromFront(){
        if (isEmpty()){
            return null;
        }
            EmployeeNode removedNode = head;
            head = head.getNext(); // the head will be the next item on the row
            size --;
            removedNode.setNext(null);

            return removedNode;

    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("Head -> ");
        while (current != null){
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null"); // last item on the list will be null
    }
}
