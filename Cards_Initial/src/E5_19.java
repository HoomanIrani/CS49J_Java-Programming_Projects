//
// Houman Irani
// CS49J
// 09/15/2020
// This application asks user initials of cards and tell them it real name.
//


import java.util.Scanner;

public class E5_19  {

    public static void main(String[] args) {

        String notation;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the card notation: ");
        notation = in.nextLine();

        String upperNotation = notation.toUpperCase();

        Card myCard = new Card(upperNotation);

        System.out.println (myCard.getDescription());

    }

}

