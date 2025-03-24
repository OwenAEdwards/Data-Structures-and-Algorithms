package searching;

// Time complexities:
// Best case: O(1)
// Worst case: O(log n) - divide-and-conquer algorithm

// Space complexity:
// O(1)

// Example trace(s) (step-by-step):
// arr = [1, 2, 3, 4, 5], target = 3
// TODO: Complete trace example

// Explanation of algorithm (step-by-step):
// TODO: Complete explanation

// Real-world applications:
// TODO: Complete real-world applications

// Other variations:
// A recursive version of binary search can be implemented which has the same time complexity but a space complexity of O(log n) due to the recursive calls

public class BinarySearch {
  public static int binarySearch(int[] arr, int target) {
    int i = 0;
    int left = 0;
    int right = arr.length - 1;
    // System.out.println("initial left: " + left);
    // System.out.println("initial right: " + right);

    while (left <= right) {
      i++;
      int mid = left + (right - left) / 2;
      // System.out.println("new mid: " + mid);

      if (arr[mid] == target) {
        System.out.println("Binary Search, target found at index: " + mid + " in " + i + " iterations");
        return mid;
      }

      if (arr[mid] < target) {
        left = mid + 1;
        // System.out.println("new left: " + left);
      } else {
        right = mid - 1;
        // System.out.println("new right: " + right);
      }
    }

    System.out.println("target not found");
    return -1;
  }
}
