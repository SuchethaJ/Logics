package DSA;

import java.util.LinkedList;

public class MiddleElement {

    public static int findMiddle(LinkedList<Integer> list) {

        int slow = 0;
        int fast = 0;

        while (fast < list.size() - 1) {
            slow++;
            fast += 2;
        }

        return list.get(slow);
    }

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int middle = findMiddle(list);

        System.out.println("Middle Element: " + middle);
    }
}

