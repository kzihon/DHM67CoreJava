package dsa;

import java.util.*;

public class Jpmc1 {
    public static void maxProfit(int [] arr){

        int maxProf=0;
        int small=arr[0];
        int diff=0;
        for (int i=1;i<arr.length;i++){
            diff=arr[i]-small;
          if(diff>maxProf){
              maxProf=diff;
          }
          if(small>arr[i]){
              small=arr[i];
          }
        }
        System.out.println("max profit: "+maxProf);

    }


    public static void main(String[] args) {
        int[][] v = new int[][]{{2, 2}, {1, 2}, {3, 4}};
        //largestInRowSmallestInColum(v);
        maxProfit(new int[]{7,1,5,3,6,4});
    }

    public static void largestInRowSmallestInColum(int[][] arr) {

        int row = arr.length;
        int column = arr[0].length;
        int[] largestinrow = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            int m = Arrays.stream(arr[i]).max().getAsInt();
            Map<Integer, Integer> map = new Hashtable<>();
            List<Integer> cols = new ArrayList<>();

            int count = 0;
            for (int j = 0; j < column; j++) {
                if (arr[i][j] == m) {
                    cols.add(j);
                    count++;
                    map.put(j, arr[i][j]);
                }
            }

            if (count == 1) {
                for (int j = 0; j < cols.size(); j++) {
                    boolean exact = true;
                    int col = cols.get(j);
                    // int val=map.get(col);
                    int val = arr[i][col];
                    for (int k = 0; k < row; k++) {

                        if (val > arr[k][col]) {
                            exact = false;
                            break;
                        }
                    }
                    if (!exact) cols.remove(j);

                }

                for (Integer j : cols) {
                    System.out.println(arr[i][j]);
                }
            }

        }
    }
}
