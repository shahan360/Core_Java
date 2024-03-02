class A{ // A class is loaded when we create an object of A
    static{ // static block is executed when A class is loaded
        System.out.println("A class is loaded"); // This will be printed when A class is loaded
    }
}

public class ImplicitReflectionDemo { // implicitReflectionDemo class is loaded when we run the program
    static{ // static block is executed when implicitReflectionDemo class is loaded
        System.out.println("implicitReflectionDemo class is loaded"); // This will be printed when implicitReflectionDemo class is loaded
    }
    public static void main(String[] args) { // main method is executed when we run the program
        A ref = new A(); // A class is loaded when we create an object of A
    }
}

/* The above program show the demonstration of implicit reflection. 
When we run the program, implicitReflectionDemo class is loaded and 
its static block is executed. Then we create an object of A class, 
so A class is loaded and its static block is executed. */ 

