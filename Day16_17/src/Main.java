import java.util.Arrays;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the submission sorting algorithm");

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
    }

}