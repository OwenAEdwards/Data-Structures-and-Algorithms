import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //compareSortingAlgorithms();
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

    public static void compareSortingAlgorithms() {
        int size = 1000;
        int min = 1;
        int max = 10000;
        int[] arr = generateRandomArray(size, min, max);
        System.out.println("Randomized Array: " + java.util.Arrays.toString(arr));

        // Clone the array to compare the sorting algorithms
        int[] arr1 = arr.clone();
        int[] arr2 = arr.clone();
        int[] arr3 = arr.clone();
        int[] arr4 = arr.clone();
        int[] arr5 = arr.clone();

        // Run the sorting algorithms
        sorting.SelectionSort.selectionSort(arr1);
        // System.out.println("Selection Sort, sorted array: " + java.util.Arrays.toString(arr1));
        sorting.InsertionSort.insertionSort(arr2);
        // System.out.println("Insertion Sort, sorted array: " + java.util.Arrays.toString(arr2));
        sorting.BubbleSort.bubbleSort(arr3);
        // System.out.println("Bubble Sort, sorted array: " + java.util.Arrays.toString(arr3));
        sorting.MergeSort.mergeSort(arr4);
        // System.out.println("Merge Sort, sorted array: " + java.util.Arrays.toString(arr4));
        sorting.QuickSort.quickSort(arr5);
        // System.out.println("Quick Sort, sorted array: " + java.util.Arrays.toString(arr5));
    }
}
