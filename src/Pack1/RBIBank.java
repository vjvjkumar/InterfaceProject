package Pack1;

/**
 * 1. Inteface create with interface keyword
 * 2. All the variables are static final
 * 3. we must and should initialize the variable value.
 * 4. we can't reinitialize the variable value
 * 5. All are public method only.
 * 6. No body for methods
 * 7. All are non-static methods, we can't create static methods
 * 8. To extends the class we can use keyword as "implements"
 * 9. we can inherits one class with multiple interfaces
 */
public interface RBIBank {
	int a=12;
	//this method is abstract method, and abstract method does't have body.
	public void Credit();
	public void Debit();
	public void transfer();

}
