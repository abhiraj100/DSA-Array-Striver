package com.array;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class St8_LinearSearch {

    public static int linearSearch(int [] arr,int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {6, 7, 8, 4, 1};
        System.out.println(Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num that you want to search in the array : ");
        int num = scanner.nextInt();

        int result = linearSearch(arr, num);
        System.out.println("The index of the search array is : " + result );
    }
}
