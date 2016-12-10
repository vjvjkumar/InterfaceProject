package Pack2;

/**
 * until Java 1.7 release can't allow the main method in the interfaces
 * From Java 1.8 release it can allow main method in the interfaces
 *
 */
public interface InterfaceTest {
	public static void main(String[] args) {
		System.out.println("this is main method");
	}

}
