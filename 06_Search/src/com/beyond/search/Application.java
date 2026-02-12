package com.beyond.search;

import com.beyond.search.practice.Search;

public class Application {
    public static void main(String[] args) {
        // 1. 선형 탐색
        int[] numbers= {13, 8, 5, 4, 9, 12};

        System.out.println(Search.linearSearch(numbers, 9));
        System.out.println(Search.linearSearch("hello world", 'e'));
        System.out.println(Search.minValue(numbers));

        // 이진탐색
        numbers = new int[]{2,3,5,9,12,15,30};
        System.out.println(Search.binarySearch(numbers, 30));

    }
}
