import java.util.Arrays;
import java.util.PriorityQueue;

public class PQJavaTestV1 {
    PriorityQueue<KVStringPair> pq = new PriorityQueue<>();

    public PQJavaTestV1() {
        // TODO: put in the Java-based priority queue operations
        // using book Example 9.1.1
        // Declare the priority queue object as pq
        // Make it a queue of KVStringPair
        KVStringPair ourKVStringPair;
        // Define priority queue operations
        // Put code here
    }

    public static void main(String[] args) {
        PQJavaTestV1 ourPQTest = new PQJavaTestV1();
        // Now print the final pq
        System.out.println("Final PQ is: " + Arrays.toString(ourPQTest.pq.toArray()));
    }
}
