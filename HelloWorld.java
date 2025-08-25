public class HelloWorld {
	private String name;
	private int age;

	public HelloWorld(String name) {
		this.name = name;
		this.age = -1; // Default value if age not provided
	}

	public HelloWorld(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void greet() {
		System.out.println("Hello, " + name + "!");
	}

	// Overloaded greet method with custom message
	public void greet(String message) {
		System.out.println(message + ", " + name + "!");
	}

	public void introduce() {
		if (age >= 0) {
			System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
		} else {
			System.out.println("Hello, my name is " + name + ".");
		}
	}

	public static void main(String[] args) {
		// Using first constructor
		HelloWorld student1 = new HelloWorld("Rico Suave");
		student1.greet();
		student1.greet("Welcome");
		student1.introduce();

		// Using second constructor
		HelloWorld student2 = new HelloWorld("Jason", 25);
		student2.greet();
		student2.greet("Good morning");
		student2.introduce();
	}
}
