package bank;

class Savingsacc extends Account{
double interestrate;
Savingsacc(double itr)
{
	System.out.println("Calling SavingsAccount\n");
	interestrate=itr;
	System.out.println("Interest rate is:"+itr);
}
public void calculateInterest()
{
	double res= bal*interestrate*0.01;
	System.out.println("Interest "+res);
	bal=bal+res;
	System.out.println("New Balance is: "+bal);
}
}
