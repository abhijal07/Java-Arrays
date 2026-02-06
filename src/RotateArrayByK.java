// Rotates an array to the right by k positions.

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int n = arr.length;
        k = k % n; // handle k > n

        int[] rotated = new int[n];
        int index = 0;

        // Add last k elements
        for (int i = n - k; i < n; i++) {
            rotated[index++] = arr[i];
        }

        // Add remaining elements
        for (int i = 0; i < n - k; i++) {
            rotated[index++] = arr[i];
        }

        System.out.print("Rotated array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }
}
