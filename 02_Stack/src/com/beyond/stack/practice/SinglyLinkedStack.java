package com.beyond.stack.practice;

public class SinglyLinkedStack<E> implements Stack<E> {
    private int size;

    // 제일 위에 있는 노드를 가리킴
    private Node<E> top;

    public SinglyLinkedStack() {
        this.size = 0;
        this.top = null;
    }

    @Override
    public void push(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = top;
        top = newNode;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public E pop() {
        Node<E> removeNode = top;
        top = top.next;
        size--;
        return removeNode.data;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public String toString() {
        Node<E> currentNode = top;
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        while (currentNode != null) {
            // 1번 인덱스에 계속해서 값을 넣음
            sb.insert(1,currentNode.data + ", ");

            currentNode = currentNode.next;
        }

        if(sb.lastIndexOf(",") != -1){
            sb.replace(sb.lastIndexOf(","),sb.length(),"");
        }

        sb.append("]");
        return sb.toString();
    }

    private static class Node<E>{
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
}
