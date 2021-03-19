package com.company;

public class Task3 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 5, 7};
        int temp = a[0];
        a[0] = a[4];
        a[4] = temp;
    }
}
