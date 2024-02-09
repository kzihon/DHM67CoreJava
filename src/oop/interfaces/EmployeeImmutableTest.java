package oop.interfaces;

import java.util.Arrays;

public class EmployeeImmutableTest {
    public static void main(String[] args) {
        EmployeeImmutable immutable1=new EmployeeImmutable("Jack",79,"1000N 83 ST, San Jose, CA");
        EmployeeImmutable immutable2=new EmployeeImmutable("Kally",45,"900 9 ST, Des monies, IA");
        System.out.println(immutable1.toString());
        System.out.println(immutable2.toString());
        System.out.println();
        int[] original = new int[]{12, 34, 12, 5};
        int[] res = removeDuplicate2(original);
        System.out.println("Original Array: " + Arrays.toString(original));
        System.out.println("Non Duplicate Array: " + Arrays.toString(res));
    }


    public static int[] removeDuplicate2(int[] arr) {
        int[] arr2 = new int[arr.length];
        int counter = 1;
        int i = 1;
        arr2[0] = arr[0];
        while (i < arr.length) {
            int j = i - 1;
            boolean duplicate = false;
            while (j >= 0) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
                j--;
            }
            if (!duplicate) {
                arr2[counter++] = arr[i];
            }
            i++;
        }

        int[] noDup = new int[counter];
        for (int k = 0; k < counter; k++) {
            noDup[k] = arr2[k];
        }

        return noDup;
    }


    public static int[] removeDuplicate(int[] arr) {
        int[] arr2 = new int[arr.length];
        int counter = 0;
        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            boolean dup = false;
            while (j < arr.length) {
                if (arr[i] == arr[j]) {
                    dup = true;
                    break;
                }
                j++;
            }
            if (!dup) {
                arr2[counter++] = arr[i];
            }
            i++;
        }

        int[] noDup = new int[counter];
        for (int k = 0; k < counter; k++) {
            noDup[k] = arr2[k];
        }

        return noDup;
    }


}
