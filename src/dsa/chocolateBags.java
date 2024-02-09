package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class chocolateBags {
    public static void chocolarebag(int[] arr){
        int [][]a=new int[arr.length][8];
        int[]prof=new int [arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<a[0].length;j++){
                int col=j-prof[i];
                int row=i-1;
                Math.max((prof[i] +a[row][col]),a[i-1][j]);
            }
        }
        for(int i=arr.length-1;i>=0;i++){
            for(int j=a[0].length-1;j>=0;j++){
                int max=a[i][j];
                int up=a[i-1][j];
                if((max-up)==0){
                    break;
                }
              int rem= max- prof[i];
                int row=i-1;
                int fi1=row;
                int col=0;
                for(int k=0;k<a[i].length;k++){
                    if(a[i-1][k]==rem){
                        col=k;
                    }
                }
                while(a[row][col]==a[row-1][col]){
                    row-=1;
                }
                int fi2=row;
                List<Integer> fin=new ArrayList<>();
                fin.add(fi1);
                fin.add(fi2);
                System.out.println(fin);
            }
        }
        List<Integer> list1=new ArrayList<>();

            List<Integer>list2=new ArrayList<>();
        int sum= Arrays.stream(arr).sum();
        int half=0;
        if(sum%2==1){
            half=(sum/2)+1;
        }else half=sum/2;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>half){

                list1=new ArrayList<>();
                list1.add(i);
                list2=new ArrayList<>();
                list2.add(arr[i]);
                break;
            }
            for(int j=i+1;j<arr.length;j++){
              int sums=0;
                for(int k=0;k<list2.size();k++){
                    sums+=list2.get(k);
                }

            }
        }

    }


    public static void main(String[] args) {

    }
}
