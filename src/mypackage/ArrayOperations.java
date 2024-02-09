package mypackage;

import java.util.Arrays;
import java.util.Collections;

public class ArrayOperations {
  //1
  public static void largestThree(int[] arr){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int thrid=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int x=arr[i];
            if(x>first){
                thrid=second;
                second=first;
                first=x;
            }else if(x>second && x!=first){
                thrid=second;
                second=x;
            }else if(x>thrid && x!=second){
                thrid=x;
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(thrid);;

    }
    //2
    public static void secondLargest(Integer [] arr){
      int idx=0;
       Arrays.sort(arr, Collections.reverseOrder());
       for(int i=1;i<arr.length;i++){
           if(arr[0]!=arr[i]){
               idx=i;
               break;
           }
       }
        System.out.println("second largest= "+arr[idx]);
    }
//3
    public static void move0toback(int [] arr){
//int cont=arr.length-1;
        for (int i=0;i<arr.length-1; i++){
            if(arr[i]==0){
                if(arr[i+1]!=0){
                    arr[i]=arr[i+1];
                    arr[i+1]=0;
                }else {
                    for(int j=i+1;j<=arr.length-1;j++){
                        if(arr[j]!=0){
                            arr[i]=arr[j];
                            arr[j]=0;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void getNumSequence(String input){

        // String x="1";
        String [] arr=input.split(" ");
        System.out.println(Arrays.toString(arr));
        String[] concat= new String[arr.length];
        int count=0;

        for(int i=0;i<arr.length-1;i++) {
            try {
                String k = arr[i];
                String l = arr[i + 1];
//                if ((k.equals("1") || k.equals("2") || k.equals("3") || k.equals("5") || k.equals("6") || k.equals("-1") || k.equals("-2") || k.equals("-3")) &&
//                        (l.equals("1") || l.equals("2") || (l.equals("5") || l.equals("6") || l.equals("3") || l.equals("-1") || l.equals("-2") || l.equals("-3")))) {

                    int y = Integer.valueOf(arr[i]) - Integer.valueOf(arr[i + 1]);
                    if (y == -1) {
                        if (concat[count] == null) {
                            concat[count] = k;
                        }
                        concat[count] += arr[i + 1];
                    } else {
                        count++;
                    }
                } catch (Exception e){
                if (concat[count] != null && concat[count].length() >= 2) {
                    count++;
                }
                System.out.println("Not int");
                //count++;
            }
//            if (concat[count] != null && concat[count].length() >= 2) {
//                    count++;
//                }
            }


        for(String m:concat){
            if(m==null)
                break;
            System.out.println(m);
        }
    }

    public static void maxMin(int[] arr){
      int i=0;
      int j=arr.length-1 ;
      int[] arr2= new int[arr.length];
      int counter=0;
      while(i<j){
          arr2[counter++]=arr[j--];
          arr2[counter++]=arr[i++];
      }
      if(arr.length%2==1){
          arr2[arr.length-1]=arr[i];
      }
        System.out.println(Arrays.toString(arr2));
    }

    public static void getKthElement(int[] x){

    }

public static void sort(int[] arr){
      int start=0;
      int end=arr.length-1;

      while(start<end){
          if(arr[start]==1){
             // arr[]

          }
      }

}
    public static void main(String[] args) {
       // Integer[] arr = { 12, 45, 1, -1, 45, 54, 23, 5, 0, -10 };
      //  largestThree(arr);
       // secondLargest(arr);
       // int arr1[]  = {1, 2, 0, 0, 0, 3, 6};
       // move0toback(arr1);
       // int arr3[]  = {1, 2, 3,4,5, 6};
       // maxMin(arr3);
        String input="1 2 3 a 5 6 7 8 4 @ -3 -2 -1";
        getNumSequence(input);

  }
}
