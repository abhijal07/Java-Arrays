// Finds the second largest element in an integer array.

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second largest element = " + secondLargest);
    }
}
