// Finds maximum difference between any two elements in array.

public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 5, 1};

        int maxDiff = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = arr[j] - arr[i];
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }

        System.out.println("Maximum difference = " + maxDiff);
    }
}