interface Number
{
	void show();
	Number add(Number n);
}
class Rational implements Number
{
	int p,q;
	public Rational(int p,int q)
	{
		this.p=p;
		this.q=q;
	}
	public void show()
	{
		System.out.println(p+"/"+q);
	}
	public Number add(Number n)
	{
		Rational n2=(Rational)n;
		int p=this.p*n2.q+this.q*n2.p;
		int q=this.q*n2.q;
		return new Rational(p,q);
	}
}
class Complex implements Number
{
	int x,y;
	public Complex(int x,int y)
	{
		this.x=x;;
		this.y=y;
	}
	public void show()
	{
		System.out.println(x+"+i"+y);
	}
	public Number add(Number n)
	{
		Complex n2=(Complex)n;
		int x=this.x+n2.x;
		int y=this.y+n2.y;
		return new Complex(x,y);
	}
}
class NumberDemo
{
	public static void main(String[] args) {
		System.out.println("creating some number obj");
		//Rational n1=new Rational(3,5);
		//Rational n2=new Rational(4,7);
		Complex n1=new Complex(3,5);
		Complex n2=new Complex(4,7);
		System.out.println("first no is");
		n1.show();
		System.out.println("second no is");
		n2.show();
		System.out.println("their sum is");
		Number n3=n1.add(n2);
		n3.show();
	}
}
