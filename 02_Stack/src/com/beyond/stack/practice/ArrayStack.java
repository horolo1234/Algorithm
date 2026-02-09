package com.beyond.stack.practice;

public class ArrayStack<E> implements Stack<E> {
    // 스택의 최상위 요소를 가리키는 인덱스
    private int top;

    // 스택의 최대 크기
    private int maxSize;

    //스택의 배열
    private E[] elements;

    public ArrayStack() {
        this(16);
    }

    public ArrayStack(int maxSize) {
        this.top = -1;
        this.maxSize = maxSize;
        this.elements = (E[]) new Object[maxSize];
    }

    @Override
    public void push(E element) {
        if (top == maxSize - 1){
            throw new StackOverflowError("스택이 가득 찼습니다.");
        }else{
            elements[++top] = element;
        }
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public E pop() {
        if (isEmpty()){
            throw new IllegalStateException("스택이 비어 있습니다.");
        }else{
            return elements[top--];
        }
    }

    @Override
    public boolean contains(E element) {
        for (int i = 0; i <= top; i++) {
            if(elements[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    @Override
    public E peek() {
        return elements[top];
    }

    @Override
    public void clear() {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <=top; i++) {
            if (i == top){
                sb.append(elements[i]);
                break;
            }
            sb.append(elements[i]).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

}
