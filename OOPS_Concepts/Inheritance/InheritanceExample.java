/*
 * What is Inheritance in Java?
 * It is a way to organize a set of interrelated classes in a hierarchy i.e. how a subclass inherits the properties and behaviors of a superclass, thereby making a hierarchical relationship between classes.
 * Super Class: The class whose properties and behaviors are inherited by another class. It is also known as the parent class or base class.
 * Sub Class: The class that inherits the properties and behaviors of another class. It is also known as the child class or derived class.
 * Common behavior can be defined in the superclass, and subclasses can extend or override this behavior as needed.
 * Diagramatic representation of inheritance:
 * 
 *         Animal
 *         /    \
 *      Dog      Cat
 * 
 * Here, `Animal` is the superclass, and `Dog` and `Cat` are subclasses that inherit from `Animal`.
 * 
 * Benefits of Inheritance:
 * - Code Reusability: Subclasses can reuse methods and fields of the superclass, reducing code duplication.
 * - Method Overriding: Subclasses can provide specific implementations of methods defined in the superclass, allowing for polymorphism.
 * - Hierarchical Classification: It allows for a natural classification of classes, making the code more organized and easier to understand.
 */


// Here we present a simple example of inheritance in Java.
package OOPS_Concepts.Inheritance; // Package declaration

// Superclass
class Animal {

    // If we are not going to use a constructor, Java will provide a default constructor.
    // If we want to create a constructor, we can define it as follows:
    Animal() {
        System.out.println("An animal is created.");
    }

    // If we want to create a constructor with parameters, we can define it as follows:
    // Constructor for Animal class
    Animal(String name) {
        System.out.println("An animal named " + name + " is created.");
    }
    

    int limbs = 4; // Example field
    String type = "Mammal"; // Example field

    // Method to demonstrate behavior
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass Dog
class Dog extends Animal {
    // To access the limbs and type fields from the Animal class, we can use the super keyword. We use it to call the superclass constructor
    // and to access the superclass fields and methods.
    Dog() {
        super("Dog"); // Calling the superclass constructor with a name
        System.out.println("A dog is created with " + limbs + " limbs and is a " + type + ".");
    }

    // Method specific to Dog
    void bark() {
        System.out.println("The dog barks.");
    }

    // Overriding the eat method from Animal class
    @Override
    void eat() {
        System.out.println("The dog eats dog food.");  // Specific implementation for Dog
        }
}

// Subclass Cat
class Cat extends Animal {

    Cat() {
        super("Cat"); // Calling the superclass constructor with a name
        System.out.println("A cat is created with " + limbs + " limbs and is a " + type + ".");
    }

    // Method specific to Cat
    void meow() {
        System.out.println("The cat meows.");
    }

    // Overriding the eat method from Animal class
    @Override
    void eat() {
        System.out.println("The cat eats cat food.");  // Specific implementation for Cat  
        }
}

// Main class to demonstrate inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog dog = new Dog();
        dog.eat(); // Calling the overridden method
        dog.bark(); // Calling the specific method of Dog

        // Creating an instance of Cat
        Cat cat = new Cat();
        cat.eat(); // Calling the overridden method
        cat.meow(); // Calling the specific method of Cat
    }
}

