package oop.agreegationVScomposiotion;

public class Car {
    String name;
    float price;
    Engine engine;
    public Car(){}

    //Aggrigation
    public Car(String name, float price,Engine engine){//engine exist prior to this car object creation, the engine is not created on
        // the body of this class. The contained object is initialize with the reference. it is outside the scope of the parent
        this.engine=engine;
        this.name=name;
        this.price=price;
    }

    //Compositon
    public Car(String name, float price){
        this.name=name;
        this.price=price;
        this.engine=new Engine(23,600);
    }//contiand object reference will not be taken form outside, rather it is created inside the constructor, so it's highly integral with that object
    //engine will be destroid when car is destroed. it is inside the scope of the parent
}
