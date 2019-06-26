package com.automationmentoring.homework6.LinkedList;

public class LinkedList {

    private Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

    }

    public static LinkedList add(LinkedList list, int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }

        return list;
    }

    public static LinkedList remove(LinkedList list, int index) {
        Node currentNode = list.head;
        Node previousNode = null;

        if (currentNode != null && index == 0) {
            list.head = currentNode.next;
            System.out.println(index + " position element deleted");
            return list;
        }

        int counter = 0;
        while (currentNode != null) {
            if (counter == index) {
                previousNode.next = currentNode.next;
                System.out.println(index + " position element deleted");
                break;
            } else {
                previousNode = currentNode;
                currentNode = currentNode.next;
                counter++;
            }
        }

        if (currentNode == null) {
            System.out.println(index + " element not found");
        }

        return list;
    }

    public static int get(LinkedList list, int index) {
        Node resultNode = list.head;

        int counter = 0;
        while (resultNode != null) {
            if (counter == index) {
                return resultNode.data;
            }
            counter++;
            resultNode = resultNode.next;
            if (resultNode == null) {
                System.out.println(index + " element not found");
            }
        }
        return resultNode.data;
    }

    public static void print(LinkedList list) {
        Node currentNode = list.head;
        System.out.println("Linked List: ");
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println("\n");
    }
}
