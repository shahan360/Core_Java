public class A1 { //class A is the parent class or super class
    public void show() //defining a method show() to display a message
    {
        System.out.println("from A1"); //the mesage displays that the show method is called from class A1
    }

    public static void invoke(A1 ref) //defining a static method invoke() which takes an object of class A1 as a reference as a parameter
    {
        ref.show(); //helps inidentifying the binding of the method show() at runtime
    }
}
