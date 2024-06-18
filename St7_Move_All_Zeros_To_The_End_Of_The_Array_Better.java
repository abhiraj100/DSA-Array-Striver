package com.array;
import java.util.Arrays;

public class St7_Move_All_Zeros_To_The_End_Of_The_Array_Better {


    public static int []  moveZerosToEnd (int [] arr){
//        int j = -1;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                j = i;
                break;
            }
        }

        // no non-zero elements :
        if (j == -1){
            return arr;
        }

        // Move the pointers i and j
        // and swap accordingly

        for (int i = j+1; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap arr[i] & arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }



    public static void main(String[] args) {
        int [] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        System.out.println(Arrays.toString(arr));

        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
