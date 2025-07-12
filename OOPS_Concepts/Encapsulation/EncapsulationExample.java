/*Encapsulation in Java:
 * Encapsulation is a fundamental concept in object-oriented programming that restricts direct access to an object's data and methods.
 * It allows the internal representation of an object to be hidden from the outside, exposing only what is necessary.
 * This is typically achieved by using access modifiers (private, protected, public) and getter/setter methods.
 * Encapsulation helps in maintaining the integrity of the data and provides a clear interface for interaction with the object.
 * It also enhances code maintainability and flexibility by allowing changes to the internal implementation without affecting external code that uses the object.
 */

// Here we present a simple example of encapsulation in Java.
package OOPS_Concepts.Encapsulation;// Package declaration
public class EncapsulationExample {
    // Private fields
    private String name;
    private int age;

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name){
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Main method to demonstrate encapsulation
    public static void main(String[] args) {
        EncapsulationExample person = new EncapsulationExample();
        person.setName("John Doe");
        person.setAge(30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
    

/*
 * Access Modifiers Table:
 * | Modifier   | Class | Package |Subclass | World |
 * |------------|-------|---------|---------|-------|
 * | public     |   Y   |    Y    |    Y    |   Y   |
 * | protected  |   Y   |    Y    |    Y    |   N   |
 * | no modifier|   Y   |    Y    |    N    |   N   |
 * | private    |   Y   |    N    |    N    |   N   |
 * This table summarizes the visibility of class members based on the access modifiers used.
 * 
 * Access modifier descriptions:
 * - public: The member is accessible from any other class.
 * - protected: The member is accessible within its own package and by subclasses.
 * - no modifier (default): The member is accessible only within its own package.
 * - private: The member is accessible in the same package and subclasses in any outside package, but not in other classes.
 */