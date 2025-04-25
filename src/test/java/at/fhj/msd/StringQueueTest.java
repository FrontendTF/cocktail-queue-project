package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for StringQueue functionality.
 */
public class StringQueueTest {

    private StringQueue queue;

    /**
     * Set up a queue before each test.
     */
    @BeforeEach
    public void setUp() {
        queue = new StringQueue(3); 
    }

     /**
     * Tests successful adding of elements.
     */
    @Test
    public void testOfferSuccess() {
        assertTrue(queue.offer("A"));
        assertTrue(queue.offer("B"));
        assertEquals("A", queue.peek()); 
    }

     /**
     * Tests adding when queue is full.
     */
    @Test
    public void testOfferWhenFull() {
        queue.offer("A");
        queue.offer("B");
        queue.offer("C"); 
        assertFalse(queue.offer("D")); 
        assertEquals("A", queue.peek()); 
    }

    /**
     * Tests polling elements in order.
     */
    @Test
    public void testPollNormal() {
        queue.offer("A");
        queue.offer("B");
        assertEquals("A", queue.poll()); 
        assertEquals("B", queue.peek()); 
    }

     /**
     * Tests polling from empty queue.
     */
    @Test
    public void testPollEmptyQueue() {
        assertNull(queue.poll()); // Should return null for empty queue
    }

     /**
     * Tests removing an existing element.
     */
    @Test
    public void testRemoveNormal() {
        queue.offer("A");
        assertEquals("A", queue.remove()); 
        assertNull(queue.peek()); 
    }

    /**
     * Tests remove with empty queue.
     */
    @Test
    public void testRemoveEmptyQueue() {
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    /**
     * Tests peeking elements.
     */
    @Test
    public void testPeekNormal() {
        queue.offer("A");
        assertEquals("A", queue.peek()); 
        assertEquals("A", queue.peek()); 
    }

    /**
     * Tests peek on empty queue.
     */
    @Test
    public void testPeekEmptyQueue() {
        assertNull(queue.peek()); 
    }

    /**
    * Tests element when present.
    */ 
    @Test
    public void testElementNormal() {
        queue.offer("A");
        assertEquals("A", queue.element()); 
    }

    /**
     * Tests element with empty queue.
     */
    @Test
    public void testElementEmptyQueue() {
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }
}