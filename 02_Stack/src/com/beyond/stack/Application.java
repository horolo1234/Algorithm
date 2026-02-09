package com.beyond.stack;

import com.beyond.stack.practice.ArrayStack;
import com.beyond.stack.practice.SinglyLinkedStack;
import com.beyond.stack.practice.Stack;


public class Application {
//    public static void main(String[] args) {
//        Stack<String> stack = new Stack<>();
//
//        System.out.println(stack);
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());
//        System.out.println();
//
//        stack.push("딸기");
//        stack.push("포도");
//
//        // pop() 메서드 테스트
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());
//        System.out.println();
//
//        // contains() 메서드 테스트
//        System.out.println(stack.contains("딸기"));
//        System.out.println(stack.contains("포도"));
//        System.out.println();
//
//        System.out.println(stack.peek());
//        System.out.println(stack);
//        System.out.println();
//    }

    public static void main(String[] args) {
        // ArrayStack 구현
        //ArrayStack<Object> stack = new ArrayStack<>(5);
       Stack<String> stack = new SinglyLinkedStack<>();


        stack.push("딸기");
        stack.push("포도");
        stack.push("복숭아");
        stack.push("키위");
        stack.push("바나나");

        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println();

        System.out.println(stack.contains("바나나"));
        System.out.println(stack.peek());

    }
}
