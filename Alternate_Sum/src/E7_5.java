
/////////
// Houman Irani
// CS49J
// 09/22/2020
// This application asks user how many number they want to enter and give them alternative sum of them.
/////////

import java.util.Scanner;

public class E7_5 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int nNumber;

        System.out.print("Enter number of inputs you would like to enter: ");
        nNumber = in.nextInt();

        int[] alt_num = new int[nNumber];

        for (int i = 0; i < nNumber; i++)  {

            System.out.print("Enter input " + (i + 1) + ": ");
            alt_num[i] = in.nextInt();

        }

        int sum = 0;

        for (int i = 0; i < alt_num.length; i++) {

            if (i % 2 == 0) {

                sum += alt_num[i];

            }

            else {

                sum -= alt_num[i];

            }

        }


        System.out.println("\nAlternate sum of your entries is: " + sum);

    }
}
