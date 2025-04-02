import java.util.*;
import java.io.*;

public class arrays
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array: " );
		int size = sc.nextInt();
		//System.out.println("Entered Size of the array is: "+size);
		//System.out.println(size);
		System.out.println("Please Enter the Arrays: ");

		int [] array = new int[size]; // to decleare the array is the size of the array
		for(int i=0; i<=size-1; i++) {

			array[i] = sc.nextInt();

		}
		System.out.print("Entered Arrays are: ");
		for(int i=0; i<=size-1; i++) {
			System.out.print(array[i]+" ");
		}

	}
}