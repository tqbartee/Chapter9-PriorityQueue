//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // Tests:
        // 1. Add priority queue elements from book to unsorted queue
        // 2. Do with sorted priority queue. Show they are the same
        // Then do with the Java priority queue methods
        // Issues with this code
        // Need to change from positionallist if to linkedpositionallist
        // Add the nested class from the book


        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        /*


        // Try to add to HeapPriorityQueue
        //DefaultComparator myDefaultComparator = new DefaultComparator();

        // Swap these to go between sorted priority queue
        // and heap priority queue

        //HeapPriorityQueue<Integer, String> myPriorityQueue =
        //        new HeapPriorityQueue(myDefaultComparator);
        //SortedPriorityQueue<Integer, String> myPriorityQueue =
        //        new SortedPriorityQueue(myDefaultComparator);

        // >>> Java Collections Framework PriorityQueue test
        // goes here - check if interfaces close enough to make this work
        //Comparator<Integer, String> keyComparator = Comparator.comparing(pair -> pair.key);
        //PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<>();
        HeapPriorityQueue<Integer,String> myPriorityQueue = new HeapPriorityQueue<>();

        //LinkedPositionalList.Entry<Integer,String> myEntry = myHeapPriorityQueue.createEntry(1, "Bob Sled");
        //myHeapPriorityQueue.insert(1, "Bob Sled");
        LinkedPositionalList.Entry<Integer,String> myEntry;
        myEntry = myPriorityQueue.insert(1, "Bob Sled");
        myEntry = myPriorityQueue.insert(3, "Bill Board");
        Integer myKey = myEntry.getKey();
        String myValue = myEntry.getValue();
        System.out.println(myKey + " " + myValue);
        // Add many elements
        // Try removing first element (highest priority)
        */

    }
}