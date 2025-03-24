package sorting;

// Time complexities:
// Best case: O(n) - TODO: why/when?
// Worst case: O(n^2) - TODO: why/when?

// Space complexity:
// O(1)

// Example trace(s) (step-by-step):
// arr = [5, 3, 2, 4, 1]
// TODO: Complete trace example

// Explanation of algorithm (step-by-step):
// TODO: Complete explanation

// Real-world applications:
// TODO: Complete real-world applications

public class InsertionSort {
  public static int insertionSort(int[] arr) {
    int iterations = 0;

    // Outer loop runs from 1 to arr.length
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i]; // Store the current element as the key to compare
      int j = i - 1;

      // Inner loop runs from i - 1 to 0, while j >= 0 and the current element is greater than the key
      while (j >= 0 && arr[j] > key) {
        iterations++;
        arr[j + 1] = arr[j];
        j--;
      }

      arr[j + 1] = key; // Insert the key into the correct position
    }

    System.out.println("Insertion Sort, iterations: " + iterations);
    return iterations;
  }
}
