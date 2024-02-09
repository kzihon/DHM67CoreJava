package jpm;

public class LinkedList {
    Node head;
    Node tail;
    static class Node{
        int data;
        Node next;
        public Node(int d){
            data=d;
            next=null;
        }
    }
    boolean isCircular(LinkedList list){
        Node head=list.head;
        Node curr=list.head.next;
        while (curr!=null){
            if(curr.next==null){
                return false;
            }else {
                if(curr==head){
                    return true;
                }
            }
            curr=curr.next;
        }
        return false;
    }
    public static LinkedList insert(LinkedList list,int data){

        Node new_node=new Node(data);
        new_node.next=null;
        if(list.head==null){
            list.head=new_node;
        }else if(list.head.next==null){
            list.head.next=new_node;
            new_node.next=list.head;
            list.tail=new_node;
        } else {
            list.tail.next=new_node;
            new_node.next=list.head;
            list.tail=new_node;


//            while (last.next!=null){
//                last=last.next;
//            }
//            last.next=new_node;
        }
    return list;
    }
}
