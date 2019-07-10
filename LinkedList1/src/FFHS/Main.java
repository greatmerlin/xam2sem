package FFHS;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Tim", 54.96);
        Customer  anothercustomer;

        // java sets the anothercustomer to POINT to the customer

        anothercustomer = customer;

        // and it points to the customer, so the customer will change

        anothercustomer.setBalance(12.18);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i= 0; i < intList.size(); i++){
            System.out.println(i + ": " +intList.get(i));
        }

        // we add at index 1, the number 2
        intList.add(1,2);

        System.out.println();

        for (int i= 0; i < intList.size(); i++){
            System.out.println(i + ": " +intList.get(i));
        }

        // if we remove an element, the computer must do much processing because it will replace the
        // missing element with all of the elements that were after it

        /*
        * Linked list is a lot faster than an array list, because when you add or remove an element, the previous one
        * stop pointing were it was pointing until now and points to that one, and the new element points where the
        * previous element was pointing. That way, no elements must be replaced (change position) and the system
        * uses less resources.
        *
        * If we want to remove an element, the previous one will start pointing were the element we want to delete
        * was pointing. That way, the element we want to delete still points out to the same target, but because
        * no one targets IT anymore, it will be destroyed from java, during the garbage collection.
        *
        * */
    }
}
