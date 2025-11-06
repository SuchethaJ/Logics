package Day4;

public class ReverseWord {
    public static void main(String[] args) {
        String str="hello welcome to tek pyramid";
        String[] arr=str.split(" ");

        int i=0;
        int j= arr.length-1;

        while(i<j){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }

    }
}
