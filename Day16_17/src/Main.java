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
    }
}