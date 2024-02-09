package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class median {
    public static void medianPrice1(int[]arr, int mid){
        Arrays.sort(arr);
        int before=0;
        int after=0;
        for(int i=0;i<arr.length;i++){
            if((i==arr.length-1)&&(arr[i]<mid)){

                     before=mid-arr[i];
                     after=Integer.MAX_VALUE;

            }
            if(arr[i]==mid){
               int beforeInd=i;
               int afterInd=i;
                break;
            } else if (arr[i]>mid) {
                int beforeInd=i-1;
                int afterInd=i;
                if(beforeInd>=0){
                    before=mid-arr[beforeInd];
                }else{
                    before=Integer.MAX_VALUE;
                }
                after=arr[afterInd]-mid;
                break;
            }
        }
        System.out.println(Math.min(before,after));

    }
    public static void medianPrice(int[]arr, int mid){
//        int minMoves=0;
//        ArrayList<Integer> list=new ArrayList<>();
//        PriorityQueue<Integer>pq1=new PriorityQueue<>();
//        PriorityQueue<Integer>pq2= new PriorityQueue<>(Comparator.reverseOrder());
//
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>=mid){
//                pq2.add(arr[i]);
//            }else {
//                pq1.add(arr[i]);
//            }
//        }
//        int before=0;int after=0;
//        if(!pq1.isEmpty()){
//            pq1.add()
//        }
//        list.sort(Comparator.naturalOrder());
//        int i=list.indexOf(mid);
//        int before=list.indexOf(mid-1);
//        int after=list.indexOf(mid+1);
//        int diff1=i-before;
//        int diff2=after-i;
//        if(diff1<diff2){
//            minMoves=diff1;
//        }else {
//            minMoves=diff2;
//        }
//
//        System.out.println("minmoves: "+minMoves);


    }
    public static void main(String[] args) {

        int []arr= {4, 2, 1, 4, 7};
        int []arr2= {1,2,3};
        int midian=5;
        medianPrice1(arr,midian);
    }
}
