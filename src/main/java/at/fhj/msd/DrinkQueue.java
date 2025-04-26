package at.fhj.msd;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * A queue that stores Drink objects.
 */
public class DrinkQueue {
    private Queue<Drink> drinks = new LinkedList<>();

    /**
     * Inserts the specified drink into the queue if possible.
     *
     * @param d the drink to add
     * @return true if the drink was added successfully, false otherwise
     */
    public boolean offer(Drink d) {
        return drinks.offer(d);
    }

    /**
     * Retrieves and removes the head of the queue, or returns null if the queue is
     * empty.
     *
     * @return the first drink in the queue or null if the queue is empty
     */
    public Drink poll() {
        return drinks.poll();
    }

    /**
     * Retrieves and removes the head of the queue.
     *
     * @return the first drink in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public Drink remove() {
        Drink d = drinks.poll();
        if (d == null)
            throw new NoSuchElementException("No drink in queue");
        return d;
    }

    /**
     * Retrieves, but does not remove, the head of the queue, or returns null if the
     * queue is empty.
     *
     * @return the first drink in the queue, or null if the queue is empty
     */
    public Drink peek() {
        return drinks.peek();
    }

}
