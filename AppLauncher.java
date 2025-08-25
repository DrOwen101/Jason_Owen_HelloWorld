import java.util.Scanner;
import java.util.logging.Logger;

/**
 * AppLauncher demonstrates the usage of the HelloWorld class.
 * It gathers user input, creates HelloWorld objects, and calls their methods.
 */
public class AppLauncher {
	/**
	 * The main method to launch the application.
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(AppLauncher.class.getName());
		try (Scanner scanner = new Scanner(System.in)) {
			// Gather user input with validation
			logger.info("Enter your name: ");
			String userName = scanner.nextLine().trim();
			if (userName.isEmpty()) {
				throw new IllegalArgumentException("Name cannot be empty.");
			}

			logger.info("Enter your age: ");
			int userAge = -1;
			if (scanner.hasNextInt()) {
				userAge = scanner.nextInt();
				scanner.nextLine(); // consume newline
			} else {
				throw new IllegalArgumentException("Age must be a number.");
			}
			if (userAge < 0) {
				throw new IllegalArgumentException("Age cannot be negative.");
			}

			// Instantiate HelloWorld objects
			HelloWorld user = new HelloWorld(userName, userAge);
			HelloWorld student1 = new HelloWorld("Rico Suave");
			HelloWorld student2 = new HelloWorld("Jason", 25);

			// Demonstrate all methods
			logger.info("\n--- Demonstrating HelloWorld objects ---");
			user.greet();
			user.greet("Welcome");
			user.introduce();

			student1.greet();
			student1.greet("Hi");
			student1.introduce();

			student2.greet();
			student2.greet("Good morning");
			student2.introduce();
		} catch (IllegalArgumentException e) {
			Logger.getLogger(AppLauncher.class.getName()).severe(String.format("Input error: %s", e.getMessage()));
		} catch (Exception e) {
			Logger.getLogger(AppLauncher.class.getName()).severe(String.format("Unexpected error: %s", e.getMessage()));
		}
	}
}
