public class Employee {
    int empId;
    String  name;
    String role;
    double salary;
    public Employee(int empId,String name, String role,double salary)
    {
        this.empId=empId;
        this.name=name;
        this.role=role;
        this.salary=salary;
    }

    @Override
    public String toString()
    {
        return empId+" || "+name+" || "+role+"|| "+salary;
    }

}
