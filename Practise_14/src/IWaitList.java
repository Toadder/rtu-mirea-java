import java.util.Collection;

public interface IWaitList<E> {
	E remove();

	void add(E item);

	boolean contains(E item);

	boolean containsAll(Collection<E> items);

	boolean isEmpty();
}
