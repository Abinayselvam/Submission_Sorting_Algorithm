import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the submission sorting algorithm");
        int[] ages = {17,14,25,20,43,35,26,13};
        CountingSort.countSort(ages);
        System.out.println(Arrays.toString(ages));
    }
}