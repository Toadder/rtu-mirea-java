import java.util.Arrays;

public class TaskThree<T> {
	private T[] array;

	public TaskThree(T[] array) {
		this.array = array;
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public T getElementAtIndex(int index) {
		if (index >= 0 && index < array.length) {
			return array[index];
		} else {
			throw new IndexOutOfBoundsException("Index out of bounds: " + index);
		}
	}

	@Override
	public String toString() {
		return "TaskThree{" +
				"array=" + Arrays.toString(array) +
				'}';
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		TaskThree<Integer> intArrayHolder = new TaskThree<Integer>(intArray);

		try {
			int index = 2;
			Integer element = intArrayHolder.getElementAtIndex(index);
			System.out.println("Element at index " + index + ": " + element);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
