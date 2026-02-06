// Counts the number of even and odd elements in an array.

public class CountEvenOddElements {
    public static void main(String[] args) {
        int[] arr = {12, 7, 5, 8, 10, 3};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even elements count = " + evenCount);
        System.out.println("Odd elements count = " + oddCount);
    }
}
