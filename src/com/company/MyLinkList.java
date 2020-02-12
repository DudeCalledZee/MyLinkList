package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class MyLinkList {
    Node headNode;

    public void insertAtEnd(String data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;

        if (headNode == null) {
            headNode = newNode;
        } else {
           Node tempNode = headNode;
           while (tempNode.nextNode != null) {
               tempNode = tempNode.nextNode;
           }
           tempNode.nextNode = newNode;
        }
    }

    public void show(){
        Node node = headNode;

        while(node.nextNode != null) {
            System.out.println(node.data);
            node = node.nextNode;
        }
        System.out.println(node.data);
    }

    public void insertAtStart(String data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;
        newNode.nextNode = headNode;
        headNode = newNode;
        }

    public void insertAtIndex(int index, String data) {
        if (index == 0) {
            insertAtStart(data);
        } else {
            Node newNode = new Node();
            newNode.data = data;
            newNode.nextNode = null;

            Node tempNode = headNode;
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.nextNode;
            }
            newNode.nextNode = tempNode.nextNode;
            tempNode.nextNode = newNode;
        }
    }

    public void deleteAt(int index) {
        if (index == 0){
            headNode = headNode.nextNode;
        } else {
            Node nodeToDelete =null;
            Node tempNode = headNode;
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.nextNode;
            }
            nodeToDelete = tempNode.nextNode;
            tempNode.nextNode = nodeToDelete.nextNode;
        }

    }

    public ArrayList array(){
        Node node = headNode;
        ArrayList<Node> arrayOfNodes = new ArrayList<>();
        while(node.nextNode != null) {
            arrayOfNodes.add(node);
            node = node.nextNode;
        }
        arrayOfNodes.add(node);
        return arrayOfNodes;
    }

}












