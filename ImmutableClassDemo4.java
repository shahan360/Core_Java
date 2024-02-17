class Age
{
    int day, month, year;
    public void setDay(int day)
    {
        this.day = day;
    }
    public int getDay()
    {
        return day;
    }
    public void setMonth(int month)
    {
        this.month = month;
    }
    public int getMonth()
    {
        return month;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public int getYear()
    {
        return year;
    }
}

final class Student
{
    final int rollNo;
    final String name;
    final Age age; //has-a relationship
    public Student(int rollNo, String name, Age age)
    {
        this.rollNo = rollNo;
        this.name = name;
        // this.age = age; //pass by reference
        Age cloneAge = new Age();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age = cloneAge; //pass by value
    }
    public int getRollNo()
    {
        return rollNo;
    }
    public String getName()
    {
        return name;
    }
    public Age getAge()
    {
        // return age; //pass by reference
        // Age cloneAge = new Age();
        // cloneAge.setDay(age.getDay());
        // cloneAge.setMonth(age.getMonth());
        // cloneAge.setYear(age.getYear());
        // return cloneAge; //pass by value
        return age;
    }
}

public class ImmutableClassDemo4 {
    public static void main(String[] args) {
        System.out.println("creating age object of Age class");
        Age age = new Age();
        age.setDay(15);
        age.setMonth(1);
        age.setYear(1992);
        System.out.println("creating student object of Immutable Student class and passing age object in constructor");
        Student student = new Student(1, "Alex", age);
        System.out.println("Alex age year before modification = " + student.getAge().getYear());
        age.setYear(1993);
        // student.getAge().setYear(1993);
        System.out.println("Alex age year after modification = " + student.getAge().getYear());
    }
}
