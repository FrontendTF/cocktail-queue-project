package at.fhj.msd;

/**
 * A simple interface representing basic queue operations.
 */
public interface IQueue {
/**
  * Adds an element to the queue.
  *
  * @param obj the element to add
  * @return true if the element was successfully added, false otherwise
  */
  public abstract boolean offer(String obj);
  /**
     * Retrieves and removes the head of the queue, or returns null if the queue is empty.
     *
     * @return the head of the queue, or null if the queue is empty
     */
  public abstract String poll();
 /**
     * Retrieves and removes the head of the queue. 
     * Throws NoSuchElementException if the queue is empty.
     *
     * @return the head of the queue
     * @throws java.util.NoSuchElementException if the queue is empty
     */
  public abstract String remove();
 /**
     * Retrieves, but does not remove, the head of the queue, or returns null if the queue is empty.
     *
     * @return the head of the queue, or null if the queue is empty
     */
  public abstract String peek();
 /**
     * Retrieves, but does not remove, the head of the queue. 
     * Throws NoSuchElementException if the queue is empty.
     *
     * @return the head of the queue
     * @throws java.util.NoSuchElementException if the queue is empty
     */
  public abstract String element();
}