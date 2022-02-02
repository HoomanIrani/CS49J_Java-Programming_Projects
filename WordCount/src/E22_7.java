/////////////////////////
// Houman Irani
// CS 49J
// 11/30/2020
////////////////////////


import java.util.LinkedList;
import java.util.Scanner;



public class E22_7 {


    public static int WordCount;

    public static void main(String args[]) {

        System.out.print("Please Enter name of the file: ");
        Scanner keyboard = new Scanner(System.in);


        String[] files = keyboard.nextLine().split("[\n\r\t\b ]+");
        LinkedList<Thread> counters = new LinkedList<>();

        for(String file: files){

            counters.addLast(new WordCountRun(file));
        }

        for(Thread counter: counters) {

            counter.start();

        }

    }

}

