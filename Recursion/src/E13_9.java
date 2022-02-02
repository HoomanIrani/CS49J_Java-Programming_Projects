//////////////////////////////
//
// Houman Irani
// CS49J
// 10/21/2022
// This application asks user to enter a text and then returns starting position of matches str.
//
/////////////////////////////



import java.util.Scanner;


public class E13_9 {


    public static int indexOf (String text, String str) {

        return indexOf(text, str, 0);

    }


    public static int indexOf(String text, String str, int firstIndex) {


        if (text.length() < str.length()) {
            return -1;
        }


        else if (text.substring(0, str.length()).equals(str)) {

            return firstIndex;

        }

        
        else {

            return indexOf(text.substring(1), str, firstIndex + 1);
        }

    }



    public static void main(String[] args)  {


        Scanner in = new Scanner(System.in);

        String text, str1;


        System.out.print("Your text: ");
        text = in.next();
        System.out.print("Substring: ");
        str1 = in.next();
        int index = indexOf(text, str1);

        if (index == -1) {

            System.out.println(" Not a substring");
        }

        else  {

            System.out.println("The first index of substring: " +  index);

        }

    }

}