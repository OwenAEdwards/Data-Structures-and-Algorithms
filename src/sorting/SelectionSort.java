package sorting;

// Time complexities:
// Best case: O(n^2) - TODO: why/when?
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

public class SelectionSort {
  public static int selectionSort(int[] arr) {
    int iterations = 0;

    // Outer loop runs from 0 to arr.length - 1
    for (int i = 0; i < arr.length - 1; i++) {
      int minIndex = i;

      // Inner loop runs from i + 1 to arr.length
      for (int j = i + 1; j < arr.length; j++) {
        iterations++;
        // Update the minIndex if the current element is less than the element at minIndex
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }

      // Swap the current element with the element at minIndex
      SortingUtils.swap(arr, i, minIndex);
    }

    System.out.println("Selection Sort, iterations: " + iterations);
    return iterations;
  }
}
