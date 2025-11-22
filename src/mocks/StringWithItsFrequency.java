package mocks;

public class StringWithItsFrequency {
    public static void main(String[] args) {
        String str="aabbbcccc";
        char[] arr =str.toCharArray();
        int n = arr.length;
        int[] visited = new int[arr.length];

        for (int i = 0; i < n; i++) {
            if (visited[i]==1)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] =1;
                }
            }

            System.out.print(arr[i] + "" + count );
        }

    }
}
