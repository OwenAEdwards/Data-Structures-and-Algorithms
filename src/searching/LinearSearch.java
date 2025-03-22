package searching;

// Time complexities:
// Best case: O(1)
// Worst case: O(n)

// Space complexity:
// O(1)

// Example trace (step-by-step):
// arr = [1, 2, 3, 4, 5], target = 3
// TODO: Complete trace example

// Explanation of algorithm (step-by-step):
// TODO: Complete explanation

// Real-world applications:
// TODO: Complete real-world applications

public class LinearSearch {
  public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        System.out.println("Linear Search, target found at index: " + i + " in " + i + " iterations");
        return i;
      }
    }

    System.out.println("target not found");
    return -1;
  }
}
