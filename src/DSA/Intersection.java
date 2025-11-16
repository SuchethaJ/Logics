package DSA;

import java.util.LinkedList;

public class Intersection {

    public static LinkedList<Integer> findIntersection(
            LinkedList<Integer> a,
            LinkedList<Integer> b) {

        LinkedList<Integer> inter = new LinkedList<>();

        for (int x : a) {
            if (b.contains(x)) {
                inter.add(x);
            }
        }

        return inter;
    }

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(8);

        LinkedList<Integer> inter = findIntersection(list1, list2);

        System.out.println("Intersection: " + inter);
    }
}

