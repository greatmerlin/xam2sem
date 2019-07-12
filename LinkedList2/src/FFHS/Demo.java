package FFHS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> placesTovisit = new LinkedList<>();

/*        placesTovisit.add("bedroom");
        placesTovisit.add("diningRoom");
        placesTovisit.add("hall");
        placesTovisit.add("toilet");
        placesTovisit.add("gurstRoom");
        placesTovisit.add("kitchen");
        placesTovisit.add("livingRoom");*/

        addInOrder(placesTovisit, "Thess");
        addInOrder(placesTovisit, "Ath");
        addInOrder(placesTovisit, "Basel");
        addInOrder(placesTovisit, "Zurich");
        
        printList(placesTovisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        // we are going to use an Iterator -> go through the entries of a list

        Iterator<String> i = linkedList.iterator();

        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("========================");
    }

    //sort the listed String items alphabetical (without duplicates)

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator =  linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            // this comparison gives us a number. If it is a zero (0), the values are equal

            if (comparison == 0){
                System.out.println(newCity + " is already included");
                return false;
            }
            else if (comparison > 0){
                // at that point, because we used the .next(), we are already at this element.
                // but we want to go one element back, to add the new city at the right place

                stringListIterator.previous(); // go back 1
                stringListIterator.add(newCity); // so this way, it will be appear before this entry
                return true;
            }
            else if (comparison < 0){
                //move on to the next city
                // the next() was already used, we are already there
                // do not do anything
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
}
