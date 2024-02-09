package oop.inheritance;

public class Author extends Book{
    private String aName;
    private String aPlace;

    public Author(){

        super();
    }

    public Author(String bookId, String name, double price, String aName, String aPlace) {
        super(bookId, name, price);
        this.aName = aName;
        this.aPlace = aPlace;
    }
    public void setaName(String aName){
        this.aName=aName;
    }
    public String getaName(){
        return aName;
    }

    public String getaPlace() {
        return aPlace;
    }

    public void setaPlace(String aPlace) {
        this.aPlace = aPlace;
    }

   @Override//Author is ''covariant'' of Book
    public Author show(){
        super.show();
       System.out.println("Author Name= "+this.aName);
       System.out.println("Author place= "+ this.aPlace);
       return this;
   }
}
