package com.yunzhi.java07.SingleLinkedList;

public class SingleLinkedList<E> {
    private int size;
    private Node<E> first;
    public SingleLinkedList(){}

    public void add(E data){
        Node<E> last = first;
        while(last.next != null){
            last = last.next;
        }
        last.next = new Node<E>(data, null);
        size++;
    }
    public void add(int index, E data){
        if(index >= size){
            return;
        }
        Node<E> current = first;
        while(index != 0 && index-1 != 0){
            current = current.next;
            index--;
        }
        current.next = new Node<E>(data, current.next.next);
        size++;
    }
    public void remove(int index){
        if(index >= size){
            return;
        }
        Node<E> current = first;
        while(index != 0 && index-1 != 0){
            current = current.next;
            index--;
        }
        current.next.item = null;
        current.next = current.next.next;
        current.next.next = null;
        size--;
    }
    public void set(int index, E data){
        if(index >= size){
            return;
        }
        Node<E> current = first;
        while(index != 0){
            current = current.next;
            index--;
        }
        current.item = data;
    }
    public E get(int index){
        if(index >= size){
            return null;
        }
        Node<E> current = first;
        while(index != 0){
            current = current.next;
            index--;
        }
        return current.item;
    }
}
