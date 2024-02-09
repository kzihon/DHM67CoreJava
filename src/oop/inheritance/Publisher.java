package oop.inheritance;

public class Publisher extends Book{
    private String pName;
    private String address;

    public Publisher(){

    }
    public Publisher(String bookId, String name, double price, String pName, String address){
        super(bookId,name,price);
        this.pName=pName;
        this.address=address;

    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public Publisher show(){
        super.show();
        System.out.println("Publisher Name= "+this.pName);
        System.out.println("Publisher Address= "+ this.address);
        return this;
    }
}
