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

        Book[] book={
                new Book(1,"JackSparrow","Steafen",2000),
                new Book(4,"Subconsious","tean",300),
                new Book(6,"VigadaKavi","Thenali",2500),
                new Book(2,"Mahabharath", "Vyasar",5000),
                new Book(3,"Ponniyin Selvan","kalki",3000),
                new Book(5,"ParthibanKanavu","kalki",430)
        };
        MergeSort.mergeSort(book,0,book.length-1);
        System.out.println(Arrays.toString(book));

        int[] productPrices = {450, 1200, 300, 750, 150, 900};

        System.out.println("Before Sorting:");

        QuickSort.quickSort(productPrices, 0, productPrices.length - 1);
        System.out.println(Arrays.toString(productPrices));
        int[] score={70,40,35,100,39,90,30};
        SelectionSort.selectionSort(score);
        System.out.println(Arrays.toString(score));
    }
}