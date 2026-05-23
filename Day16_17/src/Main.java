import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the submission sorting algorithm");

        Employee[] employees={
                new Employee(1001,"use1","Dev",50000),
                new Employee(1005,"user5","Tester",20000),
                new Employee(1006,"user6","Tech",30000),
                new Employee(1002,"user2","SysAdmin",35000),
                new Employee(1004,"user4","HR",25000),
                new Employee(1003,"user3","Infra Admin",35000)
        };
        InsertionSort.insertionSort(employees);
        System.out.println(Arrays.toString(employees));
    }
}