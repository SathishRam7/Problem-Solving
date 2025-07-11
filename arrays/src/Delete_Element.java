/**
 * Problem: Delete Element from an Array at a Given Position
 *
 * Given an integer array and a position, delete the element at that position
 * and shift the remaining elements to maintain the array's order.
 *
 * Note: The array size is fixed, so we simulate deletion by shifting elements
 * and reducing the logical size (n).
 *
 * Example:
 * Input: arr = [1, 25, 2, 3, 4, 5], pos = 2
 * Output: [1, 2, 3, 4, 5]
 * Explanation: Element at position 2 (25) is removed.
 */

import java.util.Arrays;

public class Delete_Element {
    public static void main(String[] args) {
        // Sample array
        int[] arr = {1, 25, 2, 3, 4, 5};

        // Position to delete (1-based index)
        int pos = 2;

        // Current logical size of the array
        int n = arr.length;

        // Shift elements to the left starting from (pos - 1)
        for (int i = pos - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Decrease the logical size of the array by 1
        n--;

        // Print the updated array (excluding the last element)
        System.out.print("Array after deletion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
