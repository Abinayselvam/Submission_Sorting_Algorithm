import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the submission sorting algorithm");
        Students[] students={
                new Students(101,"Abi",471),
                new Students(102,"Shiv",482),
                new Students(103,"Rashika",484),
                new Students(104,"Roopa",409),
                new Students(105,"Suriya",411),
                new Students(106,"Kagul", 332)
        };
        BubbleSort.bubbleSort(students);
        System.out.println(Arrays.toString(students));

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