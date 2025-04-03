import java.util.ArrayList;
import java.util.List;

public class ArrayListExplanations {
    public static void main(String[] args) {
        // 1. Creating an ArrayList of Integers
        List<Integer> intList = new ArrayList<>();
        
        // Adding elements to the list
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(50);
        
        System.out.println("Integer List: " + intList); // [10, 20, 30, 40, 50]

        // Getting an element at index 2
        System.out.println("Element at index 2: " + intList.get(2)); // 30

        // Setting (updating) an element at index 1
        intList.set(1, 25); 
        System.out.println("Updated List after set(1, 25): " + intList); // [10, 25, 30, 40, 50]

        // Removing an element by index
        intList.remove(3); 
        System.out.println("After removing element at index 3: " + intList); // [10, 25, 30, 50]

        // Checking if an element exists
        System.out.println("Contains 30? " + intList.contains(30)); // true
        System.out.println("Contains 40? " + intList.contains(40)); // false

        // Iterating using for-each loop
        System.out.print("Using for-each loop: ");
        for (Integer num : intList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Iterating using traditional for loop
        System.out.print("Using for loop: ");
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " ");
        }
        System.out.println();

        // Clearing the list
        intList.clear();
        System.out.println("After clearing: " + intList); // []

        // 2. Creating an ArrayList of Strings
        List<String> strList = new ArrayList<>();

        // Adding elements
        strList.add("Apple");
        strList.add("Banana");
        strList.add("Cherry");

        System.out.println("String List: " + strList); // [Apple, Banana, Cherry]

        // Using contains method
        System.out.println("Contains 'Banana'? " + strList.contains("Banana")); // true

        // Removing an element by value
        strList.remove("Banana");
        System.out.println("After removing 'Banana': " + strList); // [Apple, Cherry]

        // Converting List to Array
        String[] strArray = strList.toArray(new String[0]);
        System.out.println("Array from List: ");
        for (String s : strArray) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 3. Using Wrapper Class (Double)
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.5);
        doubleList.add(2.8);
        doubleList.add(3.14);

        System.out.println("Double List: " + doubleList); // [1.5, 2.8, 3.14]

        // 4. Checking if List is Empty
        System.out.println("Is intList empty? " + intList.isEmpty()); // true
        System.out.println("Is strList empty? " + strList.isEmpty()); // false

        // 5. Creating a List with Initial Capacity
        List<Integer> preSizedList = new ArrayList<>(20); // Capacity of 20 (not fixed, resizes automatically)
        preSizedList.add(100);
        preSizedList.add(200);
        System.out.println("Pre-sized List: " + preSizedList); // [100, 200]
    }
}
