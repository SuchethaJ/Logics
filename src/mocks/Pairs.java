package mocks;

public class Pairs {
    public static void main(String[] args) {
        int[] arr= {2, 3, 4, 5, 6};
        int product=1;
        int sum=0;
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                product=arr[i]*arr[j];
                if(product%2==0)
                    System.out.println("even when product: "+arr[i]+" "+arr[j]);
                sum=arr[i]+arr[j];
                if(sum%2!=0)
                    System.out.println("odd when sum"+arr[i]+" "+arr[j]);

            }
        }

    }
}
