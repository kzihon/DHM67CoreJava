package dsa;

import java.util.*;

public class JpMc {
    public static void reapeatedDigits(int lower,int  upper){//80 120
        int count=0;
        int collect=0;
        for(int i=lower; i<=upper;i++){
            List< Integer> list= new ArrayList<>();
            int j=i;
            while(j>0){
                Integer x=j%10;

                if(!list.contains(x)){
                    list.add(x);

                }else collect++;
                j=j/10;
            }
            if (collect>=1){
                count++;
            }

            collect=0;

        }
        int range=upper-lower+1;
        System.out.println("non repeated count: "+(range-count));
    }

   public static void balanced(String [] exp, int[] maxRep){
        int i=0;
        int j=0;
       List<String> unbala= new ArrayList<>();
        while (i< exp.length || j<maxRep.length){
            Stack<Character> stack= new Stack<>();
            String curr=exp[i];
            int rep=maxRep[j];

            for(int k=0;k<curr.length();k++){
                char c=curr.charAt(k);
                if(c=='<'){
                    stack.push(c);
                }else if(c=='>'){
                    boolean balanced= checkBalanced(stack,c,rep);
                    if(balanced==false){
                        unbala.add(curr);

                    }
                }
            }
            if(!stack.isEmpty()){
                unbala.add(curr);
            }


            i++;j++;
        }
       System.out.println("unbalanced: "+unbala);
   }
   public static boolean checkBalanced(Stack<Character> stack, Character c, int replaceNo){
       // int replaced=0;
       // boolean balanced=false;
        if(!stack.isEmpty() && stack.peek()=='<' && c=='>'){
            stack.pop();
            return true;
        } else if (replaceNo>0) {
           return true;
        }
        return false;

   }

   public static void maxIndex(int n, int b){

        int x= Integer.MAX_VALUE;
        int k=1;
        int i=0;
        int j=1;
        while (k<=n){
            if((i+j)!=b){
                i=i+j;
            }
            j++;
            k++;
        }
       System.out.println("Max num of steps "+i);

   }
    public static void main(String[] args) {
      maxIndex(4,6);
//        reapeatedDigits(80,120);
//       String[] exp={"<<>>>","<<<<<<<>","<><>",">>","<<>","><><"};
//        int[] rep={0,1,2,2,2,2};
//        balanced(exp,rep);
      //  bal(exp,rep);
        cardinality(8);
    }
    private static int cardinalityEasy(int num){
        return Integer.bitCount(num);
    }
    public static void cardinality(int n){
      //  Map<Integer,Integer> map=new TreeMap<>();
        int[] a=new int[n];
        List<Integer> sorted=new ArrayList<>();
        for(int l=0;l<n;l++){
            int x=l+1;
            StringBuilder b=new StringBuilder("");
            while (x>=1){
                int rem=x%2;
                b.append(rem);
                x=x/2;
            }
            int count=0;
            for(int i=0;i<b.length();i++){
                if(b.charAt(i)=='1'){
                    count++;
                }
            }
            a[l]=count;
        }
        int []a2= new int[n];
        Integer.bitCount(6);
        for(int i=0;i<a.length-1;i++){

            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){

                    a2[i]=j+1;
                    a2[j]=i+1;
                }else if(a[i]<a[j]){
                    a2[i]=i+1;
                    a2[j]=j+1;
                }
                else if(a[i]==a[j]){
                    a2[i]=i+1;

                }
            }

        }
        System.out.println(Arrays.toString(a2));

    }
    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static void bal(String [] exp, int[] maxRep){
        List<String> unbal=new ArrayList<>();
        for(int i=0,j=0; i<exp.length && j<maxRep.length;i++,j++){
            String x=exp[i];
            int y=maxRep[i];
            Stack<Character> stack= new Stack<>();

            for(int k=0;k<x.length();k++){
                char c= x.charAt(k);
                if(c=='<'){
                    stack.push(c);
                }else if(!stack.isEmpty() && stack.peek()=='<') {
                           stack.pop();
                }else if(y>0){
                    y--;
                }else stack.add('>');

            }
            if(!stack.isEmpty()){
                unbal.add(x);
            }
        }
        System.out.println(unbal);
    }


}
