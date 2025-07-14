/*
Given a sorted array with repeated elements, find the first and last index of a target element.
*/

public class Find_First_And_Last_Index {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 3, 3, 3, 4, 4};
        int tar = 3; // target element to find
        int firstI = -1, lastI = -1;

        // Traverse the array to find the first and last occurrence
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar && firstI == -1) {
                firstI = i;
            }
            if (arr[i] == tar) {
                lastI = i;
            }
        }

        System.out.println(firstI + " " + lastI);
    }
}
