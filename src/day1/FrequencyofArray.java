package day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyofArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,2,3,3,4,5,5,6,2};
        int n = arr.length;
//        boolean[] visited = new boolean[n];
//
//        for (int i = 0; i < n; i++) {
//            if (visited[i])
//                continue;
//
//            int count = 1;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                    visited[j] = true;
//                }
//            }
//
//            System.out.println(arr[i] + " occurs " + count + " times");
//        }


        //Using Collections
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        map.forEach((key,value) -> {
                System.out.println(key+" "+value);
        });

    }
}
