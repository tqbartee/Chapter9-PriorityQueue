import org.desu.utilities.UtilityMethodsBinaryTreeBook;
import org.desu.answermap.AnswerMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.PriorityQueue;

class PriorityQueueTest {

    // Part 1
    @Test
    void test1() {
        PQJavaTestV1 ourPQTest = new PQJavaTestV1();
        PriorityQueue pq = ourPQTest.pq;
        String outputString = Arrays.toString(pq.toArray());
        Assertions.assertEquals(outputString, "[Key: 9, Value: C]");
    }

    // Part 2
    @Test
    void test2() {
        PQJavaTestV2 ourPQTest = new PQJavaTestV2();
        LoggingPriorityQueue pq = ourPQTest.pq;
        String outputString = pq.getLog();
        // Remove trailing return
        if (outputString.endsWith("\n")) {
            outputString = outputString.substring(0, outputString.length() - 1);
        }
        AnswerMap ourAnswerMap = new AnswerMap();
        String answer1 = ourAnswerMap.map.get("Answer1");
        Assertions.assertEquals(answer1, outputString);
    }
}
