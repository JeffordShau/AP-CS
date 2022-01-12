import java.util.ArrayList;

public class Driver {
    public static ArrayList<Comparable> arrayMaker (int size) {
        ArrayList<Comparable> test = new ArrayList<Comparable>();
        for (int i = 0; i < size; i++) {
            test.add((int)(Math.random()*100));
        }
        return test;
    }

    public static void main(String[] args) {
        // test each kind of sort function on an arraylist of test numbers
        ArrayList<Comparable> test = new ArrayList<Comparable>();
        ArrayList<Comparable> best = new ArrayList<Comparable>();
        ArrayList<Comparable> worst = new ArrayList<Comparable>();

        // test bubble sort
        System.out.println("Bubble Sort");
        test = arrayMaker(10);
        System.out.println("Random Case:");
        System.out.println("Before: " + test);
        test = Sorts.bubbleSort(test);
        System.out.println("After: " + test);
        test.clear();

        // best case bubble sort
        System.out.println("Best Case:");
        best.add(1);
        best.add(3);
        best.add(5);
        best.add(7);
        best.add(12);
        System.out.println("Before: " + best);
        best = Sorts.bubbleSort(best);
        System.out.println("After: " + best);
        best.clear();

        // worst case bubble sort
        System.out.println("Worst Case:");
        worst.add(3);
        worst.add(12);
        worst.add(7);
        worst.add(5);
        worst.add(1);
        System.out.println("Before: " + worst);
        worst = Sorts.bubbleSort(worst);
        System.out.println("After: " + worst);
        worst.clear();

        // test selection sort
        System.out.println("\nSelection Sort");
        test = arrayMaker(10);
        System.out.println("Random Case: ");
        System.out.println("Before: " + test);
        test = Sorts.selectionSort(test);
        System.out.println("After: " + test);
        test.clear();

        // best case selection sort
        System.out.println("Best Case:");
        best.add(1);
        best.add(3);
        best.add(5);
        best.add(7);
        best.add(12);
        System.out.println("Before: " + best);
        best = Sorts.selectionSort(best);
        System.out.println("After: " + best);
        best.clear();

        // worst case selection sort
        System.out.println("Worst Case:");
        worst.add(12);
        worst.add(7);
        worst.add(5);
        worst.add(3);
        worst.add(1);
        System.out.println("Before: " + worst);
        worst = Sorts.selectionSort(worst);
        System.out.println("After: " + worst);
        worst.clear();

        // test insertion sort
        System.out.println("\nInsertion Sort");
        test = arrayMaker(10);
        System.out.println("Random Case: ");
        System.out.println("Before: " + test);
        test = Sorts.insertionSort(test);
        System.out.println("After: " + test);
        test.clear();

        // best case insertion sort
        System.out.println("Best Case:");
        best.add(1);
        best.add(3);
        best.add(5);
        best.add(7);
        best.add(12);
        System.out.println("Before: " + best);
        best = Sorts.insertionSort(best);
        System.out.println("After: " + best);
        best.clear();

        // worst case insertion sort
        System.out.println("Worst Case:");
        worst.add(12);
        worst.add(7);
        worst.add(5);
        worst.add(3);
        worst.add(1);
        System.out.println("Before: " + worst);
        worst = Sorts.insertionSort(worst);
        System.out.println("After: " + worst);
        worst.clear();
    }
}
