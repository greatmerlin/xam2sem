package FFHS;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>(); // by creating a List<> and not ArrayList, it's easy for us later on to swap to another type of List without much trouble.

        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 456));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

//        employeeList.forEach(employee -> System.out.println(employee)); // lamda does what a loop does (same bigO), but you save code lines. toString Method help us also.
//
//        System.out.println(employeeList.get(1));
//        prints the second employee. Time complexity has nothing to do with the size of the list. Its O(1) - constant time - as long as you provide the index
//
//        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("Theo", "Bax", 076)); // replace the first employee with the new one.
        employeeList.forEach(employee -> System.out.println(employee)); // lamda does what a loop does (same bigO), but you save code lines. toString Method help us also.

        // get the number of the items of the list (not the capacity, the actual employees at the moment)
        System.out.println(employeeList.size());

        // ad sm1 at specific index -> some employees have to be shifted -> worst case O(n) - linear time operation -
        employeeList.add(3, new Employee("pedro", "dos", 777));
        employeeList.forEach(employee -> System.out.println(employee)); // lamda does what a loop does (same bigO), but you save code lines. toString Method help us also.

        System.out.println();

        // if we want to back up the array, it will be full with objects though, not employee instances
//        Object[] employeeArray = employeeList.toArray();

        // if we want an array of Employee elements, then we need to pass the items we want to the array. We also use the size to set the length of the array (fix).
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee employee: employeeArray){         // now we have them in an Employee Array instead of the Array List
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        // we get FALSE because we haven't implemented an equals Methods (inside the Employee class -> auto generate it, fill only the last 2 fields)
        // if we don't do that, it just checks if they are the EXACT same instance (this is what the default equal Method (in Object) does).

        // now that we have the equals Method, we can make use of the indexOf Method. This will look up an Employee in the list and tell us his index
        System.out.println(employeeList.indexOf(new Employee("pedro", "dos", 777))); // it will just find an instance with the same fields thanks to the new equals

        System.out.println();

        employeeList.remove(2); // remove can also be expensive
        employeeList.forEach(employee -> System.out.println(employee)); // lamda does what a loop does (same bigO), but you save code lines. toString Method help us also.

    }
}
