// Implicit Chaining Demo where chaining is happening using implicit super keyword and the implicit super-parent class is Object.
class A{
    public A(){
        System.out.println("from A");
    }
}
class B extends A{
}
class C extends B{
    public C(){
        System.out.println("from C");
    }
}
public class ChainingDemo {
    public static void main(String[] args) {
        A x=new A();
        B y=new B();
        C z=new C();
    }
}
