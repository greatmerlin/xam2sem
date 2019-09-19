package FFHS;

/*
* hints:
* the last node points to null
* the only thing we need to know to work with the list is the head
* from the head we can traverse (travel across or through sth) the entire list, because every node has a link to the next one
* */

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next; // stores the reference of the next item of the list

    public EmployeeNode(Employee employee){     // only Employee in the Constructor, because when we create it, we donÄt know which the next item will be
        this.employee = employee;               // because we create the node first and then we decide which node is supposed to be next to it
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public String toString(){           // when we print a node in EmployeeNode we will see Strings printed
        return employee.toString();
    }
}
