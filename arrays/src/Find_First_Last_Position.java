/*
Here given an array and element k in sorted order you have to find the first and last position of the element if not
present return -1
 */


public class Find_First_Last_Position {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5};
        int t = 3;
        int ls = leftbs(arr, t);
        int rs = rightbs(arr, t);

        System.out.println(ls + " " + rs);
    }

    public static int leftbs(int arr[], int t) {
        int s = 0;
        int index = -1;
        int e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] == t) {
                index = m;
                e = m - 1;
            } else if (t < arr[m]) {
                e = m - 1;
            } else {
                s = m + 1;
            }


        }
        return index;

    }

    public static int rightbs(int arr[], int t) {
        int s = 0;
        int index = -1;
        int e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] == t) {
                index = m;
                s = m + 1;
            } else if (t < arr[m]) {
                e = m - 1;
            } else {
                s = m + 1;
            }


        }
        return index;

    }
}