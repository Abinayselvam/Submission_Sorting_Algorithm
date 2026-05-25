public class Book {
    int bookId;
    String bookName;
    String authName;
    double price;
    public Book(int bookId,String bookName,String authName,double price)
    {
        this.bookId=bookId;
        this.bookName=bookName;
        this.authName=authName;
        this.price=price;
    }
    @Override
    public String toString()
    {
        return bookId+" || "+bookName+" || "+authName+" || "+price ;
    }
}
