package com.beyond.linkedlist.practice;


public class SinglyLinkedList<E> implements List<E> {
    // 연결 리스트 첫번째 노드를 가리키는 참조
    private Node<E> head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void addFirst(E element) {
        // 새로운 노드 생성
        Node<E> newNode = new Node<>(element);

        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    @Override
    public void addLast(E Element) {
        Node<E> newNode = new Node<>(Element);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> lastNode = search(size-1);
            lastNode.next = newNode;
        }
        size++;
    }

    @Override
    public void add (int index, E element){
        if (index < 0|| index>=size){
            throw new IndexOutOfBoundsException();
        }else if(index == 0){
            this.addFirst(element);
        }else  {
            Node<E> newNode = new Node<>(element);
            Node<E> prevNode = search(index-1);

            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;

    }

    @Override
    public E get (int index){
        Node<E> getNode = search(index);
        return getNode.data;

    }

    @Override
    public int size () {
        return size;
    }

    @Override
    public boolean contains (E element){
        Node<E> currentNode = head;

        while (currentNode != null){
            if(currentNode.data.equals(element)){
                return true;
            }
            currentNode =  currentNode.next;
        }
        return false;
    }

    @Override
    public void removeFirst () {
        if(head != null){
            Node<E> firstNode = head;
            head = firstNode.next;
            firstNode.data = null;
            firstNode.next = null;
            size--;
        }
    }

    @Override
    public void removeLast () {
        if(head != null){
            if((size - 2) < 0){
                removeFirst();
            }else{
                Node<E> lastPrevNode = search(size-2);
                lastPrevNode.next.data = null;
                lastPrevNode.next.next = null; // 어짜피 라스트 노드의 next는 null임
                lastPrevNode.next = null;
                size--;
            }
        }
    }

    @Override
    public void remove (int index){

        if(index < 0 | index>= size){
            throw new IndexOutOfBoundsException();

        }else if(index == 0){
            removeFirst();

        } else if (index == (size-1)) {
            removeLast();

        } else{
            Node<E> prevNode = search(index-1);
            Node<E> targetNode = prevNode.next;

            prevNode.next = targetNode.next;
            targetNode.data = null;
            targetNode.next = null;
            size--;
        }

    }

    @Override
    public void remove (E element){
        Node<E> currentNode = head;

        if(currentNode != null){
            if(currentNode.data.equals(element)){
                removeFirst();
            }else{
                for (int i = 0; i < size - 1; i++) {
                    if(currentNode.next.data.equals(element)){
//                        Node<E> targetNode = currentNode.next;
//
//                        currentNode.next = targetNode.next;
//                        targetNode.data = null;
//                        targetNode.next = null;
//
//                        size--;
//                        break;
                        remove(i+1);
                        break;
                    }

                    currentNode = currentNode.next;
                }
            }
        }
    }

    private Node<E> search (int index) {
        Node<E> currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    @Override
    public String toString () {
        Node<E> currentNode = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        while (currentNode != null) {
            if (currentNode.next == null) {
                sb.append(currentNode.data);
                break;
            }
            sb.append(currentNode.data).append(", ");
            currentNode = currentNode.next;
        }

        sb.append("]");
        return sb.toString();
    }

    // 내부 클래스
    private static class Node<E> {
        // 노드가 저장하는 데이터
        private E data;

        //다음 노드를 가리키는 참조
        private Node<E> next;

        public Node(E date) {
            this.data = date;
            this.next = null;
        }
    }
}
