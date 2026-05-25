import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the submission sorting algorithm");
        int[] salaries={20000,34000,56000,23000,90000};
        HeapSort.heapSort(salaries);
        System.out.println(Arrays.toString(salaries));
    }
}