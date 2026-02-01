// Demonstrates taking array input from the user and displaying the elements.

import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of array elements:");
        int num = sc.nextInt();
        sc.nextLine(); // consume newline

        int[] arr = new int[num];   // array creation

        System.out.println("Enter the array elements in one line:");
        String[] input = sc.nextLine().split(",");

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
