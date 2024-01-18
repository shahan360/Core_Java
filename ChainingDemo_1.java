// Explicit Chaining Demo where chaining is demonstrated using super keyword and the super-parent class is Object.
class A extends Object{
    public A(){
        super();
        System.out.println("from A");
    }
}

class B extends A{
    public B(){
        super();
    }
}

class C extends B{
    public C(){
        super();
        System.out.println("from C");
    }
}
public class ChainingDemo_1 {
    
}
