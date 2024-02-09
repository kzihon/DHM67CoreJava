package collectionss;
class A<Chan,Li>{
    Chan c;
    Li l;
    public A(Chan c,Li l){
        this.c=c;
        this.l=l;
    }
    public Chan get(){
        return c;
    }
    public void put(Chan c, Li l){
        if(c instanceof String  && l instanceof String ){
            System.out.println((String) c+l);
        }
    }
}
public class TestGeneric {
    public static void main(String[] args) {
        A<String,String> c= new A<String,String>("Chn","li");
        System.out.println( c.get());;

    }
}
