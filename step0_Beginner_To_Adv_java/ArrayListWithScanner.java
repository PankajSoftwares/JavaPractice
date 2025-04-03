import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. ArrayList of Integers
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt(); // Taking number of elements

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            intList.add(scanner.nextInt()); // Taking integer input
        }

        System.out.println("Integer List: " + intList);

        // Modifying an element
        System.out.print("Enter index to modify (0 to " + (n - 1) + "): ");
        int index = scanner.nextInt();
        System.out.print("Enter new value: ");
        int newValue = scanner.nextInt();
        intList.set(index, newValue);

        System.out.println("Updated Integer List: " + intList);

        // Removing an element
        System.out.print("Enter index to remove (0 to " + (intList.size() - 1) + "): ");
        int removeIndex = scanner.nextInt();
        intList.remove(removeIndex);

        System.out.println("List after removal: " + intList);

        // Checking for an element
        System.out.print("Enter a number to check if it exists in the list: ");
        int checkNum = scanner.nextInt();
        System.out.println("Contains " + checkNum + "? " + intList.contains(checkNum));

        // Iterating over the list using for-each loop
        System.out.print("List elements: ");
        for (int num : intList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 2. ArrayList of Strings
        ArrayList<String> strList = new ArrayList<>();
        System.out.print("Enter number of strings: ");
        int strCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter " + strCount + " strings:");
        for (int i = 0; i < strCount; i++) {
            strList.add(scanner.nextLine()); // Taking string input
        }

        System.out.println("String List: " + strList);

        // Removing a string by value
        System.out.print("Enter a string to remove: ");
        String removeStr = scanner.nextLine();
        strList.remove(removeStr);

        System.out.println("Updated String List: " + strList);

        // 3. ArrayList of Doubles
        ArrayList<Double> doubleList = new ArrayList<>();
        System.out.print("Enter number of double values: ");
        int doubleCount = scanner.nextInt();

        System.out.println("Enter " + doubleCount + " double values:");
        for (int i = 0; i < doubleCount; i++) {
            doubleList.add(scanner.nextDouble());
        }

        System.out.println("Double List: " + doubleList);

        // Clearing all lists
        System.out.println("Clearing all lists...");
        intList.clear();
        strList.clear();
        doubleList.clear();

        System.out.println("All lists are now empty.");

        scanner.close();
    }
}
