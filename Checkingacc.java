package bank;

class Checkingacc extends Account {
	double fee;
	Checkingacc(double f)
	{
		System.out.println("Calling CheckingAccount\n");
		fee=f;
	}
	public void credit(double c)
	{
		bal=bal+c;
		System.out.println("Credited :"+c);
		bal=bal-fee;
		System.out.println("Charged :"+fee);
		System.out.println("New Balance is :"+bal);
	}
	public void debit(double d)
	{
		if(d<bal)
		{
			System.out.println("Debited :"+d);
			bal=bal-d;
			System.out.println("Charged :"+fee);
			bal=bal-fee;
			System.out.println("New Balance is :"+bal);
		}
		else
		{
			System.out.println("Debit amount exceeded account balance.");
		}
	}
}
