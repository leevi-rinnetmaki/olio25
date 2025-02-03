package assignment3_4.task2;
import java.io.*;
import java.util.ArrayList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class Fibonacci {
    public static void main(String[] args) {
        ArrayList<Long> fibonacci = new ArrayList<>();
        fibonacci.add((long)0);
        fibonacci.add((long)1);

        long first = 0;
        long second = 1;
        long third = 0;

        for(int i=1 ; i<=59 ; i++){
            third = first + second;
            first = second;
            second = third;
            fibonacci.add(third);
            //System.out.println(i);
        }
        //System.out.println(fibonacci);

        try{
            //FileWriter writer = new FileWriter("olioOhjelmointi//src//assignment3_4//task2//fibonacci.csv");
            BufferedWriter writer = new BufferedWriter(new FileWriter("olioOhjelmointi//src//assignment3_4//task2//fibonacci.csv"));
            //writer.write(fibonacci.toString());


            /*
            for(Long fibo : fibonacci){
                writer.write(fibo.toString());
                writer.newLine();
            }

             */
            writer.write(fibonacci.toString());
            writer.flush();

        }catch(Exception e){
            System.out.println(e);
        }

        try{
            String line;
            BufferedReader reader = new BufferedReader(new FileReader("olioOhjelmointi//src//assignment3_4//task2//fibonacci.csv"));
            do{
                line = reader.readLine();
                System.out.println(line);
            }while(line!=null);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}