package com.linkedList.basics;

public class BasicsLLOperations {

    public Node head = null;
    public Node tail = null;
    public int size=0;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }



    //insert at first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
           head=newNode;
           tail=newNode;
           return;
        }

        newNode.next=head;
        head=newNode;
    }

    //insert at last
    public void addLast(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        Node current=head;

        while(current.next!=null){
current=current.next;
        }
        current.next=newNode;
    }

    //delete at first

    public void deleteFirst(){

        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }

//delete last
    public void deleteLast(){

        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
if(head.next==null){
    head=null;
    return;
}

Node lastNode=head.next;
Node secondLast=head;

while(lastNode.next!=null){
    lastNode=lastNode.next;
    secondLast=secondLast.next;
}
secondLast.next=null;
    }



    public static void main(String[] args) {

        BasicsLLOperations list = new BasicsLLOperations();
list.addFirst("A");
list.display();

        list.addFirst("B");
        list.display();

        list.addLast("C");
        list.display();

        list.addLast("K");
        list.display();

//        list.deleteFirst();
//        list.display();

        list.deleteLast();
        list.display();

        System.out.println(list.getSize());
    }

public int getSize(){
        return size;
}


    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        System.out.println("Adding nodes to start of the list");

        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");

    }
}
