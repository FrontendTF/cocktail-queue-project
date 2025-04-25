package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


/**
 * A queue implementation for storing strings with a fixed maximum size.
 * Implements typical queue operations such as offer, poll, remove, peek, and element.
 */
public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;

/**
 * Creates a new StringQueue with a specified maximum size.
 *
 * @param maxSize the maximum number of elements this queue can hold
 */
  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }

/**
 * Adds a new element to the queue if there is space available.
 *
 * @param obj the string to add
 * @return true if the element was added successfully, false if the queue is full
 */
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

/**
 * Retrieves and removes the head of the queue, or returns null if the queue is empty.
 *
 * @return the first element in the queue, or null if the queue is empty
 */
  @Override
  public String poll() {
    String element = peek();

    if (elements.size() > 0) {
      elements.remove(0);
    }

    return element;
  }

/**
 * Retrieves and removes the head of the queue.
 *
 * @return the first element in the queue
 * @throws NoSuchElementException if the queue is empty
 */
  @Override
  public String remove() {
    String element = poll();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

/**
 * Retrieves, but does not remove, the head of the queue, or returns null if the queue is empty.
 *
 * @return the first element in the queue, or null if the queue is empty
 */
  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }
  
/**
 * Retrieves, but does not remove, the head of the queue.
 *
 * @return the first element in the queue
 * @throws NoSuchElementException if the queue is empty
 */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }
}