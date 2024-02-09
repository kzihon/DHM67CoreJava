package oop.inheritance;

public class Test {
    public static void main(String[] args) {
        Book book= new Book("001","The Four Agreement", 10.93);
        Author aa= new Author();
        Publisher pp=new Publisher();
        Book a1= new Author("001","The Four Agreement", 10.93,"Don Miguel Ruiz","USA");
        Book p1= new Publisher("001","The Four Agreement", 10.93,"Amber-Allen Publishing","1000 N, San Rafael, CA, USA");
        System.out.println("==================Book==================");
        book.show();
        System.out.println("===================Author===============");
        a1.show();
        System.out.println("===================Publisher=============");
        p1.show();
        System.out.println("++++++++aaaaa Super++++=");
        aa.show();
        System.out.println("pub");
        pp.show();
    }
}
