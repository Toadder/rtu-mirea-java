public class TaskFiveSix {
	public void printMessage(String key) {
		String message = getDetails(key);
		System.out.println(message);
	}

	public String getDetails(String key) {
		try {
			if (key == null) {
				throw new NullPointerException("null key in getDetails");
			}
			return "data for " + key;
		} catch (Exception e) {
			return e.getMessage();
		}
	}
}