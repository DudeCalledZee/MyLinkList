package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.insert("One");
        myLinkList.insert("two");
        myLinkList.insert("three");
        myLinkList.insert("five");
        myLinkList.insert("six");
        myLinkList.insertAtStart("Zero");
        myLinkList.insertAt(4,"four");
        myLinkList.insertAt(4,"four");
        myLinkList.show();
        System.out.println("------------------------------------------------");
        myLinkList.deleteAt(4);
        myLinkList.show();


     }
}
