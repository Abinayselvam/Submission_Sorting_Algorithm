import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the submission sorting algorithm");
        int[] score={70,40,35,100,39,90,30};
        SelectionSort.selectionSort(score);
        System.out.println(Arrays.toString(score));
    }
}