package day1;

public class RightRotateByTwo {
    public static void main(String[] args) {
        // Input array directly in the program
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int positions = 2; // rotate by 2 positions

        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Right rotation logic
        for (int i = 0; i < positions; i++) {
            int last = arr[n - 1]; // store last element
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1]; // shift elements right
            }
            arr[0] = last; // move last element to first
        }

        System.out.println("\nArray after right rotation by 2 positions:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
