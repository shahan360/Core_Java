/* In this program we are demonstrating composition in java. 
Composition is a design technique in java that is used to implement 
a has-a relationship between two classes. In composition, one class is 
a component of another class. In this program, we have two classes, Room 
and House. The Room class is a component class and the House class is a 
composite class. The House class has two objects of the Room class, bRoom, 
and dRoom. The House class has an instance variable area that stores the area 
of the house. The Room class has two instance variables, door, and area. 
The Room class has a constructor that initializes the instance variables 
and a method show that displays the values of the instance variables. 
The House class has a constructor that initializes the instance variables 
and creates objects of the Room class. The House class has a method display 
that displays the area of the house and calls the show method of the Room class 
to display the details of the bedroom and drawing room. In the main method, 
we create an object of the House class and call the display method to display 
the details of the house. */

class Room //component object
{
    int door, area; //instance variables of Room class
    public Room(int door, int area) //constructor of Room class
    {
        this.door = door; //this keyword is used to refer to the current object
        this.area = area; //this keyword is used to refer to the current object
    }

    public void show() //method of Room class
    {
        System.out.println("Door: " + this.door + " Area: " + this.area); //this keyword is used to refer to the current object
    }
}

class House //composite object
{
    int area; //instance variable of House class
    Room bRoom, dRoom; //instance variables of Room class 
    //composite object
    public House() //constructor of House class
    {
        area = 1000; //initializing the area of the house to 1000 sq. ft.
        bRoom = new Room(2, 200); //creating an object of Room class as bRoom, the Room class is a component object
        dRoom = new Room(1, 100); //creating an object of Room class as dRoom, the Room class is a component object
    }

    public void display() //method of House class
    {
        System.out.println("Area of this house is: " + area+" sq. ft."); //displaying the area of the house
        System.out.println("It has one bedroom with the following details:"); //displaying the details of the bedroom
        bRoom.show(); //calling the show method of Room class
        System.out.println("It has one drawing room with the following details:"); //displaying the details of the drawing room
        dRoom.show(); //calling the show method of Room class
    }
}

public class CompositionDemo { //main class
    public static void main(String[] args) { //main method
        House myHouse = new House(); //creating an object of House class
        myHouse.display(); //calling the display method of House class
    }
}
