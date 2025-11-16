package DSA;

import java.util.LinkedList;

public class MergeSortedLists {

    // Method to merge two sorted LinkedLists
    public static LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> merged = new LinkedList<>();
        int i = 0, j = 0;
        // Merge while both lists have elements
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }
        // Add remaining elements of list1
        while (i < list1.size()) {
            merged.add(list1.get(i));
            i++;
        }
        // Add remaining elements of list2
        while (j < list2.size()) {
            merged.add(list2.get(j));
            j++;
        }

        return merged;
    }
    public static void main(String[] args) {

        // First sorted list using .add()
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        // Second sorted list using .add()
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        LinkedList<Integer> mergedList = merge(list1, list2);

        System.out.println("Merged Sorted List: " + mergedList);
    }
}
