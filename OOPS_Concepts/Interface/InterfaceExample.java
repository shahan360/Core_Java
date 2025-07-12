/*
 * What is an Interface?
 * An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. 
 * An interface specifies what a class must do, but not how it does it.
 * Interfaces cannot contain instance fields or constructors, and methods in interfaces are abstract by default.
 * General Example of an Interface:
 * ```java
 * public interface InterfaceName {
 *     // Constant declarations i.e., public static final variables
 *     int CONSTANT = 100; 
 *    // Abstract method declarations, by default public and abstract
 *     void method1();
 *     int method2(String param);
 *    // abstract methods, default methods and static methods
 *     default void defaultMethod() {
 *         System.out.println("This is a default method.");
 *     }
 *     static void staticMethod() {
 *         System.out.println("This is a static method.");
 *     }
 * }
 * ```
 * 
 * When a class implements an interface, it promises to provide the behavior defined by the interface.
 * ```java
 * public class ClassName implements InterfaceName {
 *     @Override
 *     public void method1() {
 *         // Implementation of method1
 *     }
 *     @Override
 *     public int method2(String param) {
 *         // Implementation of method2
 *         return 0; // Example return value
 *     }
 * }
 * }    
 * * In this example, `ClassName` implements the `InterfaceName` interface and provides concrete implementations for the abstract methods defined in the interface.
 * * Interfaces are used to achieve abstraction and multiple inheritance in Java. A class can implement multiple interfaces, allowing it to inherit behavior from multiple sources.
 * 
 * If a class does not implement all the methods of an interface, it must be declared as abstract.
 * ```java
 * public abstract class AbstractClass implements InterfaceName {
 *     // This class does not need to implement all methods of the interface
 *     // It can leave some methods unimplemented, making it abstract.
 * }
 * ```  
 * 
 * Multiple inheritance for classes using interfaces shown by the diagram below:
 * ```
 * +-----------------+
 * |     Interface   |
 * +-----------------+
 * | + method1()     |
 * | + method2()     |
 * +-----------------+
 *         ^
 *         |
 * +-----------------+
 * |     ClassA      |
 * +-----------------+
 * | + method1()     |
 * +-----------------+
 *         ^
 *         |
 * +-----------------+
 * |     ClassB      |
 * +-----------------+
 * | + method2()     |
 * +-----------------+
 *         ^
 *         |
 * +-----------------+
 * |     ClassC      |
 * +-----------------+
 * | + method1()     |
 * | + method2()     |
 * +-----------------+
 * ```
 * In this diagram, `ClassA` and `ClassB` implement the same interface,
 * and `ClassC` inherits from both `ClassA` and `ClassB`, demonstrating
 * multiple inheritance through interfaces.
 * 
 * Multiple inheritance using interfaces as shown by the diagram below:
 * ```
 * +-----------------+
 * |     Interface1  |      
 * +-----------------+
 * | + method1()     |
 * +-----------------+
 *         ^
 *         |
 * +-----------------+ * |     Interface2  |
 * +-----------------+
 * | + method2()     | * +-----------------+
 * +-----------------+ * | + method3()     |
 *         ^           * +-----------------+
 *         |           * +-----------------+
 * +-----------------+ * |     ClassA      |
 * |     ClassB      | * +-----------------+
 * +-----------------+ * | + method1()     |
 * | + method2()     | * | + method3()     |
 * +-----------------+ * +-----------------+
 *         ^           *
 *         |           *
 * +-----------------+ *
 * |     ClassC      |
 * +-----------------+
 * | + method1()     |
 * | + method2()     |
 * +-----------------+
 * ```
 * In this diagram, `ClassB` implements `Interface1` and `Interface2`,
 * and `ClassC` inherits from `ClassB`, demonstrating multiple inheritance
 * through interfaces.
 * 
 * Why multiple inheritance is not supported thorugh a class in Java, but it can be achieved through interfaces?
 * Java does not support multiple inheritance through classes to avoid the "Diamond Problem," where a class could inherit from two classes that have methods with the same signature, leading to ambiguity about which method to call.
 * However, interfaces do not have this problem because they only define method signatures without providing implementations, allowing a class to implement multiple interfaces without ambiguity.
 * 
 * Why do we use interfaces?
 * 1. **Abstraction**: Interfaces allow you to define a contract for what a class should do, without specifying how it should do it. This promotes abstraction and allows for flexible design.
 * 2. **Multiple Inheritance**: Interfaces allow a class to inherit behavior from multiple sources, enabling a form of multiple inheritance. A class can implement multiple interfaces, allowing it to inherit methods from several different interfaces.
 * 3. **Loose Coupling**: By programming to an interface rather than a concrete class, you can create systems that are more flexible and easier to maintain. Changes to one part of the system can be made with minimal impact on other parts.
 * 4. **Polymorphism**: Interfaces enable polymorphism, allowing you to use different classes interchangeably as long as they implement the same interface. This is useful for writing generic code that can work with any class that implements a specific interface.
 * 5. **Code Reusability**: Interfaces promote code reusability by allowing different classes to implement the same interface and share common behavior without duplicating code.     
 */

// A very simple example of an interface in Java
package OOPS_Concepts.Interface;

public interface InterfaceExample {
    // Constant declaration
    int CONSTANT = 42;

    // Abstract method declaration
    void displayMessage();

    // Default method with implementation
    default void showDefault() {
        System.out.println("This is a default method in the interface.");
    }

    // Static method with implementation
    static void showStatic() {
        System.out.println("This is a static method in the interface.");
    }
}
