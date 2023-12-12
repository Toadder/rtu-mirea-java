import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * An implementation of the iWaitList interface using the ConcurrentLinkedQueue
 * queue.
 * The IWaitList is a waiting list where items are added to the end of the
 * queue,
 * and retrieved from the beginning of the queue.
 *
 * @param <E> Type of items in the waitlist.
 */
public class WaitList<E> implements IWaitList<E> {
	/**
	 * A queue for storing waitlist items.
	 */
	protected ConcurrentLinkedQueue<E> queue;

	/**
	 * Default constructor. Initializes an empty queue.
	 */
	public WaitList() {
		this.queue = new ConcurrentLinkedQueue<>();
	}

	/**
	 * Constructor with parameter. Initializes the queue with elements from the
	 * given collection.
	 *
	 * @param collection A collection of elements to initialize the queue.
	 */
	public WaitList(Collection<E> collection) {
		this.queue = new ConcurrentLinkedQueue<>(collection);
	}

	/**
	 * Returns a string representation of the WaitList object.
	 *
	 * @return String representation of an object.
	 */
	public String toString() {
		return "WaitList{components=" + String.valueOf(this.queue) + "}";
	}

	/**
	 * Adds an item to the end of the waiting list.
	 *
	 * @param item Element to add.
	 */
	public void add(E item) {
		this.queue.add(item);
	}

	/**
	 * Deletes and returns an item from the beginning of the waiting list.
	 * Returns null if the waiting list is empty.
	 *
	 * @return Element or null if the waiting list is empty.
	 */
	public E remove() {
		return this.queue.poll();
	}

	/**
	 * Checks if the item is contained in the waiting list.
	 *
	 * @param item Element to check.
	 * @return true if the element is contained, otherwise false.
	 */
	@Override
	public boolean contains(E item) {
		Iterator<E> iterator = this.queue.iterator();

		while (iterator.hasNext()) {
			E element = iterator.next();

			if (element.equals(item))
				return true;
		}

		return false;
	}

	/**
	 * Checks if all items in the collection are contained in the waiting list.
	 *
	 * @param items The collection of elements to check.
	 * @return true if all items are contained, otherwise false.
	 */
	@Override
	public boolean containsAll(Collection<E> items) {
		Iterator<E> iterator = items.iterator();

		while (iterator.hasNext()) {
			E element = iterator.next();

			if (!this.contains(element))
				return false;
		}

		return true;
	}

	/**
	 * Checks if the waiting list is empty.
	 *
	 * @return true if the waiting list is empty, otherwise false.
	 */
	@Override
	public boolean isEmpty() {
		return this.queue.isEmpty();
	}
}
