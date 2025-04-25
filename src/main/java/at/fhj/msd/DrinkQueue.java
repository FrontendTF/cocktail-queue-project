package at.fhj.msd;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * A queue that stores Drink objects.
 */
public class DrinkQueue {
    private Queue<Drink> drinks = new LinkedList<>();

    public boolean offer(Drink d) {
        return drinks.offer(d);
    }

    public Drink poll() {
        return drinks.poll();
    }

    public Drink remove() {
        Drink d = drinks.poll();
        if (d == null) throw new NoSuchElementException("No drink in queue");
        return d;
    }

    public Drink peek() {
        return drinks.peek();

    // Russman Teil    



    }
}
