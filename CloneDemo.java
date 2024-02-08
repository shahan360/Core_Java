class Employee implements Cloneable
{
    int empid;
    String empname;
    int empsalary;
    public Employee(int empid, String empname, int empsalary)
    {
        this.empid=empid;
        this.empname=empname;
        this.empsalary=empsalary;
    }
    public void show()
    {
        System.out.println("Employee ID: "+empid+" Employee Name: "+empname+" Employee Salary: "+empsalary);
    }
    public Object clone() throws CloneNotSupportedException{
        Object o=super.clone();
        return o;
    }
}

class CloneDemo
{
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Creating some Employee class Objects");
        Employee e=new Employee(101,"Raj", 10000);
        Employee f=new Employee(102,"Ravi", 20000);
        if(e instanceof Cloneable){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println("Details of Object to be cloned");
        e.show();
        f.show();
        Employee g=(Employee)e.clone();
        Employee h=(Employee)f.clone();
        System.out.println("Details of Cloned Object");
        g.show();
        h.show();
    }
}