package bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savingsacc ob1= new Savingsacc(10);
		ob1.credit(300);
		ob1.debit(1500);
		ob1.getbalance();
		ob1.calculateInterest();
		Checkingacc ob2=new Checkingacc(10);
		ob2.credit(400);
		ob2.debit(100);
	}

}
