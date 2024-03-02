class AB //server class
{
	int a,b; //data members
	private AB() //constructor with no arguments to initialize a and b
	{
		a=2;
		b=4;
	}
	private AB(int a,int b) //constructor with two arguments to initialize a and b using the values passed to it
	{
		this.a=a;
		this.b=b;
	}
	public void show() //method show() to display the values of a and b
	{
		System.out.println(a+" "+b); //displaying the values of a and b
	}
	//factory method to create and return the object of class AB
	public static AB getA1() //factory method getA1() to create and return the object of class AB
	{
		return new AB(); //object of class AB created and returned
	}
	public static AB getA2(int x,int y) //factory method getA2() to create and return the object of class AB    
	{
		return new AB(x,y); //object of class AB created and returned
	}
}
class FactoryDemo //client class
{
	public static void main(String[] args) { //main method
		AB x=AB.getA1(); //factory method getA1() called
		x.show(); //method show() called
		AB y=AB.getA2(10,20); //factory method getA2() called
		y.show(); //method show() called
	}
}

/* In the above program, we have created a class AB with two data members a and b and two constructors. this program
    demonstrates the use of factory method to create and return the object of class AB. The factory method getA1() is used
    to create and return the object of class AB with default values of a and b. The factory method getA2() is used to create
    and return the object of class AB with the values of a and b passed to it. The main method of the FactoryDemo class calls */