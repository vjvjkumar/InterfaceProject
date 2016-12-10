package Pack2;

public abstract class AbstractClass implements testint1, testint2{
	
	public static void main(String[] args) {
		
	}
	
	public AbstractClass(){
		System.out.println("This is constructor");
	}
	
	//abstract methods:
	public abstract void test1();
	public abstract void test2();
	
	//Non abstract methods:
	public void test3(){
		System.out.println("Executing non-abstract methods");
	}
	
	//static methods
	public static void test4(){
		System.out.println("this is static void method");
	}
	

}
