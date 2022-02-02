import java.util.Scanner;


public class E4_17 {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the first time: ");
        int firstTime = keyboard.nextInt();

        System.out.print("Please enter the second time: ");
        int secondTime = keyboard.nextInt();

        int hour1, hour2, minutes1, minutes2, hour3 = 0, minute3 = 0;
        hour1 = firstTime / 100;
        hour2 = secondTime / 100;
        minutes1 = firstTime % 100;
        minutes2 = secondTime % 100;

        if(hour2 >= hour1 && minutes2 >= minutes1) {

           hour3 =  hour2 - hour1;
           minute3 = minutes2 - minutes1;

        }

        else if(hour1 > hour2 && minutes2 >= minutes1) {

             hour3 = hour2 - hour1 + 24;
             minute3 = minutes2 - minutes1;
        }

        else if(hour2 >= hour1 && minutes1 > minutes2) {

             hour3 = hour2 - hour1 - 1;
             minute3 = minutes2 - minutes1 + 60;
        }

        else if(hour1 > hour2 && minutes1 > minutes2) {

             hour3 = hour2 - hour1 + 23;
             minute3 = minutes2 - minutes1 + 60;
        }

        System.out.println(+ hour3 + " hours " + minute3 + " minutes");

    }
}
