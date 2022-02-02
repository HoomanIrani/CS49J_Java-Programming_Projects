///////////////////////
// Houman Irani
// CS49J
// 09/24/2020
// This application ask a user an integer and it will show them smaller prime numbers.
//////////////////////

import java.util.Scanner;

public class P6_5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter an integer number: ");

        int nPrimeNumber = in.nextInt();

        PrimeGenerator myObj = new PrimeGenerator(nPrimeNumber);

        System.out.println("Prime numbers up to " +nPrimeNumber);

        myObj.nextPrime(nPrimeNumber);

    }
}