/*
 * Types of Inheritance in Java:
 * 1. Single Inheritance: A class inherits from one superclass.
 * Diagram:
 * *         A : Superclass
 * *         |
 * *         B : Subclass of A, which can access members of A
 * 
 * 2. Multilevel Inheritance: A class inherits from a superclass, which in turn inherits from another superclass.
 * Diagram:
 * *         A  : Superclass
 * *         |  
 * *         B  : Subclass of A, which can access members of A
 * *         |
 * *         C  : Subclass of B, also a subclass of A and can access members of both A and B
 * 
 * 3. Hierarchical Inheritance: Multiple subclasses inherit from a single superclass.
 * Diagram:
 * *         A  : Superclass
 * *        / \
 * *       B   C : Subclasses of A, which can access members of A
 * 
 * 4. Multiple(not allowed, so Hybrid) Inheritance: A class can inherit from multiple classes. However, Java does not support multiple inheritance with classes to avoid ambiguity. Instead, it uses interfaces to achieve this. We also refer to this as Hybrid Inheritance.
 * Diagram:
 * *         A  : Superclass
 * *        / \
 * *       B   C : Subclasses of A, which can access members of A
 * *        \ /
 * *         D  : Subclass of both B and C, which can access members of both B and C
 * 
 * 
 * Object Class in Java:
 * - The Object class is the root class of all classes in Java. Every class in Java
 *   implicitly extends the Object class if no other superclass is specified for that class.
 * - It provides basic methods that are common to all objects, such as `toString()`, `equals()`, `hashCode()`, and `getClass()`.
 * - The Object class is defined in the `java.lang` package, which is automatically imported into every Java program.
 * 
 * A subclass inherits all the public and protected members of the Object class, allowing it to use these methods without needing to explicitly extend the Object class.
 * For example, we can override the `toString()` method in our `Animal` class to provide a string representation of the animal object.
 * 
 * 
 * How to access members of the superclass in a subclass:
 * - We can access the members of the superclass using the `super` keyword.
 * - The `super` keyword can be used to call the superclass constructor, access superclass methods, and access superclass fields.
 * - If a subclass has a method with the same name as a method in the superclass, we can use `super.methodName()` to call the superclass method.
 * * Example:
 * *         class A {
 * *             void display() {
 * *                 System.out.println("Display method of class A");
 * *             }
 * *         }
 * *         class B extends A {
 * *             void display() {
 * *                 System.out.println("Display method of class B");
 * *                 super.display(); // Calling the display method of class A
 * *             }
 * *         }
 * *         public class Inheritance
 * *         {
 * *             public static void main(String[] args) {
 * *                 B obj = new B();
 * *                 obj.display(); // Output: Display method of class B
 * *                                 //         Display method of class A
 * *             }
 * *         }
 * 
 * Casting Objects: This is an object is of the data type of the clss from which it is created.
 * - We can cast an object of a subclass to its superclass type using explicit casting.
 * - This is useful when we want to treat a subclass object as an object of its superclass.
 * - Example:
 * *         Animal animal = new Dog(); // Upcasting: Dog is treated as an Animal
 * *         Dog dog = (Dog) animal; // Downcasting: Animal is cast back to Dog
 * * - However, downcasting should be done carefully to avoid `ClassCastException` at runtime. It is recommended to use the `instanceof` operator to check the type before downcasting.
 * 
 * Compositions and how it differs from inheritance:
 * - Composition is a design principle where a class contains references to other classes as its fields,
 *  allowing it to use their functionality without inheriting from them.   
 * * - It promotes a "has-a" relationship, where one class has instances of other classes as its members.
 * * - Inheritance promotes an "is-a" relationship, where a subclass is a specialized version of a superclass.
 * - Composition allows for more flexibility and code reuse, as it enables the use of multiple classes without the constraints of a single inheritance hierarchy.
 * - It also helps in reducing tight coupling between classes, making the code more maintainable and easier to understand.
 * - Example of Composition:
 * *         class Engine {
 * *             void start() {
 * *                 System.out.println("Engine started.");
 * *             }
 * *         }
 * *         class Car {
 * *             private Engine engine; // Composition: Car has an Engine
 * *             Car() {
 * *                 engine = new Engine(); // Creating an instance of Engine
 * *             }
 * *             void start() {
 * *                 engine.start(); // Using the Engine's start method
 * *             }
 * *         }
 * *         public class Composition   
 * *         {
 * *             public static void main(String[] args) {
 * *                 Car car = new Car();
 * *                 car.start(); // Output: Engine started.
 * *             }
 * *         }
 * 
 * 
 */