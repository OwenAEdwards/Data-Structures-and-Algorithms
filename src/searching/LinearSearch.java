package searching;

// Time complexities:
// Best case: O(1)
// Worst case: O(n)

// Space complexity:
// O(1)

// Example trace (step-by-step):
// arr = [1, 2, 3, 4, 5], target = 3
//        ^ 
/*       [1, 2, 3, 4, 5]
 *           ^
 *       [1, 2, 3, 4, 5]
 *              ^
 *              i = 3
 * We found the target value at index 2 in 3 iterations
 */


// Explanation of algorithm (step-by-step):
// A simple algorithm that goes sequentially through the array and determeines if the target value is the value at the current index.
// If it's not then we go to the next index and repeat the process until we find the target value or we reach the end of the array.
// This search method is not great for efficiency especially with large arrays but it is simple and easy to implement.

// Real-world applications:
// 1. Searching for a specific value in an array that is not sorted

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
