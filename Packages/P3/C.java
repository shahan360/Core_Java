package Packages.P3;

import Q2.A;

class B extends A 
{
    public void show()
    {
        super.show();
    }
}

public class C {
    public static void main(String[] args) {
        B ref = new B();
        ref.show();
    }
}
