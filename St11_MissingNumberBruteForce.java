package com.array;

public class St11_MissingNumberBruteForce {

    public static int findMissingNumber(int [] array, int n){
        for (int i = 1; i <= n ; i++) {
            int flag = 0;
            for (int j = 0; j < array.length ; j++) {
                if (array[j] == i){
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] array= {1, 2, 4, 6, 3, 8, 7};
        int n = 8; // Assuming the array should contain numbers from 1 to 8
        int missingNumber = findMissingNumber(array, n);

        System.out.println("The missing number is : " + missingNumber);
    }
}


/*
public class Main
{
    public static int findMissingNumber(int [] array){

        for(int i = 1; i <= array.length; i++){
            int flag = 0;
            for(int j = 0; j < array.length; j++) {
                if (array[j] == i){
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		int [] array = {1,2,5,8,7,4,3};
		int n = array.length;
		int missingNumber = findMissingNumber(array);
		System.out.println(missingNumber);
	}
}
 */