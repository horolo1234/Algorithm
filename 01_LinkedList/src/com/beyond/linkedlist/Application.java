package com.beyond.linkedlist;


import com.beyond.linkedlist.practice.List;
import com.beyond.linkedlist.practice.SinglyLinkedList;

public class Application {
    public static void main(String[] args) {
        // SinglyLinkedList 구현 테스트
      List<String> list = new SinglyLinkedList<>();

      // addFirst(), addLast(), add() 메서드 구현
        list.addFirst("사과");
        list.addFirst("딸기");
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println();

        list.addLast("포도");
        list.addLast("키위");

        list.add(2,"수박");

        //list.add(10,"복숭아");// IndexOutOfBoundsException 에러 발생

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.contains("포도"));
        System.out.println(list);
        System.out.println();

        // removeFirst(), removeLast(), remove() 메서드 구현
        //list.removeFirst();
        //list.removeFirst();
        //list.removeLast();
        //list.removeLast();
        //list.remove(2);

        list.remove("포도");
      list.remove("두리안");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();
    }
}
