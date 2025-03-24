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

public class BubbleSort {
  public static int bubbleSort(int[] arr) {
    int iterations = 0;

    // Outer loop runs from 0 to arr.length - 1
    for (int i = 0; i < arr.length - 1; i++) {
      // Inner loop runs from 0 to arr.length - i - 1
      for (int j = 0; j < arr.length - i - 1; j++) {
        iterations++;
        // Swap if the current element is greater than the next element
        if (arr[j] > arr[j + 1]) {
          SortingUtils.swap(arr, j, j + 1);
        }
      }
    }

    System.out.println("Bubble Sort, iterations: " + iterations);
    return iterations;
  }
}
