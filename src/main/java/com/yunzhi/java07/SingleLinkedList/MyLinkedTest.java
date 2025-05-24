package com.yunzhi.java07.SingleLinkedList;

public class MyLinkedTest {
    public static void main(String[] args) {
        // 创建一个单向链表对应的集合对象
        SingleLinkedList<String> myLinked = new SingleLinkedList<>();

        // 添加元素
        myLinked.add("zhangsan");
        myLinked.add("lisi");
        myLinked.add("wangwu");
        myLinked.add("zhaoliu");

        // 在指定位置添加元素
        myLinked.add(1, "李四");

        // 遍历
        for (int i = 0; i < myLinked.getSize(); i++) {
            System.out.println(myLinked.get(i));
        }
    }
}
