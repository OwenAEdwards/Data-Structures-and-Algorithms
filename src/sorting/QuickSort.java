package sorting;

// Time complexities:
// Best case: O(n log n) - TODO: why/when?
// Worst case: O(n^2) - TODO: why/when?

// Space complexity:
// O(log n) - TODO: why?

// Example trace(s) (step-by-step):
// arr = [5, 3, 2, 4, 1]
// TODO: Complete trace example

// Explanation of algorithm (step-by-step):
// TODO: Complete explanation

// Real-world applications:
// TODO: Complete real-world applications

public class QuickSort {
  static int iterations = 0;

  public static int quickSort(int[] arr) {
    iterations = 0; // Reset the iterations count for new run

    quickSort(arr, 0, arr.length - 1);

    System.out.println("Quick Sort, iterations: " + iterations);

    return iterations;
  }

  private static void quickSort(int[] arr, int low, int high) {
    // If low is less than high, there are at least two elements in the array
    if (low < high) {
      iterations++;

      int partionIndex = partition(arr, low, high); // Partitioning index, arr[partionIndex] is now at the right place

      quickSort(arr, low, partionIndex - 1); // Recursively sort elements before partition
    }
  }

  private static int partition(int[] arr, int low, int high) {
    // Select the pivot element
    int pivot = arr[high];
    int i = low - 1;

    // Move all elements smaller than the pivot to the left
    for (int j = low; j < high; j++) {
      iterations++;
      if (arr[j] < pivot) {
        i++;
        SortingUtils.swap(arr, i, j);
      }
    }

    // Move the pivot element to its correct position
    SortingUtils.swap(arr, i + 1, high);
    return i + 1;
  }
}
