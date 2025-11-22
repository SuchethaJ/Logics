package mocks;

public class Sample2 {

    public static void main(String[] args) {
        String str = "I love Programming";
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rev(arr[i]);
            System.out.print(arr[i] + " ");
        }

    }

    public static String rev(String s) {
        String res = "";
        for (int i = s.length() - 1; i >=0; i--) {
            res = res + s.charAt(i);
        }
        return res;
    }
}
