package com.vtb.javacourses.lesson1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        printIntSign(0);
//        boolean q = isIntNegative(-8);
//        System.out.println(q);

//        inverseArray();
//        createArray();
//        checkArray();
//        fillDiagonal();
//        findArrayMinMax();
//        checkYear(1603);
    }

    //    Task1
    public static boolean checkSum(int a, int b) {
        return 10 <= (a + b) && (a + b) <= 20;
    }

    //    Task2
    public static void printIntSign(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    //    Task3
    public static boolean isIntNegative(int a) {
        return a <= 0;
    }

    //    Task4
    public static void printStringWithPrefix(String s) {
        System.out.println("Hello, " + s + "!");
    }

    //    Task5
    public static void inverseArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    //    Task6
    public static void createArray() {
        int[] arr = new int[8];
        for (int i = 0, k = 2; i < arr.length; i++, k += 3) {
            arr[i] = k;
        }
        System.out.println(Arrays.toString(arr));
    }

    //    Task7
    public static void checkArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //    Task8
    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }

        System.out.println(Arrays.deepToString(arr));

    }

    //    Task9
    public static void findArrayMinMax() {
        int[] arr = {5, 3, 2, 11, 4, 5, 4, 8, 9};
        System.out.println("max = " + Arrays.stream(arr).max().getAsInt());
        System.out.println("min = " + Arrays.stream(arr).min().getAsInt());
    }

    //    Task10
    public static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
    }

    //    Task11
    public static boolean checkBalance(int[] arr) {
//        int[] arr2 = {5, 2, 3};
        int sum = Arrays.stream(arr).sum();

        if (arr.length >= 2 && sum % 2 == 0) {
            int newsum = 0;
            for (int i = 0; i < arr.length; i++) {
                newsum = sum - arr[i];
                if (newsum == sum - newsum) {
                    return true;
                }
            }
        }
        return false;
    }
}
