package Pack1;

public class CallInterfaceMehtods extends HDFCBank{
	public static void main(String[] args) {
		RBIBank rbi=new HDFCBank();
		rbi.Credit();
		rbi.Debit();
		rbi.transfer();
		
	}
}
