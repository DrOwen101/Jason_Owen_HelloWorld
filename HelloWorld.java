/**
 * The HelloWorld class represents a person with a name and optional age.
 * It provides methods to greet and introduce the person.
 */
import java.util.logging.Logger;

public class HelloWorld {
	private final String name;
	private final int age;
	private static final Logger logger = Logger.getLogger(HelloWorld.class.getName());

	/**
	 * Constructs a HelloWorld object with a name only.
	 * @param name the name of the person
	 */
	public HelloWorld(String name) {
		this.name = name;
		this.age = -1; // Default value if age not provided
	}

	/**
	 * Constructs a HelloWorld object with a name and age.
	 * @param name the name of the person
	 * @param age the age of the person
	 */
	public HelloWorld(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * Greets the person with a default message.
	 */
	public void greet() {
		logger.info(String.format("Hello, %s!", name));
	}

	/**
	 * Greets the person with a custom message.
	 * @param message the custom message to use
	 */
	public void greet(String message) {
		logger.info(String.format("%s, %s!", message, name));
	}

	/**
	 * Introduces the person, including age if available.
	 */
	public void introduce() {
		if (age >= 0) {
			logger.info(String.format("Hello, my name is %s and I am %d years old.", name, age));
		} else {
			logger.info(String.format("Hello, my name is %s.", name));
		}
	}
}
