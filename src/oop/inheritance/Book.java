package oop.inheritance;

public class Book {
    private String bookId;
    private String name;
    private double price;

    public Book(){

    }
    public Book(String bookId, String name, double price){
        this.bookId=bookId;
        this.name=name;
        this.price=price;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Book show(){
        System.out.println("BookId = "+ this.bookId);
        System.out.println("Book Name = "+ this.name);
        System.out.println("Book Price = "+ this.price);

        return this;
    }
}
