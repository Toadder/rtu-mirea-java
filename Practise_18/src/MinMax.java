class MinMax<T extends Comparable<T>> {
	private T[] array;

	public MinMax(T[] array) {
		this.array = array;
	}

	public T findMin() {
		if (array == null || array.length == 0) {
			return null;
		}

		T min = array[0];
		for (T element : array) {
			if (element.compareTo(min) < 0) {
				min = element;
			}
		}
		return min;
	}

	public T findMax() {
		if (array == null || array.length == 0) {
			return null;
		}

		T max = array[0];
		for (T element : array) {
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 5, 3, 7, 2 };
		MinMax<Integer> minMaxInt = new MinMax<>(intArray);

		System.out.println("Min: " + minMaxInt.findMin());
		System.out.println("Max: " + minMaxInt.findMax());

		Double[] doubleArray = { 1.5, 5.2, 3.8, 7.4, 2.9 };
		MinMax<Double> minMaxDouble = new MinMax<>(doubleArray);

		System.out.println("Min: " + minMaxDouble.findMin());
		System.out.println("Max: " + minMaxDouble.findMax());
	}
}