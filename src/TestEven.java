public class TestEven {
    public static void main(String[] args) {

       System.out.println(factorial(5));
       // System.out.println("IsPalendrome = "+isPalendrom("aha"));
    }
    public static boolean isPalendrom(String given){
        StringBuilder builder= new StringBuilder();
        for(int i=given.length()-1; i>=0;i--){
            builder.append(given.charAt(i));
        }
        boolean palendrome=false;
        String reversed= builder.toString();
        System.out.println("Given = "+given);
        System.out.println("Reversed = "+reversed);

        if(reversed.equalsIgnoreCase(given)){
            palendrome=true;
        }
        return palendrome;

    }
    public static int factorial(int n){

        if(n==0||n==1){
            return 1;
        } else if (n<0) {
            System.out.println("factorial can't be calculated");
        }
        int fact=1;
        for(int i=n; i>0;i--){
            fact= fact*i;
        }
        return fact;
    }
}
