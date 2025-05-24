package com.yunzhi.java07.SingleLinkedList;

public class Node<E> {
    Node<E> next;
    E item;

    public Node(){

    }
    public Node(E item, Node<E> next){
        this.item = item;
        this.next = next;
    }
}
