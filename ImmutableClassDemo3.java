class Age
{
    int day,month,year;
    public void setDay(int day)
    {
        this.day=day;
    }
    public int getDay()
    {
        return day;
    }
    public void setMonth(int month)
    {
        this.month=month;
    }
    public int getMonth()
    {
        return month;
    }
    public void setYear(int year)
    {
        this.year=year;
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
        this.rollNo=rollNo;
        this.name=name;
        // this.age=age;
        Age cloneAge = new Age();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age=cloneAge;
    }
    public int getrollNo()
    {
        return rollNo;
    }
    public String getName()
    {
        return name;
    }
    public Age getAge()
    {
        return age;
    }   
}

public class ImmutableClassDemo3 {
    public static void main(String[] args) {
        System.out.println("Creating an object of Age class");
        Age age = new Age();
        age.setDay(15);
        age.setMonth(8);
        age.setYear(1990);
        System.out.println("Creating an object of Student class with age as one of its arguments");
        Student student = new Student(101, "Alex", age);
        System.out.println("Alex's age year before modification = " + student.getAge().getYear());
        age.setYear(1993);
        System.out.println("Alex's age year after modification = " + student.getAge().getYear());
    }
}
