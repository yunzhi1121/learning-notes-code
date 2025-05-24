package com.yunzhi.java07.SingleLinkedList;

public class SingleLinkedList<E> {
    private int size;
    private Node<E> first;
    public SingleLinkedList(){}

    public int getSize() {
        return size;
    }

    public void add(E data){
        // 需要判断是否为空链表
        if(first == null){
            first = new Node<E>(data, null);
            size++;
            return;
        }
        // 封装为方法
        Node<E> last = findLast();
        last.next = new Node<E>(data, null);
        size++;
    }
    public void add(int index, E data){
        if(index >= size || index < 0){
            return;
        }
        Node<E> newNode = new Node<>(data, null);   // 钻石方法
        Node<E> pre = node(index - 1);
        newNode.next = pre.next;
        pre.next = newNode;
        size++;
    }
    public void remove(int index){
        if(index >= size || index < 0){
            return;
        }
        // 假如删除的是头结点
        if (index == 0) {
            Node<E> oldFirst = first;
            first = first.next;
            oldFirst.next = null;
            size--;
            return;
        }
        // 假如删除的不是头结点
        Node<E> current = node(index - 1);
        Node<E> removed = node(index);  // current.next
        current.next = removed.next;
        removed.item = null;
        removed.next = null;
        size--;
    }
    public void set(int index, E data){
        if(index >= size){
            return;
        }
        Node<E> current = node(index);
        current.item = data;
    }
    public E get(int index){
        if(index >= size){
            return null;
        }
        return node(index).item;
    }

    // ===============工具方法===============
    private Node<E> findLast() {
        // 同时需要判断是否为空链表
        Node<E> last = first;
        while(last.next != null){
            last = last.next;
        }
        return last;
    }
    private Node<E> node(int index) {
        Node<E> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
}
