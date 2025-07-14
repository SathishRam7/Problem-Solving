/*
Given an array, find the element(s) that appear only once.
Assumes the array is sorted and duplicates appear consecutively.
*/

public class Find_Element_Appears_Once {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 4, 4, 4};

        // Loop through array in steps of 2 to compare pairs
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                System.out.println(arr[i]); // Print element that doesn't have a duplicate
                i--; // Step back one index to re-check the next unpaired element
            }
        }
    }
}
