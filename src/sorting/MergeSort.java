package sorting;

// Time complexities:
// Best case: O(n log n) - TODO: why/when?
// Worst case: O(n log n) - TODO: why/when?

// Space complexity:
// O(n) - TODO: why?

// Example trace(s) (step-by-step):
// arr = [5, 3, 2, 4, 1]
// TODO: Complete trace example

// Explanation of algorithm (step-by-step):
// TODO: Complete explanation

// Real-world applications:
// TODO: Complete real-world applications

public class MergeSort {
  static int iterations = 0;

  // This mergeSort method is the public method that will be called by the user
  public static int mergeSort(int[] arr) {
    iterations = 0; // Reset the iterations count for new run

    mergeSort(arr, 0, arr.length - 1);

    System.out.println("Merge Sort, iterations: " + iterations);

    return iterations;
  }

  // Polymorphism, create another mergeSort method that takes in left and right indices (actually run the algo recursively)
  private static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
      int middle = left + (right - left) / 2;

      mergeSort(arr, left, middle); // Recursively sort the left half
      mergeSort(arr, middle + 1, right); // Recursively sort the right half

      merge(arr, left, middle, right); // Merge the sorted halves
    }
  }

  private static void merge(int[] arr, int left, int middle, int right) {
    int n1 = middle - left + 1; // n1 is the size of the left half
    int n2 = right - middle; // n2 is the size of the right half

    // Create temporary arrays to store the left and right halves
    int[] leftArr = new int[n1];
    int[] rightArr = new int[n2];

    // Copy the elements from the original array to the temporary arrays
    for (int i = 0; i < n1; i++) {
      leftArr[i] = arr[left + i];
    }

    for (int i = 0; i < n2; i++) {
      rightArr[i] = arr[middle + 1 + i];
    }

    // Merge the temporary arrays back into the original array
    int i = 0, j = 0, k = left;

    while (i < n1 && j < n2) {
      // Compare the elements from the left and right halves and merge them in sorted order
      iterations++;
      if (leftArr[i] <= rightArr[j]) {
        arr[k] = leftArr[i];
        i++;
      } else {
        arr[k] = rightArr[j];
        j++;
      }
      k++;
    }

    // Copy the remaining elements from the left and right halves
    while (i < n1) {
      arr[k] = leftArr[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = rightArr[j];
      j++;
      k++;
    }
  }
}
