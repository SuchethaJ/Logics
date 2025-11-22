package mocks;

public class Unique {
    public static void main(String[] args) {
        String str="programming";
        char[] arr=str.toCharArray();
        int[] visited=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=1;
            if(visited[i]==1){
                continue;
            }
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[i]=1;
                }
            }
            if(count==1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
