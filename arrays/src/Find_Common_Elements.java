/*
Given 3 sorted arrays, find the common elements present in all three.
*/

public class Find_Common_Elements {
    public static void main(String[] args) {
        int arr1[] = {10, 20, 40, 60, 80};
        int arr2[] = {5, 20, 40, 70, 90};
        int arr3[] = {17, 20, 21, 28, 40, 60, 80};

        // Initialize three pointers for each array
        int x = 0, y = 0, z = 0;

        // Traverse all arrays simultaneously
        while (x < arr1.length && y < arr2.length && z < arr3.length) {

            // If elements at all pointers are equal, it's a common element
            if (arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
                System.out.println(arr1[x]); // Print the common element
                x++;
                y++;
                z++;
            }
            // Move the pointer of the array with the smallest element
            else if (arr1[x] < arr2[y]) {
                x++;
            } else if (arr2[y] < arr3[z]) {
                y++;
            } else {
                z++;
            }
        }
    }
}
