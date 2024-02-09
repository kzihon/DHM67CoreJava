package oop;

//import static java.lang.System;
import static java.lang.System.out;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       // out.println();
//        Employee employee1 = new Employee();
//        Employee employee2= new Employee("Jack",44,8000);
//        Employee.getCount();
//        employee1.getEmployee();
//        employee2.getEmployee();



//        int i=0;
//        while (i<2){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("\nEnter your full name: ");
//            String name= scanner.nextLine();
//            nameSplitter(name);
//            i++;
//        }
       // nameSplotter2();

        String[] unsorted= {"abs","lala","bbc","ckd","bba","slk"};

        out.println(Arrays.toString(sorted(unsorted)));

    }
public static void nameSplotter2(){
    Scanner scanner1 = new Scanner(System.in);
    out.println("\nEnter your full name: ");
    String name1= scanner1.nextLine();
    int first=0;
    int second=0;
    int third=0;
    int[] arr1= new int[2];
    int i=0;
    int space=0;
    while(i<name1.length()){
        if(name1.charAt(i)==' '){
            out.println("space= "+i);
            arr1[space++]=i;
        }
        i++;
    }
    String firstName = name1.substring(0,arr1[0]);
    String middleName="";
    String lastName="";
    if(arr1[1]!=0){
        middleName = name1.substring(arr1[0]+1, arr1[1]);
        lastName=name1.substring(arr1[1]+1);
    }else {
        lastName=name1.substring(arr1[0]+1);
    }

    out.println("First name: "+firstName);
    out.println("middle name: "+middleName);
    out.println("last name: "+lastName);


//    for(int i=0;i<name1.length();i++){
//        if(name1.charAt(i)==' '){
//            second=i+1;
//            System.out.println("second "+second);
//            break;
//        }
//    }
//    for(int i=second;i<name1.length();i++){
//        if(name1.charAt(i)==' '){
//            third=i+1;
//            System.out.println("third "+third);
//            break;
//        }
//    }
//    String firstName = name1.substring(first,second-1);
//    String middleName="";
//    String lastName="";
//    if(third!=0){
//        middleName = name1.substring(second, third-1);
//        lastName=name1.substring(third);
//    }else {
//        lastName=name1.substring(second, name1.length());
//    }
//
//    System.out.println("First name: "+firstName);
//    System.out.println("middle name: "+middleName);
//    System.out.println("last name: "+lastName);


}
    public static void nameSplitter(String name){
        String[] names= name.split(" ");
        if(names.length==2){
            out.println("First name: "+ names[0]);
            out.println("Middle name:");
            out.println("Last name: "+names[1]);
        } else if (names.length==3) {
            out.println("First name: "+ names[0]);
            out.println("Middle name: "+ names[1]);
            out.println("Last name: "+names[2]);
        }
    }

    public static String[] sorted(String[] arr){
       // String[] sorted=new String[arr.length];
        for(int i=0;i< arr.length;i++){
            for(int j=i; j<arr.length;j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp="";
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    }
