import java.util.Random;

public class LinearSearch {

    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
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

        int key = arr[size / 2];

        long startTime = System.nanoTime();

        int result = linearSearch(arr, key);

        long endTime = System.nanoTime();

        System.out.println("Index found: " + result);
        System.out.println("Execution time (nanoseconds): " + (endTime - startTime));
    }
}
