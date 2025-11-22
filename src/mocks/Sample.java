package mocks;

public class Sample {

        public static void main(String[] args){
            int[] arr={8,5,6,3,2};
            int max=0;
            int min=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max)
                max=arr[i];
                else if(arr[i]<min)
                min=arr[i];
            }
            System.out.println("Max value is"+max);
                    System.out.println("Min value is"+min);
        }
}
