import java.util.Iterator;

/**
 * UnfairWaitList is a generic class that extends WaitList, representing a
 * waitlist
 * with the ability to move a specific element to the back of the queue.
 *
 * @param <E> Type of elements in the waitlist.
 */
public class UnfairWaitList<E> extends WaitList<E> {
	/**
	 * Constructs an UnfairWaitList.
	 */
	public UnfairWaitList() {
	}

	/**
	 * Removes all occurrences of the specified item from the waitlist.
	 *
	 * @param item The element to be removed from the waitlist.
	 */
	public void remove(E item) {
		Iterator<E> iterator = this.queue.iterator();

		while (iterator.hasNext()) {
			E currentElement = iterator.next();

			if (currentElement.equals(item)) {
				iterator.remove();
			}
		}

	}

	/**
	 * Moves the first occurrence of the specified item to the end of the waitlist.
	 *
	 * @param item The element to be moved to the back of the waitlist.
	 */
	public void moveToBack(E item) {

		Iterator<E> iterator = this.queue.iterator();

		while (iterator.hasNext()) {
			E currentElement = iterator.next();
			if (currentElement.equals(item)) {
				iterator.remove();
				this.queue.add(item);
			}
		}

	}

	/**
	 * Prints the elements of the waitlist in the order they are stored.
	 */
	public void printQueue() {
		System.out.print("WaitList contents: [");

		Iterator<E> iterator = this.queue.iterator();

		while (iterator.hasNext()) {
			E currentElement = iterator.next();
			System.out.print(currentElement);

			if (iterator.hasNext()) {
				System.out.print(", ");
			}

		}

		System.out.println("]");
	}
}