package assignment1_4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What size array?");
        int[] arr = new int[sc.nextInt()];
        int[] arr2 = new int[arr.length];
        System.out.println("Give me some integers, pretty please :)");

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int index = 0;
        boolean found = false;

        for (int i: arr){
            for (int j: arr2){
                if (i == j){
                    found = true;
                }
            }
            if (!found){
                arr2[index] = i;
                index++;
            }else{
                found = false;
            }
        }
        for(int i = 0; i < index; i++){
            System.out.println(arr2[i]);
        }
    }
}
