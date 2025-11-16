//Java Program to Print the Duplicate Words in a String
package Day4;

public class Duplicates {
    public static void main(String[] args) {
        String str="hello hi hi people how are you people";
        String[] arr=str.split(" ");

        for (int i=0;i<arr.length;i++){
            int count=1;
             for(int j=i+1;j<arr.length;j++){
                 if(arr[i].equals(arr[j])){
                     count++;
                 }
             }
             if (count>1){
                 System.out.print(arr[i]+" ");
             }
        }

    }
}
