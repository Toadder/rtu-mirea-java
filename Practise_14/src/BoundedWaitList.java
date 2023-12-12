import java.util.Collection;

/**
 * BoundedWaitList is a generic class that extends WaitList, implementing a
 * waitlist with a specified capacity.
 *
 * @param <E> Type of elements in the waitlist.
 */
public class BoundedWaitList<E> extends WaitList<E> {
	/**
	 * The maximum capacity of the waitlist.
	 */
	private int capacity;

	/**
	 * Constructs a BoundedWaitList with the specified capacity.
	 *
	 * @param capacity The maximum capacity of the waitlist. Must be greater than 0.
	 * @throws IllegalArgumentException If the specified capacity is not greater
	 *                                  than 0.
	 */
	public BoundedWaitList(int capacity) {
		if (capacity <= 0)
			throw new IllegalArgumentException("Capacity must be greater than 0");

		this.capacity = capacity;
	}

	/**
	 * Constructs a BoundedWaitList with the elements from the provided collection.
	 * The capacity is set to the size of the collection.
	 *
	 * @param items The initial collection of elements for the waitlist.
	 */
	public BoundedWaitList(Collection<E> items) {
		super(items);
		this.capacity = items.size();
	}

	/**
	 * Gets the maximum capacity of the waitlist.
	 *
	 * @return The maximum capacity of the waitlist.
	 */
	public int getCapacity() {
		return this.capacity;
	}

	/**
	 * Adds an element to the waitlist, if the waitlist is not full.
	 *
	 * @param element The element to be added to the waitlist.
	 * @throws IllegalStateException If the waitlist is already at full capacity.
	 */
	@Override
	public void add(E element) {
		if (this.queue.size() == this.capacity)
			throw new IllegalStateException("WaitList is full");

		this.queue.add(element);
	}

	/**
	 * Returns a string representation of the BoundedWaitList, including its
	 * capacity and components.
	 *
	 * @return A string representation of the BoundedWaitList.
	 */
	@Override
	public String toString() {
		return "BoundedWaitList{capacity=" + this.capacity + ", components=" + String.valueOf(this.queue) + "}";
	}
}
