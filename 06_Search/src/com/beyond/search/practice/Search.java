package com.beyond.search.practice;


public class Search {
    public static int linearSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == target){

                return i;
            }
        }

        return -1;
    }

    // 배열에서 특정 숫자의 인덱스를 찾는 메서드
    public static int linearSearch(String str, char target){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }

    // 문자열에서 특정 문자의 인덱스를 찾는 메서드
    public static int minValue(int[] numbers){
        int min = numbers[0];
        for (int number : numbers) {
            if(number < min){
                min = number;
            }
        }
        return min;
    }

    // 배열에서 특정 숫자의 인덱스를 찾는 메서드(이진탐색, 반복문 사용)
    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            if(numbers[mid] == target){
                return mid;
            } else if (numbers[mid] < target) {
                left = mid +1;
            }else{
                right = mid - 1;
            }
        }

        return -1;
    }

    // 배열에서 특정 숫자의 인덱스를 찾는 메서드(이진탐색, 재귀호출 사용)
    public static int binarySearch(int[] numbers, int left, int right, int target){
        if(left <= right){
            int mid = (left + right) / 2;

            if(numbers[mid] == target){
                return mid;
            } else if (numbers[mid] < target) {
                return binarySearch(numbers, mid + 1, right, target);
            }else{
                return binarySearch(numbers, left, mid - 1, target);
            }
        }

    }

}
