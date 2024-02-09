//package dsa;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//class Node {
//    int data;
//  jpm.Node left, right;
//    public Node(int item)
//    {
//        data = item;
//        left = right = null;
//    }
//}
//class BalancedTree{
//    jpm.Node root;
//
//    public BalancedTree(jpm.Node root) {
//        this.root = root;
//    }
//    LinkedList <jpm.Node> list=new LinkedList<>();
//    public  void addData(int data) {
//      jpm.Node newNode = new jpm.Node(data);
//
//        if (root == null) {
//            root = newNode;
//        } else {
//            Queue<jpm.Node> queue = new LinkedList<>();
//            queue.add(root);
//            list.add(root);
//
//            while (true) {
//               jpm.Node node = queue.remove();
//
//                if (node.left != null && node.right != null) {
//
//                    queue.add(node.left);
//                    queue.add(node.right);
//                    list.add(node.left);
//                    list.add(node.right);
//                }
//                else {
//                    if (node.left == null) {
//                        node.left = newNode;
//                        queue.add(node.left);
//                        list.add(node.left);
//
//                    } else {
//                        node.right = newNode;
//                        queue.add(node.right);
//                        list.add(node.right);
//
//                    }
//                    break;
//                }
//            }
//        }
//    }
//    int count=0;
//    public void find(int val, jpm.Node root){
//
//         if(root.data==val) {
//             System.out.println(root.left.data);
//             System.out.println(root.right.data);
//
//             return;
//         }
//       if(root.left!=null){
//           count++;
//           find(val, root.left);
//       }
//       if(root.right!=null){
//           count++;
//            find(val,root.right);
//       }
//
//    }
//    public  void sibilings(int size,int val, int[] values){
//        for(int i=0;i<size;i++){
//            addData(values[i]);
//        }
//
//        for (jpm.Node x:list){
//            System.out.print(x.data+" ");
//        }
//       // System.out.println(list);
//        find(val,root);
//       // System.out.println( ((2*count)+1 )+" "+ ((2*count)+2));
//    }
//
//}
//public class ebay {
//    public static void main(String[] args) {
//        BalancedTree bt=new BalancedTree(null);
//        int[] arr={1,2,3,4,5};
//        int size=arr.length;
//        int val=1;
//        bt.sibilings(size,val,arr);
//    }
//}
