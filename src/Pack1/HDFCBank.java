package Pack1;

public class HDFCBank implements RBIBank{

	@Override
	public void Credit() {
		System.out.println("Executing credit method");
	}

	@Override
	public void Debit() {
		System.out.println("Executing Debit method");
	}

	@Override
	public void transfer() {
		System.out.println("Executing Tranfer method");
	}
	
	public void hdfcrule1(){
		System.out.println("Executing hdfcrule1");
	}
	
	public void hdfcrule2(){
		System.out.println("Executing hdfcrule2");
	}

}
