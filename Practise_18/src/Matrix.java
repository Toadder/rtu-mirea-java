public class Matrix<T> {
	private final int rows;
	private final int columns;
	private final T[][] data;

	public Matrix(T[][] data) {
		this.data = data;
		this.rows = data.length;
		this.columns = data[0].length;
	}

	public void setItem(int row, int column, T value) {
		if (row >= 0 && row < this.rows && column >= 0 && column < this.columns) {
			this.data[row][column] = value;
		} else {
			throw new IllegalArgumentException("Invalid row or column index");
		}
	}

	public T getItem(int row, int column) {
		if (row >= 0 && row < this.rows && column >= 0 && column < this.columns) {
			return this.data[row][column];
		} else {
			throw new IllegalArgumentException("Invalid row or column index");
		}
	}

	public int getRows() {
		return this.rows;
	}

	public int getColumns() {
		return this.columns;
	}

	public static void main(String[] args) {
		Integer[][] data = {
			{1, 2, 3},
      {4, 5, 6},
    	{7, 8, 9}
		};

		Matrix<Integer> matrix = new Matrix<>(data);
		System.out.println("Columns: " + matrix.getColumns());
		System.out.println("Rows: " + matrix.getRows());

		System.out.println("Item [0][1]: " + matrix.getItem(0, 1));
 }
}
