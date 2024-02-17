// import jdk.incubator.vector.VectorOperators.Test;

final class Test //final class so that it cannot be inherited
{
    final int a; //final variable so that it cannot be changed
    final int b; //final variable so that it cannot be changed
    public Test(int a, int b) //constructor to initialize the values of a and b
    {
        this.a=a; //this keyword is used to refer to the current object of the class
        this.b=b; //this keyword is used to refer to the current object of the class
    }
    public int getA() //getter method to get or return the value of a
    {
        return a;
    }
    public int getB() //getter method to get or return the value of b
    {
        return b;
    }
}

public class ImmutableCustomDemo1 {
    public static void main(String[] args) //main method is static so that it can be called without creating an object with arguments as string array
    {
        Test t1=new Test(10,20); //creating object t1 of Test class and passing values to the constructor
        Test t2=new Test(10,20); //creating object t2 of Test class and passing values to the constructor
        System.out.println(t1.getA()+" "+t1.getB()); //printing the values of a and b of object t1 using getA and getB getter methods
        // t1.a=100; //changing the value of a of object t1 to 100
        System.out.println(t1.hashCode()+" "+t2.hashCode()); //printing the hashcode of object t1 and t2 using hashCode method of Object class
    }
}
