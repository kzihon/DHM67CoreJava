package dsa;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class apple {
    public static void filter(double [] arr){
        double sum= Arrays.stream(arr).sum();
        double half=sum/2;
        int max=0;
        double currSum=0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i=arr.length-1;
        int filter=0;
        while(currSum<half && i>0){


            arr[i]=arr[i]/2;
            System.out.println(arr[i]);
            filter++;
            currSum=Arrays.stream(arr).sum();
            if(!(arr[i]>arr[i-1])){
                i--;
            }


        }
        System.out.println(filter);
    }
    public static void main(String[] args) {

      //  Double[] arr={5.0,19.0,8.0,1.0};
//        Double[] arr1={3.0,0.0,5.0};
//        filter1(arr1);
        int []arrival={1,3,3,5,7};
        int [] duration={2,2,1,2,1};
        maxEvents(arrival,duration);
    }
    public static void maxEvents(int[] arrival, int[] duration){
        int n= arrival.length;
        int i=0;
        int numevent=0;
        int dur=0;
        while (i<n){
            if(arrival[i]>=dur){
                numevent++;
                dur=arrival[i]+duration[i];

            }
          i++;
        }
        System.out.println("Maximum events held: "+numevent);
    }
    public static void filter1(Double [] arr){
        PriorityQueue<Double> queue=new PriorityQueue<>(Collections.reverseOrder());
        double sum=0;
        for(Double i:arr){
            queue.add( i);
            sum+=i;
        }
        System.out.println(sum);
        double half=sum/2;


        double currSum=sum;
        int filter=0;
        while (currSum>half){
            double x=queue.poll();
            x=x/2;
            currSum-=x;
            queue.add(x);
            filter++;
        }
        System.out.println(filter);
    }
}
