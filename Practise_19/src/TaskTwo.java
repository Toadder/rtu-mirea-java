import java.util.Arrays;

public class TaskTwo<T> {
	private T[] array;

	public TaskTwo(T[] array) {
		this.array = array;
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	@Override
	public String toString() {
		return "GenericArrayHolder{" +
				"array=" + Arrays.toString(array) +
				'}';
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		TaskTwo<Integer> intArrayHolder = new TaskTwo<Integer>(intArray);
		System.out.println("Integer Array Holder: " + intArrayHolder);

		String[] stringArray = { "apple", "banana", "orange" };
		TaskTwo<String> stringArrayHolder = new TaskTwo<String>(stringArray);
		System.out.println("String Array Holder: " + stringArrayHolder);
	}
}
