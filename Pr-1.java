import java.util.Random;

public class SelectionSortPerformance {

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int size = 10000;
        int[] arr = new int[size];

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000);
        }

        long startTime = System.nanoTime();

        selectionSort(arr);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Array size: " + size);
        System.out.println("Execution time (nanoseconds): " + duration);
        System.out.println("Execution time (milliseconds): " + duration / 1_000_000);
    }
}
