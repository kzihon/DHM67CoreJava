package dsa;

import java.util.*;

public class PowerOfTwoBitwise {
    public static void pof2(int a){
        int result=a &(a-1);
        if (result==0){
            System.out.println(a +" is power of 2");
        }else System.out.println(a +" is not power of 2");
    }
    public static void oddOccurance(List<Integer> list){

        int res=0;
        for(int l : list){
            res^=l;
        }
        System.out.println("odd occurrence is " +res);
    }
    public static void sort0and1(int[] arr){
        int i=0;
        int j=arr.length-1;

        while (i<j){
            if(arr[i]==0 && arr[j]==0){
                i++;
            } else if (arr[i]==0 && arr[j]==1) {
                i++;
                j--;
            } else if (arr[i]==1 && arr[j]==0) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }else if (arr[i]==1 && arr[j]==1) {
                j--;
            }
        }
        System.out.println( Arrays.toString(arr));
    }
    public static void dutchFlack(int [] arr){
List<Integer> list= new ArrayList<>();
       Map<Integer,Integer> map= new TreeMap<>();
        for (int x:arr){
            if(!map.containsKey(x)){
                map.put(x,1);
            } else {
                int val= map.get(x);
                val=val+1;
                map.put(x,val);
            }
        }
        for(int x: map.keySet()){
            System.out.println(x+"->"+map.get(x));
        }
        System.out.println();
       // map.keySet().stream().sorted();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            for(int x=0;x<entry.getValue();x++){
                list.add(entry.getKey());
            }

        }
        System.out.println(list);
    }
    public static void evenOddSort(int[] arr){
        List<Integer> even= new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }else
                odd.add(arr[i]);
        }
        System.out.println(even);
        System.out.println(odd);
        for(int i=0;i<even.size()-1;i++){
            for(int j=i+1;j<even.size();j++){
                if(even.get(i)>even.get(j)){
                    int temp=even.get(j);
                    even.set(j,even.get(i));
                    even.set(i,temp);
                }

            }
        }
        for(int i=0;i<odd.size()-1;i++){
            for(int j=i+1;j<odd.size();j++){
                if(odd.get(i)>odd.get(j)){
                    int temp=odd.get(j);
                    odd.set(j,odd.get(i));
                    odd.set(i,temp);
                }

            }
        }
        for(int i=0;i<odd.size();i++){
            even.add(odd.get(i));
        }
        System.out.println(even);
    }
    public static void evenoddsrt(int[] arr){//{2,3, 5,4, 6,9, 11, 12}
        for(int i=0,j=-1;i<arr.length;i++){
            if(arr[i]%2<1){
                j++;
                swap(arr,i,j);
            }
        }
        for (int k:arr){
            System.out.print(k+" ");
        }

//        int i=0;
//        int j=0;
//        int k=arr.length-1;
//        while (i<k){
//            if(arr[i]==0){
//                swap(arr,i,j);
//                i++;j++;
//            } else if (arr[i]==2) {
//                swap(arr,i,k);
//                k--;
//            } else i++;
//        }
//        System.out.println(Arrays.toString(arr));
    }
    public static void sort012(int[] arr){//{2,0,1,2,1,0,2,1,0}
        int i=0;//{1,0,1,2,1,0,2,1,0}
        int j=0;
        int k=arr.length-1;
        while (i<k){
            if(arr[i]==0){
                swap(arr,i,j);
                i++;j++;
            } else if (arr[i]==2) {
                swap(arr,i,k);
                k--;
            } else i++;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void so(int[] arr){//{2,3, 5,4, 6,9, 11, 12}
        for(int i=0, j=0; i<arr.length;i++){
            if(arr[i]%2==0){

                swap(arr,i,j);
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void almostIncreasingSequence(int[] arr){
        //
        int i=0;
        int j=0;
        int swaps=0;

        while (i<arr.length-1){
            if(arr[i]>=arr[i+1]){
                swaps++;
            }i++;
        }

        if(swaps>1){
            System.out.println("Not strictly increasing");
        }else System.out.println("strictly increasing");
    }
    public static boolean canFormPalendrom(String str){

        int[] arr=new int[26];

        for (int i=0;i<str.length();i++){

            char chr= str.charAt(i);
            arr[chr-97]=arr[chr-97]+1;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                count++;
            }
        }
        if(count>1)
            return false;
        return true;

    }
    public static boolean ispalendrom(String str){
        int i=0;
        int j=str.length()-1;

        while (i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    public static void main(String[] args) {
       // pof2(6);
       // List<Integer> list = Arrays.asList(2,3,2,3,4,5,4,1,4);
      //  oddOccurance(list);
      //  int[] arr= new int[]{0,1,1,0,1,0,0,1,1};
      //  sort0and1(arr);
       // int[] arr2= new int[]{1,0,1,2,1,0,2,1,0};//,0,1,1,2,2};
        //Arrays.sort(arr2);
        //sort012(arr2);
        //System.out.println(Arrays.toString(arr2));
       // dutchFlack(arr2);
      // int []arr3 = new int []{2,3, 5,4, 6,9, 11, 12};
       int []arr= { 1, 3, 2,2};
        almostIncreasingSequence(arr);
      //  System.out.println(ispalendrom("nooon"));
        boolean x=canFormPalendrom("abbac");
        System.out.println(x);

       // ispalendrom("noon");
     //  evenOddSort(arr3);
    }
}
