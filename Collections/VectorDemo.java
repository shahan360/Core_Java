import java.util.*; //importing this package to use Vector and Enumeration classes for this program

class VectorDemo //creating a class
{
    public static void main(String[] args) { //main method starts
        Vector v = new Vector<>(); //creating object v of Vector class
        v.addElement("A"); //adding elements to the vector using addElement method of Vector class
        v.add("B"); //adding elements to the vector using add method of Vector class which is different from addElement method in the sense that add method is used to add elements at a specific index
        v.add(1,"C"); //adding element C at index 1 using add method
        v.addElement("D"); //adding element D using addElement method as addElement method is used to add elements at the end of the vector
        v.addElement("A"); //adding element A using addElement method
        System.out.println("There are "+v.size()+" elements in the vector"); //printing the size of the vector using size method of Vector class
        Enumeration e = v.elements(); //creating object e of Enumeration class and using elements method of Vector class to get the elements of the vector v
        while(e.hasMoreElements()) //using hasMoreElements method of Enumeration class to check if there are more elements in the vector
        {
            System.out.println(e.nextElement()); //using nextElement method of Enumeration class to get the next element of the vector and printing it
        }
    }
}

/* The above program demonstrates the use of Vector class and Enumeration interface. 
Vector is a legacy class and is synchronized. It is similar to ArrayList but is synchronized. 
Enumeration is an interface which is used to get elements of a collection. 
It has two methods hasMoreElements and nextElement. hasMoreElements method is used to check if 
there are more elements in the collection and nextElement method is used to get the next 
element of the collection. */