import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int size = 10000;
        int[] arr = new int[size];

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000);
        }

        Arrays.sort(arr);

        int key = arr[size / 2];

        long startTime = System.nanoTime();

        int result = binarySearch(arr, key);

        long endTime = System.nanoTime();

        System.out.println("Index found: " + result);
        System.out.println("Execution time (nanoseconds): " + (endTime - startTime));
    }
}
