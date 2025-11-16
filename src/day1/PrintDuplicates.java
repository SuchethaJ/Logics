package day1;

public class PrintDuplicates {

        public static void main(String[] args) {
            int[] arr = {1,1,2,3,3,3,4,5,5,6,4,7};
            int n = arr.length;
            int[] visited = new int[arr.length];

            System.out.println("Duplicate elements in the array:");

            for (int i = 0; i < n; i++) {
                if (visited[i]==1) continue;

                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = 1;
                    }
                }

                if (count > 1) {
                    System.out.println(arr[i]);  // print only duplicates
                }
            }
        }
    }



