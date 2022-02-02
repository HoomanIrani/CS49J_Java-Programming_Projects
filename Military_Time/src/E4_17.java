/*
 * Houman Irani
 * CS49J
 * 09/15/2020
 * This program asks user to enter 2 military time and tell the difference.
 */

import java.util.Scanner;

public class E4_17 {

    public static void main (String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the first time: ");
        int nMilitaryTime1 = in.nextInt();

        System.out.print("Please enter the second time: ");
        int nMilitaryTime2 = in.nextInt();

        int nHour1 = nMilitaryTime1 / 100;
        int nMinute1 = nMilitaryTime1 % 100;

        int nHour2 = nMilitaryTime2 / 100;
        int nMinute2 = nMilitaryTime2 % 100;

        int nMinDiff = 0;
        int nTimeDiff = 0;
        final int DAY_TIME = 24;
        final int MIN_ADJ = 60;


        if(nHour2 > nHour1 && nMinute1 > nMinute2) {

            nTimeDiff = (nHour2 - nHour1) - 1;

        }

        else if(nHour2 >= nHour1 && nMinute2 >= nMinute1) {

            nTimeDiff = nHour2 - nHour1;
        }

        else if(nHour1 > nHour2 && nMinute1 > nMinute2) {

            nTimeDiff = (nHour2 - nHour1) + DAY_TIME - 1;
        }
        else if(nHour1 > nHour2 && nMinute2 >= nMinute1) {

            nTimeDiff = (nHour2 - nHour1) + DAY_TIME;
        }

        if(nMinute2 >= nMinute1) {

            nMinDiff = nMinute2 - nMinute1;

        }

        else {

            nMinDiff = ((nMinute2 - nMinute1) + MIN_ADJ);

        }

        System.out.println (nTimeDiff + " Hours " + nMinDiff + " Minutes");


    }
}