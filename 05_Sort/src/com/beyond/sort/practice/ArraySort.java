package com.beyond.sort.practice;

public class ArraySort {
    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j;

            for (j = i - 1; j >= 0 && numbers[j] > key; j--) {
                numbers[j + 1] = numbers[j];
            }

            numbers[j + 1] = key;
        }
    }

    public static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];

                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    // 재귀 메소드
    // 작업 중에 자기 자신을 호출하는 것을 재귀 호출이라 하고, 재귀 호출을 하는 메소드를 재귀 매소드라고 한다.
    public static void mergeSort(int[] numbers, int left, int right) {
        // 분할할 부분이 남아 있는 경우
        if (left < right) {
            // 배열을 분할할 인덱스 계산
            int mid = (left + right) / 2;

            // 왼쪽 부분 배열 정렬
            mergeSort(numbers, left, mid);

            // 오른쪽 부분 배열 정렬
            mergeSort(numbers, mid + 1, right);

            // 정렬된 두 부분의 배열을 합치는 메소드
            merge(numbers, left, mid, right);
        }
    }

    private static void merge(int[] numbers, int left, int mid, int right) {
        // 임시 배열 생성
        int[] temp = new int[right - left + 1];

        // 왼쪽 배열의 시작 인덱스
        int i = left;

        // 오른쪽 배열의 시작 인덱스
        int j = mid + 1;

        // 임시 배열의 시작 인덱스
        int k = 0;

        // 두 배열의 요소들을 비교하여 임시 배열에 정렬하여 저장
        while (i <= mid && j <= right) {
            if (numbers[i] <= numbers[j]) {
                temp[k++] = numbers[i++];
            } else {
                temp[k++] = numbers[j++];
            }
        }

        // 왼쪽 배열에 남아 있는 요소가 있으면 임시 배열에 저장
        while (i <= mid) {
            temp[k++] = numbers[i++];
        }

        // 오른쪽 배열에 남아 있는 요소가 있으면 임시 배열에 저장
        while (j <= right) {
            temp[k++] = numbers[j++];
        }

        // 임시 배열의 요소들을 원래 배열에 저장
        for (k = 0; k < temp.length; k++) {
            numbers[left + k] = temp[k];
        }
    }
}