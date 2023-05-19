package com.linkedList.basics.basicsoperations;

public class BasicsOperations {
    public Node head=null;
    public Node tail=null;
    int size=0;
BasicsOperations(){}
    BasicsOperations(int size){
        this.size=size;
    }
   class Node{
        int value;
        Node next;

      Node(int value){
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }

    //add node at first
    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;

        if(tail==null){
            tail=head;
        }
        size++;
    }

    //add node at last
    public void addLast(int data){
    if(head==null){
        addFirst(data);
        return;
    }
    Node newNode=new Node(data);

    tail.next=newNode;
    newNode=tail;
size++;
    }

    //add node at middle
    public void insert(int data, int index){
    if(index==0){
        addFirst(data);
        return;
    }
//    if(index==size){
//        addLast(data);
//        return;
//    }

    Node curr=head;

    for(int i=1;i<index;i++){
        curr=curr.next;
    }
        Node newNode=new Node(data);
   newNode.next=curr.next;
    curr.next=newNode;

    size++;


    }

    //delete at first
    public int deleteFirst(){
    int num=head.value;
    head=head.next;
    if(head==null){
        tail=null;
    }
    size--;
    return num;
    }

//delete at last
    public int deleteLast(){
    int value=tail.value;

    if(size<=1){
        return deleteFirst();
    }
    Node curr=head;

    for(int i=1;i<size-1;i++){
        curr=curr.next;
    }
    tail=curr;
    tail.next=null;
    size--;
    return value;
    }

    //delete from index
    public int delete(int index){
    Node curr=head;
if(index==0){
    return deleteFirst();
}

    for(int i=1;i<index;i++){
        curr=curr.next;
    }
    int value=curr.next.value;
curr.next=curr.next.next;
size--;
    return value;
    }

    //find
    public Node find(int index){
Node cur=head;
    while(cur!=null){
        if(cur.value==index){
            return cur;
        }
        cur=cur.next;
    }

return null;

    }


    //display linkedlist
    public void display(){
        Node temp=head;

        if(temp==null){
            System.out.println("List is empty");
        }

        while(temp!=null){
            System.out.print(temp.value+" => ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    }

