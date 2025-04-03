import java.util.*;    // importing the ArrayList class from the java.util package

public class ArrayListExample { // class name is ArrayListExample
    public static void main(String[] args) { // main method is the entry point of the program

    ArrayList<String> list = new ArrayList<>(); // creating an arraylist of strings
    Scanner sc = new Scanner(System.in);  // creating a scanner object to take input from the user
    System.out.println("Enter the size of the arraylist: "); // printing the message to the user for the size entry
    int n=sc.nextInt();    // taking the size of the arraylist from the user
    System.out.println("Enter the elements of the arraylist: "); // printing the message to the user for the elements entry

    for(int i=0;i<n;i++){   // for loop to take input from the user
        String s=sc.next(); // taking the string input from the user
        list.add(s);        // adding the string to the arraylist
    }
    System.out.println();       // printing the elements of the arraylist in a new line
    //System.out.print(String.format("List of %d Elements: ", n)); // Using String.format() to tell the number of elements in the arraylist
    // for(int i=0;i<n;i++){    //for loop to print the elements of the arraylist
    //     System.out.print(list.get(i)+" ");  // printing the elements of the arraylist
    // }

    System.out.println("List of "+n+" Elements: " + list); // printing the elements of the arraylist using the toString() method

    
    System.out.println();       // printing the elements of the arraylist in a new line
}
}











// System.out.print("[");  // Opening bracket line 22

    // for (int i = 0; i < n; i++) {
    //     System.out.print(list.get(i));  
    //     if (i < n - 1) {
    //         System.out.print(", ");  // Add a comma after each element except the last
    //     }
    // }

    // System.out.println("]");  // Closing bracket













// public class ArrayListExample {
//     public static void main(String[] args) {
//     ArrayList<String> list = new ArrayList<>();
//                                                     // Add elements to the ArrayList
//     list.add("Apple");
//     list.add("Banana");
//     list.add("Cherry");
//                                                           // Print the ArrayList
//     System.out.println("ArrayList: " + list);

//                                                           // Access an element from the ArrayList
//     String firstElement = list.get(0);
//     System.out.println("First element: " + firstElement);
//                                                          // Remove an element from the ArrayList
//     list.remove("Banana");
//     System.out.println("After removing Banana: " + list);
//                                                          // Get the size of the ArrayList
//     int size = list.size();
//     System.out.println("Size of the ArrayList: " + size);
//                                                              // Check if the ArrayList contains an element
//     boolean containsCherry = list.contains("Cherry");
//     System.out.println("Contains Cherry: " + containsCherry);
//                                                             // Iterate through the ArrayList
//     System.out.println("Iterating through the ArrayList:");
//     for (String fruit : list) {
//         System.out.println(fruit);
//     }
//                                                             // Clear the ArrayList
//     list.clear();
//     System.out.println("After clearing, size of the ArrayList: " + list.size());
//     }
// }