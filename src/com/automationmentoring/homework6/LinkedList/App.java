package com.automationmentoring.homework6.LinkedList;

import static com.automationmentoring.homework6.LinkedList.LinkedList.add;
import static com.automationmentoring.homework6.LinkedList.LinkedList.get;
import static com.automationmentoring.homework6.LinkedList.LinkedList.print;
import static com.automationmentoring.homework6.LinkedList.LinkedList.remove;

public class App {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = add(list, 1);
        list = add(list, 2);
        list = add(list, 3);
        list = add(list, 4);
        list = add(list, 5);
        list = add(list, 6);
        list = add(list, 7);
        list = add(list, 8);
        list = add(list, 9);
        list = add(list, 10);
        print(list);
        remove(list, 2);
        remove(list, 5);
        print(list);
        System.out.println(get(list, 3));
        System.out.println(get(list, 5));
    }
}
