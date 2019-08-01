package FFHS;

/**
 * Selection Sort Algorithm, O(n^2)
 *
 * the outer loop begins from the end of the array and moves towards the start
 * imagine the second loop as a pointer, that shows every time the biggest element, and this element
 * is being replaced with the element of the outer loop. Every repetition of the inner loop, loops
 * from zero to the lastUnsortedElement (which is being decremented from the outer loop), so we don't
 * get any duplicate numbers.
 * */

public class Main {

    public static void main(String[] args) {

        int[] myArray = {5, -3, 77, 45, 22, 1, 38};

        for (int lastUnsortedElement = myArray.length - 1; lastUnsortedElement > 0; lastUnsortedElement--){
            int largestNumber = 0; // assume that the largest number of the array is the one in index 0
            for (int currentElement = 1; currentElement <= lastUnsortedElement; currentElement++){
                if (myArray[currentElement] > myArray[largestNumber]){
                    largestNumber = currentElement;
                }
            }
            swap(myArray, largestNumber, lastUnsortedElement);
        }



        for (int i = 0; i < myArray.length; i++) { // method to print the elements
            System.out.println(myArray[i]);
        }
    }

    public static void swap(int[] theArray, int currentElement, int currentElementPlusOne){
        if (theArray[currentElement] == theArray[currentElementPlusOne]){ // if the 2 numbers are equal, do nothing
            return;
        }
        else {
            int temp = theArray[currentElement]; // save the current Element to this variable
            theArray[currentElement] = theArray[currentElementPlusOne]; // change the value of the current Element, to currentElementPlusOne
            theArray[currentElementPlusOne] = temp; // change the value of the currentElementPlusOne to current Element value that we saved before (swap values)
        }
    }
}
