package bank;

public class Account {
double bal;
Account()
{
	double b=1000;
	bal=0.0;
	if(b>=0.0)
	{
		bal=b;
	}
	else
	{
		System.out.println("Error");
	}
	System.out.println("\nBalance is: "+bal);
}
public void credit(double c)
{
	bal=bal+c;
	System.out.println("Credited :"+c);
	System.out.println("New Balance is :"+bal);
}
public void debit(double d)
{
	if(d<bal)
	{
		bal=bal-d;
		System.out.println("Debited :"+d);
		System.out.println("New Balance is :"+bal);
	}
	else
	{
		System.out.println("Debit amount exceeded account balance.");
	}
}
public double getbalance()
{
	return bal;
}
}


