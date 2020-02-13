package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.insertAtEnd("One");
        myLinkList.insertAtEnd("two");
        myLinkList.insertAtEnd("three");
        myLinkList.insertAtEnd("five");
        myLinkList.insertAtEnd("six");
        myLinkList.insertAtStart("Zero");
        myLinkList.insertAtIndex(4,"four");
        myLinkList.insertAtIndex(4,"four");
        myLinkList.show();
        System.out.println("------------------------------------------------");
        myLinkList.deleteAt(4);
        myLinkList.insertAtEnd("END");
        myLinkList.show();
        Object one = myLinkList.array().get(1);
        System.out.println("------------------------------------------------");
        System.out.println(one);
        System.out.println("------------------------------------------------");
        myLinkList.find("Zero");



     }
}
