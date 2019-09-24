package FFHS;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee t = new Employee("Theo", "Doe", 3245);


        Map<String, Employee> hashMap = new HashMap<>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);
//        hashMap.put("Doe", t);            // replaces the original
        Employee employee = hashMap.put("Doe", t);      // Theo replaces takes the place of the old Doe
        System.out.println(employee);                   // old John Doe is here

        System.out.println(hashMap.get("Smith"));


/*        Iterator<Employee> iterator = hashMap.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        System.out.println(hashMap.containsKey("Doe"));         // O(1)
        System.out.println(hashMap.containsValue(janeJones));   // O(n)

        hashMap.forEach((k, v) -> System.out.println("Key = " + k + " | Employee = " + v));

    }
}
