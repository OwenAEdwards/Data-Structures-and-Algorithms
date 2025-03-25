package searching;

// Time complexities:
// Best case: O(1)
// Worst case: O(log n) - divide-and-conquer algorithm

// Space complexity:
// O(1)

// Example trace(s) (step-by-step):
// arr = [1, 2, 3, 4, 5], target = 3
/*
 *  [1,2,3,4,5]
 *   ^   ^   ^
 *  LB   MP  UB
 *  
 * We found the target value as MP so we are done.
 */ 

// Explanation of algorithm (step-by-step):
/*
 * So to start out set the LB (lower bound) and UB (upper bound) as the first and last values in the array.
 * Next we want to set the MP (midpoint), which is LB + UB / 2. 
 * Next we compare the MP with the target value, if it is the same we are done we found the value. 
 * If not, we compare, is it lower? then cut off the MP and any values above it. Or if its higher, do the same but cut off the MP and any values above it.
 * Repeat the process of 1 and 2 where we define the LB and UB and calc the MP. Repeat the above process until the MP = Target Value
 */

// Real-world applications:
/*
 * 1. array searching (in sorted arrays mostly)
 * 2. Database queries
 * 3. Other types of searching for a specific number
 * 4. Finding the square root apparently 
 */

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
