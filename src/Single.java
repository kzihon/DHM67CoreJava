public class Single {
    int a;
    private  Single(){
        a=30;
    }
    public static Single factory(){
        Single single= new Single();
        return single;
    }
}
