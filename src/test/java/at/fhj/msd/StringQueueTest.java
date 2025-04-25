package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class StringQueueTest {

    private StringQueue queue;

    @BeforeEach
    public void setUp() {
        queue = new StringQueue(3); // Max size of 3 for testing
    }

    @Test
    public void testOfferSuccess() {
        assertTrue(queue.offer("A"));
        assertTrue(queue.offer("B"));
        assertEquals("A", queue.peek()); // Check first element
    }

    @Test
    public void testOfferWhenFull() {
        queue.offer("A");
        queue.offer("B");
        queue.offer("C"); // Queue is now full (maxSize = 3)
        assertFalse(queue.offer("D")); // Should return false
        assertEquals("A", queue.peek()); // First element should still be "A"
    }

    @Test
    public void testPollNormal() {
        queue.offer("A");
        queue.offer("B");
        assertEquals("A", queue.poll()); // Should remove and return "A"
        assertEquals("B", queue.peek()); // Next element should be "B"
    }

    @Test
    public void testPollEmptyQueue() {
        assertNull(queue.poll()); // Should return null for empty queue
    }

    @Test
    public void testRemoveNormal() {
        queue.offer("A");
        assertEquals("A", queue.remove()); // Should remove and return "A"
        assertNull(queue.peek()); // Queue should be empty
    }

    @Test
    public void testRemoveEmptyQueue() {
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @Test
    public void testPeekNormal() {
        queue.offer("A");
        assertEquals("A", queue.peek()); // Should return "A"
        assertEquals("A", queue.peek()); // Should still return "A" (not removed)
    }

    @Test
    public void testPeekEmptyQueue() {
        assertNull(queue.peek()); // Should return null for empty queue
    }

    @Test
    public void testElementNormal() {
        queue.offer("A");
        assertEquals("A", queue.element()); // Should return "A"
    }

    @Test
    public void testElementEmptyQueue() {
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }
}