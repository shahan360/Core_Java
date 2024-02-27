abstract class Account extends Object
{
	String name;
	Double balance;
	public Account(String name,double balance)
	{
		this.name=name;
		this.balance=balance;
	}
	public final void display()
	{
		System.out.println("name="+this.name);
		System.out.println("balance="+this.balance);
		System.out.println("type="+this.getClass().getName());
		System.out.println("rate="+this.getRate());
	}
	public final void deposit(double amt)
	{
		balance = balance+amt;
	}
	public abstract Double getRate();
    
	public static void creditInterest(Account ref)
	{
		Double ir = ref.getRate();
		ir = ((ref.balance)*(ir/4))/100;
		ref.deposit(ir);	
	} 
}
class Saving extends Account
{
	public Saving(String name,double balance)
	{
		super(name,balance);
	}
	public Double getRate()
	{
		return 5.0;
	}
}
class fixed extends Account
{
	public fixed(String name,double balance)
	{
		super(name,balance);
	}
	public Double getRate()
	{
		return 7.0;
	}
}
class Current extends Account 
{
	public Current(String name,double balance)
	{
		super(name,balance);
	}
	public Double getRate()
	{
		return 2.0;
	}
}
class RTPMDemo2
{
	public static void main(String[]args)
	{
		System.out.println("creating some account obj");
        Saving x=new Saving("abc",10000);
        fixed y=new fixed("xyz",12000);
        Current z=new Current("pqr",14000);
        System.out.println("details of obj");
        x.display();
        y.display();
        z.display();
        System.out.println("crediting interest in account");
        Account.creditInterest(x);
        Account.creditInterest(y);
        Account.creditInterest(z);
        System.out.println("details of account obj after crediting interest");
        x.display();
        y.display();
        z.display();
	}
}