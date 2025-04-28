package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for DrinkQueue functionality.
 */
public class DrinkQueueTest {

    private DrinkQueue queue;
    private Drink simple;
    private Drink better;

    @BeforeEach
    void setUp() {
        queue = new DrinkQueue();
        simple = new SimpleDrink("Water", new Liquid("Water", 0.5, 0));
        better = new SimpleDrink("Vodka", new Liquid("Vodka", 0.02, 40));
    }

    @Test
    void testOfferAndPeek() {
        assertTrue(queue.offer(simple));
        assertEquals("Water", queue.peek().getName());
    }

    @Test
    void testPoll() {
        queue.offer(simple);
        assertEquals("Water", queue.poll().getName());
        assertNull(queue.poll());
    }

    @Test
    void testRemoveSuccess() {
        queue.offer(simple);
        assertEquals("Water", queue.remove().getName());
    }

    @Test
    void testRemoveThrowsException() {
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @Test
    void testElementReturnHead() {
        queue.offer(simple);
        Drink result = queue.element();
        assertEquals(simple, result);
    }

    @Test
    void testElementWhenEmpty() {
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }
}