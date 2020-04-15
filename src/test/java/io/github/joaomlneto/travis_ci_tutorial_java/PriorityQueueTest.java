package main.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.ArrayList;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueTest {

    static PriorityQueue<Integer> q1 = new PriorityQueue();
    static PriorityQueue<Integer> q2 = new PriorityQueue();
    static PriorityQueue<Integer> q3 = new PriorityQueue();
    static PriorityQueue<Integer> q4 = new PriorityQueue();
    static PriorityQueue<Integer> q5 = new PriorityQueue();

    static int[] t1 = {5,   1,    77,  45, -100};
    static int[] t2 = {-25, 1,    86,  17, -27,   22};
    static int[] t3 = {0,   0,    58,  84, -1,    4,   -26};
    static int[] t4 = {30,  -638, 888, 397, 147,  -78,  95, -386};
    static int[] t5 = {-7,   628, 261, 667, -316, 110, -626, 258,  46};

    @org.junit.jupiter.api.BeforeAll
    static void init() {
        for(int t : t1) { q1.add(t); }
        for(int t : t2) { q2.add(t); }
        for(int t : t3) { q3.add(t); }
        for(int t : t4) { q4.add(t); }
        for(int t : t5) { q5.add(t); }
    }

    @DisplayName("Exception 1")
    @org.junit.jupiter.api.Test
    void TestExpectedException() {
        System.out.println("Test_excp_1");
        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("One");
        });
    }

    @DisplayName("Testcase 1")
    @ParameterizedTest
    @ValueSource(ints = {-100, 1, 5, 145, 77}) // <- The correct ordered array.
    void test_pq_1 (int arg) {
        System.out.println("Test1");
        int q = q1.poll();
        assertEquals(q, arg);
    }

    @DisplayName("Testcase 2")
    @ParameterizedTest
    @ValueSource(ints = {-27, -25, 1, 17, 22, 86})
    void test_pq_2 (int arg) {
        System.out.println("Test2");
        int q = q2.poll();
        assertEquals(q, arg);
    }

    @DisplayName("Exception 2")
    @org.junit.jupiter.api.Test
    void TestExpectedException_2 () {
        String s = null;
        assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt(s);
        });
    }

    @DisplayName("Testcase 3")
    @ParameterizedTest
    @ValueSource(ints = {-26, -1, 0, 0, 4, 58, 84})
    void test_pq_3 (int arg) {
        System.out.println("Test3");
        int q = q3.poll();
        assertEquals(q, arg);
    }

    @DisplayName("Testcase 4")
    @ParameterizedTest
    @ValueSource(ints = {-638, -386, -78, 30, 95, 147, 397, 888})
    void test_pq_4 (int arg) {
        System.out.println("Test4");
        int q = q4.poll();
        assertEquals(q, arg);
    }

    @DisplayName("Testcase 5")
    @ParameterizedTest
    @ValueSource(ints = {-626, -316, -7, 46, 110, 258, 261, 628, 667})
    void test_pq_5 (int arg) {
        System.out.println("Test5");
        int q = q5.poll();
        assertEquals(q, arg);
    }

    @DisplayName("Exception 3")
    @org.junit.jupiter.api.Test
    void TestExpectedException_3 () {
        String s2 = null;
        assertThrows(IllegalArgumentException.class, () -> {
            Integer.valueOf(s2);
        });
    }

    /*
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void iterator() {
    }

    @org.junit.jupiter.api.Test
    void size() {
    }

    @org.junit.jupiter.api.Test
    void clear() {
    }

    @org.junit.jupiter.api.Test
    void offer() {
    }

    @org.junit.jupiter.api.Test
    void poll() {
    }

    @org.junit.jupiter.api.Test
    void peek() {
    }

    @org.junit.jupiter.api.Test
    void comparator() {
    }

    @org.junit.jupiter.api.Test
    void remove() {
    }

    @org.junit.jupiter.api.Test
    void add() {
    }
    */
}