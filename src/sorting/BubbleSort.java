package sorting;

// Time complexities:
// Best case: O(n) - the array is already sorted so it only needs one pass
// Worst case: O(n^2) - the array is sorted in reverse so it has to move all the elements in the array

// Space complexity:
// O(1)

// Example trace(s) (step-by-step):
// arr = [5, 3, 2, 4, 1]
//        ^
//       [3, 5, 2, 4, 1]
//           ^
//       [2, 3, 5, 4, 1]
//              ^
//       [2, 3, 4, 5, 1]
//                 ^
//       [2, 3, 4, 1, 5]
//                    ^
//       [2, 3, 4, 1, 5]
//                 ^
//       [2, 3, 1, 4, 5]
//              ^      
//       [2, 1, 3, 4, 5]
//           ^         
//       [1, 2, 3, 4, 5]


// Explanation of algorithm (step-by-step):
// 1. Starts with the first element of the array and compares it to the next element
// 2. If the first is greater, than it will swap the two
// 3. It will repeat this until the end, so the largest element is at the end
// 4. It does this again for the rest of the array, and ignores the last element
// 5. It should then repeat until sorted.

// Real-world applications:
// Simple sorting for lists that are in a relative order already.
// Simple but not very efficient for large lists.
// It is a good example of a sorting algorithm that is easy to understand and implement.

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
