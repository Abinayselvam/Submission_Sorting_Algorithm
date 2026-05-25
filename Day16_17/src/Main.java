import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the submission sorting algorithm");

        int[] productPrices = {450, 1200, 300, 750, 150, 900};

        System.out.println("Before Sorting:");

        QuickSort.quickSort(productPrices, 0, productPrices.length - 1);
        System.out.println(Arrays.toString(productPrices));
    }
}