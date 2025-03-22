import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        compareSearchingAlgorithms();
        }

        public static int[] generateRandomArray(int size, int min, int max) {
        java.util.Random random = new java.util.Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
        }

        public static void compareSearchingAlgorithms() {
        int size = 1000;
        int min = 1;
        int max = 10000;
        int[] arr = generateRandomArray(size, min, max);
        Arrays.sort(arr); // Sort the array for binary search to work
        System.out.println("Randomized Array: " + java.util.Arrays.toString(arr));
        
        // Generate a random target value to search for
        java.util.Random random = new java.util.Random();
        int target = arr[random.nextInt(arr.length)];
        System.out.println("Target: " + target);

        // Run the searching algorithms
        searching.BinarySearch.binarySearch(arr, target);
        searching.LinearSearch.linearSearch(arr, target);
    }
}
