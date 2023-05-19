package com.linkedList.basics.basicsoperations;

public class Main {
    public static void main(String[] args) {
        BasicsOperations op=new BasicsOperations();

        System.out.println("Insert at first");
        op.addFirst(20);
        op.addFirst(40);
        System.out.println(op.size);
        op.display();
        System.out.println("Insert at last");
        op.addLast(100);
        op.display();
        System.out.println("Insert at first");
        op.addFirst(0);
        op.display();
        System.out.println(op.size);
        System.out.println("Insert at index");
        op.insert(120,4);
        op.display();
        op.insert(200,2);
        op.display();
        System.out.println(op.size);
        System.out.println("Delete at first");
        System.out.println(op.deleteFirst());
        op.display();
        System.out.println("Delete at last");
        System.out.println(op.size);
        System.out.println( op.deleteLast());
        op.display();
        op.insert(5,0);
op.display();
        System.out.println(op.delete(4));
        op.display();
        System.out.println(op.find(200));
    }}
