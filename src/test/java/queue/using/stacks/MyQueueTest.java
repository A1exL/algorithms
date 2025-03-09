package queue.using.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    void myQueueTest() {
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        q.push(3);
        assertEquals(1, q.pop());
        q.push(4);
        q.push(5);
        assertEquals(2, q.peek());
        assertEquals(2, q.pop());
        assertFalse(q.empty());
        assertEquals(3, q.pop());
        assertEquals(4, q.pop());
        assertEquals(5, q.pop());
        assertTrue(q.empty());
    }
}