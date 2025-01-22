package assignment1_4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int maxNum = 0;
        int currentNum = 0;
        int[] interval = new int[2];
        System.out.println(interval.length);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many integers?");
        int[] integers = new int[sc.nextInt()];
        System.out.println("Insert the integers into the array: ");
        for (int i = 0; i < integers.length; i++) {
            integers[i] = sc.nextInt();
        }
        for (int i = integers.length-1; i >= 0; i--) {

            for (int j = 0; j <= i; j++) {

                for(int k = j; k <= i; k++){
                    currentNum += integers[k];
                }
                if(currentNum > maxNum){
                    maxNum = currentNum;
                    interval[1]=j;
                    interval[0]=i;
                }
                currentNum = 0;
            }
        }
        System.out.println("Sum:" + maxNum + "\n" + "Integers: " + (interval[1]+1) + "-" + (interval[0]+1));
    }
}
