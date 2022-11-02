public class MainApplication {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			RectangleComparer rectangleComparer = new RectangleComparer(args);
		} catch(Exception e) {
			System.out.println("Failed to exit program successfully.");
		}
	}

}
