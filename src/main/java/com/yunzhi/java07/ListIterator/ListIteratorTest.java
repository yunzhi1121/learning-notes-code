package com.yunzhi.java07.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);

        ListIterator<Integer> li = list.listIterator();
        while (li.hasNext()) {
            Integer i = li.next();
            if (i==2) {
                li.add(3);
            }
            System.out.println(i);
        }
        System.out.println(list);

    }
}
